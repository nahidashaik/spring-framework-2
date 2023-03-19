package com.nahida.learnspringframework.examples.c1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class BusinessCalculationService {
	private DataService dataService;
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService=dataService;
	}
	public int findMax() {
		IntStream data = Arrays.stream(dataService.retrieveData());
		OptionalInt a = data.max();
		System.out.println("OptionalInt a"+a);
		int orelse = a.orElse(0);
		System.out.println("orelse value of "+orelse);
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
