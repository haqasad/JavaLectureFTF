package com.ftf.lecture.six.iteratorexamples;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer>, Iterator<Integer> {

	private int start;
	private int end;
	private int cursor;
	
	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public Iterator<Integer> iterator() {
		cursor = start;
		return this;
	}
	
	@Override
	public boolean hasNext() {
		return cursor <= end; 
	}
	
	@Override
	public Integer next() {
		if (!hasNext()) {
			cursor = start;
			throw new NoSuchElementException();
		}
		return cursor++;
	}
	
	public static void main(String[] args) {
		Range range = new Range(1, 10);
		for (Integer cur : range) {
			System.out.println(cur + ", "); 
		}
	}

}
