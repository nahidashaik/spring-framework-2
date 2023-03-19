package com.nahida.learnspringframework.algorithm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SortLaunch {
	private SortingAlgorithm algorithm;
	public SortLaunch(@Qualifier("RadixSortQualifier")SortingAlgorithm algorithm) {
		this.algorithm=algorithm;
	}
	public void go() {
		algorithm.sort();
	}
}
