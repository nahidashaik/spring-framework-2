package com.nahida.learnspringframework.examples.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Component
//Named
class BusinessService{

		private DataService dataSevice;


		public DataService getDataSevice() {
			return dataSevice;
		}
		//@Autowired
		//Inject
		public void setDataSevice(DataService dataSevice) {
			System.out.println("Setter Injection");
			this.dataSevice = dataSevice;
		}
}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {
	public static void main(String[] args) {
		try(var context =
				new AnnotationConfigApplicationContext
				(CDIContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(
				context.getBean(BusinessService.class).getDataSevice());
		}
	}
}
