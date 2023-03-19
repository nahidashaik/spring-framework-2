package com.nahida.learnspringframework.algorithm;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nahida.learnspringframework.game")
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
