package com.ftf.lecture.six.queueexamples;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Person> persons = new PriorityQueue<>();
		
		persons.offer(new Person("Customer 1", 14));
		persons.offer(new Person("Customer 2", 35));
		persons.offer(new Person("Customer 3", 15));
		persons.offer(new Person("Customer 4", 12));
		persons.offer(new Person("Customer 5", 40));
		
		while(!persons.isEmpty()) {
			Person person = persons.poll();
			serve(person); 
		}
	}
	
	private static void serve(Person person) {
		System.out.println("Serving person - name: " + person.getName() + ", age: " + person.getAge());   
	}

}
