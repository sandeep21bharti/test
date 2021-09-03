package com.learn.observerDesignpattern;

public class Follower implements Observer {
	private String follwerName;

	public Follower(String follwerName) {
		super();
		this.follwerName = follwerName;
	}

	// This method will be called to update all followers regarding the new tweet
	// posted by celebrity.
	@Override
	public void update(String celebrityName, String tweet) {
		System.out.println(follwerName + " has received " + celebrityName + "'s tweet    :: " + tweet);
	}

	@Override
	public String toString() {
		return follwerName;
	}

}
