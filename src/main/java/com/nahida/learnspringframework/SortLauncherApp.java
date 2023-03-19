package com.nahida.learnspringframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nahida.learnspringframework.algorithm.SortLaunch;

@Configuration
@ComponentScan("com.nahida.learnspringframework.algorithm")
public class SortLauncherApp {
	public static void main(String[] args) {
		try(var context =
				new AnnotationConfigApplicationContext
				(SortLauncherApp.class)){
			//context.getBean(ComplexAlgorithm.class).sort();
			context.getBean(SortLaunch.class).go();
		}
	}
}