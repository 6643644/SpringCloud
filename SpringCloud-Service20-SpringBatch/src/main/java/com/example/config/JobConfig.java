package com.example.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.partition.support.MultiResourcePartitioner;
import org.springframework.batch.core.partition.support.SimplePartitioner;
import org.springframework.batch.core.partition.support.TaskExecutorPartitionHandler;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.core.step.builder.StepBuilder;
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
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.example.model.PUser;
import com.example.model.User;


/**
 * 1.建立JobRepository物件，該物件主要是寫入連線資訊
 * 2.建立reader讀取物件，該物件主要是讀取DB相關資訊並且回傳itemReader物件
 * 3.建立process處理物件，該物件主要是進行資訊處理的物件，可以參考UserItemProcessor類別的內容
 * 4.建立writer寫入物件，該物件進行DB存取作業
 * 5.建立Step步驟
 * 6.建立Job物件，並且將step(步驟)放入Job物件當中
 * 
 * 全程使用自動掃描產生依賴物件(bean)但是可以不需要這樣做
 * 
 * 而@EnableBatchProcessing 為必須的註解，該註解會自動生成
 * JobRepository、JobLauncher、JobRegistry、PlatformTransactionManager、JobBuilderFactory、StepBuilderFactory以上的bean物件
 * 而@Configuration 也是必須註解，告知這是一個配置檔案。
 * 
 * 參考網站:https://www.jianshu.com/p/3531323964d8
 * 
 */
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

	// 1.撈DB的方式取得資訊
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
	public Step step1(StepBuilderFactory stepBuilderFactory, ItemReader<User> reader, UserItemWriter userItemWriter,
			ItemProcessor<User, PUser> processor) {

		return stepBuilderFactory.get("step1").<User, PUser>chunk(100) // 一次處理多少資料
				.reader(reader).processor(processor).writer(userItemWriter).build();
	}

	@Bean
	public Job importJob(JobBuilderFactory jobs, @Qualifier("step1") Step s1) {
		return jobs.get("importJob").incrementer(new RunIdIncrementer()).flow(s1).end().build();
	}
}
