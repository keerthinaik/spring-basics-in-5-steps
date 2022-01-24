package com.test.spring.basics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;

	public int search(int numbers[], int key) {
		// sort the array
		numbers = bubbleSortAlgorithm.sort(numbers);

		System.out.println("sort algorithm choosen : " + bubbleSortAlgorithm);

		int index = -1;
		int first = 0, last = numbers.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (numbers[mid] < key) {
				first = mid + 1;
			} else if (numbers[mid] == key) {
				index = mid;
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			index = -1;
		}
		return index;
	}
}
