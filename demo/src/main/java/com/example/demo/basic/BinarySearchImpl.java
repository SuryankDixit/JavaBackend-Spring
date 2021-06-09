package com.example.demo.basic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
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

	/*
		Auto wiring can also be done using name
		eg:
		@Autowired
		private SortAlgorithm bubbleSortAlgorithm;

		@Primary has higher priority over the name of the variable
	 */
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}

}
