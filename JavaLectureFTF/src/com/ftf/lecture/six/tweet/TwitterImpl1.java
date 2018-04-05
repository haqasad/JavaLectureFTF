package com.ftf.lecture.six.tweet;

public class TwitterImpl1 implements Twitter {
	private static final int MAX_TWEET_SIZE = 10;
	private Tweet[] tweets = new Tweet[MAX_TWEET_SIZE];
	
	private int index = 0;
	
	@Override
	public void addTweet(Tweet tweet) {
		tweets[index] = tweet;
		index++;
	}
	
	@Override
	public void printAllTweets() {
		for(Tweet tweet : tweets) {
			System.out.println(tweet); 
		}
	}

	public static void main(String[] args) {
		Twitter twitter = new TwitterImpl1();
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
