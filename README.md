# SpringCloud
測試Spring Cloud 微服務

使用Gradle 建立多個服務專案，並且使用Spring Cloud作為架構
目的是完成一個後端可以與DB溝通的微服務架構。


連接DB的部分之後再思考要用甚麼技術

先練習Gradle建構 與Spring Boot的配置

基本流程:</br>
1.建議Gradle專案，有父專案與多個子專案。</br>
2.建立spring boot專案。</br>
3.建立Spring Cloud專案，其中分成Spring Cloud Config Server 與 Spring Cloud Config Client 兩個專案。</br>
  -1. Sprng Cloud Config Server為 Server端的配置。</br>
  -2. Spring Cloud Config Clinet 為Clinet端取的Server端配置檔的使用。</br>
  -3. 取得配置檔的方式使用GIT 來取得，也可以直接取的本機端端的Git配置。</br>

4.建立Eureka 專案



