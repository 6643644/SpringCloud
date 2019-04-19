package com.example.batch.config;

//@Configuration
public class BatchConfig {

	// @Autowired
	// public JobBuilderFactory jobBuilderFactory;
	//
	// @Autowired
	// public StepBuilderFactory stepBuilderFactory;
	//
	// @Bean
	// public Job processJob() {
	// return jobBuilderFactory.get("processJob").incrementer(new
	// RunIdIncrementer()).listener(listener())
	// .flow(orderStep1()).end().build();
	// }
	//
	// @Bean
	// public Step orderStep1() {
	// return stepBuilderFactory.get("orderStep1").<String,
	// String>chunk(1).reader(new Readr())
	// .processor(new Processor()).writer(new Writer()).build();
	// }
	//
	// @Bean
	// public JobExecutionListener listener() {
	// return new JobCompletionListener();
	// }
}
