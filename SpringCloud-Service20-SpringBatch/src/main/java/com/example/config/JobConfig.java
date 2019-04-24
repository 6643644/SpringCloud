package com.example.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.support.DatabaseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.example.model.PUser;
import com.example.model.User;

@Configuration
@EnableBatchProcessing
public class JobConfig {

	// 使用預設提供方式
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	/**
	 * 作業倉庫
	 */
	@Bean
	public JobRepository jobRepository(DataSource dataSource, PlatformTransactionManager transactionManager)
			throws Exception {
		JobRepositoryFactoryBean jobRepositoryFactoryBean = new JobRepositoryFactoryBean();
		jobRepositoryFactoryBean.setDataSource(dataSource);
		jobRepositoryFactoryBean.setTransactionManager(transactionManager);
		jobRepositoryFactoryBean.setDatabaseType(DatabaseType.MYSQL.name());
		return jobRepositoryFactoryBean.getObject();
	}

	// 1.讀資料
	@Bean
	public ItemReader<User> reader(DataSource dataSource) throws UnexpectedInputException, ParseException, Exception {

		// 讀資料可以讀檔案、資料庫等，我這隻使用了讀取資料庫的方式
		JdbcCursorItemReader<User> itemReader = new JdbcCursorItemReader<User>();
		itemReader.setDataSource(dataSource);
		itemReader.setSql("select * from user");
		itemReader.setRowMapper(new BeanPropertyRowMapper<User>(User.class));
		ExecutionContext executionContext = new ExecutionContext();
		itemReader.open(executionContext);
		Object customerCredit = new Object();
		while (customerCredit != null) {
			customerCredit = itemReader.read();
		}

		itemReader.close();
		return itemReader;

	}

	// 2.處理資料
	@Bean
	public UserItemProcessor processor() {

		return new UserItemProcessor();
	}

	// 3.寫資料
	@Bean
	public UserItemWriter writer(JdbcTemplate jdbcTemplate) {
		// 自定義寫資料操作
		UserItemWriter writer = new UserItemWriter(jdbcTemplate);
		return writer;
	}

	@Bean
	public Job importJob(JobBuilderFactory jobs, @Qualifier("step1") Step s1) {
		return jobs.get("importJob").incrementer(new RunIdIncrementer()).flow(s1).end().build();
	}

	// 執行步驟
	@Bean
	public Step step1(StepBuilderFactory stepBuilderFactory, ItemReader<User> reader, UserItemWriter userItemWriter,
			ItemProcessor<User, PUser> processor) {
		return stepBuilderFactory.get("step1").<User, PUser>chunk(100) // 一次處理多少資料
				.reader(reader).processor(processor).writer(userItemWriter).build();
	}

}
