package com.ftf.lecture.six.hashmapexamples;

import java.util.Objects;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		Person person = (Person) obj;
		return Objects.equals(name, person.name);
	}

	@Override
	public String toString() {
		return name;
	}

}
