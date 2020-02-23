package com.syz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.syz.mapper") // 扫描mapper接口的位置，对应的xml文件虽然有指向mapper文件，但是控制台会报出警告，为了解决警告需要加上这一个注解。
@SpringBootApplication
public class ApidevApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidevApplication.class, args);
	}

}
