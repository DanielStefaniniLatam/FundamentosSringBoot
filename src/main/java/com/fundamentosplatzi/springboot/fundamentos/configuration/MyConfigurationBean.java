package com.fundamentosplatzi.springboot.fundamentos.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependecy;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependecyImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOperation;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOperationImplement;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class MyConfigurationBean {
	
	@Bean
	public MyBean beanOperation() {
		return new MyBeanImplement();
	}
	
	@Bean MyOperation beanOperationOperation() {
		return new MyOperationImplement();
	}
	
	@Bean
	public MyBeanWithDependecy beanMyOperationImplementWithDependency(MyOperation myOperation) {
		return new MyBeanWithDependecyImplement(myOperation);
	}
}
