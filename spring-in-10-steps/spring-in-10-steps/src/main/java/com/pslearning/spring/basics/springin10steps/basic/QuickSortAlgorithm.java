package com.pslearning.spring.basics.springin10steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// logic for Quick Sort
		return numbers;
	}
}
