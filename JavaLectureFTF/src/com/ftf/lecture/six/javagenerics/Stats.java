package com.ftf.lecture.six.javagenerics;

//public class Stats<T> {
public class Stats<T extends Number> {
	T[] nums;
	
	public Stats(T[] nums) {
		this.nums = nums;
	}
	
//	Return type double in all cases.
	double average() {
		double sum = 0.0;
		for (T num : nums) {
			sum += num.doubleValue();
		}
		
		return sum / nums.length;
	}

}
