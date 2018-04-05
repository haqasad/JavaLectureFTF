package com.ftf.lecture.six.setexamples;

public class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}

}
