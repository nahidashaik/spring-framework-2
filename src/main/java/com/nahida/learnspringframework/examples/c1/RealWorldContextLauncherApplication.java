package com.nahida.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
class ClassA{}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic goes here");
		this.classA=classA;
	}
	public void doSomething() {
		System.out.println("doSomething ");
	}
}

@Configuration
@ComponentScan
public class RealWorldContextLauncherApplication {
	public static void main(String[] args) {
		try(var context =
				new AnnotationConfigApplicationContext
				(RealWorldContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("Intialization context is completed");
			context.getBean(ClassB.class).doSomething();
		}
	}
}
