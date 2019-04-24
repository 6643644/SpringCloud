package com.example.controller;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job importJob;
	
	@Autowired
	Job importJobByP;

	public JobParameters jobParameters;

	@Autowired
	DataSource dataSource;

	// 定時執行
	@RequestMapping("/job/start")
	@Scheduled(cron = "0 0 0 10 * ?")
	public void execute() throws Exception {
		jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();
		jobLauncher.run(importJob, jobParameters);
	}
	
	// 定時執行
		@RequestMapping("/job/startByP")
		@Scheduled(cron = "0 0 0 10 * ?")
		public void executeByP() throws Exception {
			jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();
			jobLauncher.run(importJobByP, jobParameters);
		}

	// 定時執行
	@RequestMapping("/job/test")
	public void tets() throws Exception {
		System.out.println("dataSource:" + dataSource);
	}
}
