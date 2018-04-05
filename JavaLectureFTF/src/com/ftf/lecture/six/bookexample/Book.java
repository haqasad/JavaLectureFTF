package com.ftf.lecture.six.bookexample;

import java.util.ArrayList;

public class Book {
	
	private static final int CURRENT_YEAR = 2018;
	
	private String name;
	private ArrayList<String> author;
	private Publisher publisher;
	private int year;
	private float price;
	private Category category;
	
	public Book(String name, ArrayList<String> author, Publisher publisher, int year, float price, Category category) {

		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.price = price;
		this.category = category;
	}

	public boolean isPublished() {
		if((CURRENT_YEAR - year) < 20) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getAuthor() {
		return author;
	}

	public void setAuthor(ArrayList<String> author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
		
}
