package com.pancm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ThymeleafApp
{
    public static void main( String[] args )
    {
    	// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
		SpringApplication.run(ThymeleafApp.class, args);
		System.out.println("程序正在运行...");
    }
}
