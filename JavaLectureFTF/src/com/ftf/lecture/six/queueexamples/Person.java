package com.ftf.lecture.six.queueexamples;

public class Person implements Comparable<Person> {
	private String name;
	private Integer age;
	
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public int compareTo(Person o) {
		return o.age.compareTo(this.age);
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
	
}
