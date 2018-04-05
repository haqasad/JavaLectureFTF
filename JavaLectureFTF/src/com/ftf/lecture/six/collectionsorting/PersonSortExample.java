package com.ftf.lecture.six.collectionsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSortExample {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("James", "Gosling"));
		persons.add(new Person("Gavin", "King"));
		persons.add(new Person("Rod", "Johnson"));
		persons.add(new Person("Craig", "Mcclanahan"));
		
		Collections.sort(persons);
		
		for(Person p : persons) {
			System.out.println(p.getFirstName() + " " + p.getLastName()); 
		}
	}
}
