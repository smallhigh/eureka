package com.imooc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
//两个eureka相互注册后，两个eureka都会有client服务
//也可以三个eureka互相注册（两两注册），client标注三个eureka
//启动多个实例详见fzp教程，fzp启动的是两个client实例，这里
//教程是开启两个eureka相互注册，结果是一样的，教程的端口在复制
//EurekaApplication的时候就已经配置好了