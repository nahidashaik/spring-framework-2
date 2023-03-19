package com.nahida.learnspringframework.algorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


	@Component
	@Primary
	class QuickSort implements SortingAlgorithm{
		@Override
		public void sort() {
			System.out.println("In QuickSort");
		}
	}

	@Component
	@Qualifier("RadixSortQualifier")
	class BubbleSort implements SortingAlgorithm{
		@Override
		public void sort() {
			System.out.println("In BubbleSort");
		}
	}

	@Component
	public class ComplexAlgorithm implements SortingAlgorithm{
		@Autowired
		private SortingAlgorithm algorithm;
		@Override
		public void sort() {
			System.out.println("In ComplexAlgorithm"+algorithm);
		}
	}

	@Component
	class AnotherComplexAlgorithm implements SortingAlgorithm{
		@Autowired
		@Qualifier("RadixSortQualifier")
		private SortingAlgorithm iWantToUseRadixSortOnly;
		@Override
		public void sort() {
			System.out.println("In AnotherComplexAlgorithm" +iWantToUseRadixSortOnly);
		}
	}

