package com.imooc.eureka;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EurekaApplicationTests {

	@Test
	void contextLoads() {
	}

}
//打war包要忽略test，在打包指令上加条件mvn clean package -DskipTests
//启动jar包命令(java命令): java -jar target/eureka-0.0.1-SNAPSHOT.jar
//后台运行jar包(linux命令):nohup java -jar target/eureka-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &
//在git base可以使用linux命令，停止命令kill -9 23956(进程号)
//ps -ef | grep eureka显示命令，ps -ef显示所有命令
