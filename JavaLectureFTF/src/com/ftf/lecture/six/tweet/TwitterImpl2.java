package com.ftf.lecture.six.tweet;

import java.util.ArrayList;
import java.util.List;

public class TwitterImpl2 implements Twitter {
	private List<Tweet> list = new ArrayList<>();
	
	@Override
	public void addTweet(Tweet tweet) {
		list.add(tweet);
	}
	
	@Override
	public void printAllTweets() {
		for(Tweet tweet : list) {
			System.out.println(tweet); 
		}
	}
	
	public static void main(String[] args) {
		Twitter twitter = new TwitterImpl2();
		Tweet tweet1 = new Tweet("Hello World! This is my first tweet!!", "John McGill");
		twitter.addTweet(tweet1);
		
		Tweet tweet2 = new Tweet("Hello World! This is my second tweet!!", "Noel Smith");
		twitter.addTweet(tweet2);

		Tweet tweet3 = new Tweet("Hello World! This is my third tweet!!", "Andrew Garfield");
		twitter.addTweet(tweet3);
		
		Tweet tweet4 = new Tweet("Hello World! This is my fourth tweet!!", "Newt Scamandar");
		twitter.addTweet(tweet4);		
		
		twitter.printAllTweets();
	}

}
