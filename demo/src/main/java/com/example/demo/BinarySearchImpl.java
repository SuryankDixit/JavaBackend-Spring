package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	/*
		tut1
		All mandatory dependency should use constructor injection

		public BinarySearchImpl(SortAlgorithm sort){
			super();
			this.sortAlgorithm = sort;
		}

		All optional dependency should use setter injection
		public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
			this.sortAlgorithm = sortAlgorithm;
		}
	*/


	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}

}
