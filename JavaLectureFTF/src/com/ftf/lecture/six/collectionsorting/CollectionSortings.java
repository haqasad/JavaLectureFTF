package com.ftf.lecture.six.collectionsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionSortings {

	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<>();
		
		listA.add(5);
		listA.add(3);
		listA.add(2);
		
		Collections.sort(listA); 
		System.out.println(listA);
		
		List<Integer> listB = new LinkedList<>();
		
		listB.add(15);
		listB.add(13);
		listB.add(20);
		
		Collections.sort(listB); 
		System.out.println(listB);
	}
}
