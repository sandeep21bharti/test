package com.learn.observerDesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject{
	
	private String celebrityName;
	private List<Observer>followersList;
	
	public  Celebrity(String nameOfCelebrity) {
      this.celebrityName=nameOfCelebrity;
      followersList=new ArrayList<>();
	}

	@Override
	public void register(Observer o) {
		followersList.add(o);
		System.out.println(o + " has started following " + celebrityName);
	}

	@Override
	public void unregister(Observer o) {
		followersList.remove(o);
		System.out.println(o + " has stopped following " + celebrityName);
	}

	@Override
	public void notifyAllObservers(String tweet) {
		for (Observer observer : followersList) {
			observer.update(celebrityName, tweet);
		}
	}

	
	//This method updates the tweet.
	// It will internally call notifyAllObservers(tweet) method
	//after updating the tweet.
	public void tweet(String tweet) {
		System.out.println("\n" + celebrityName + " has tweeted :: " + tweet + "\n");
		notifyAllObservers(tweet);		
	}
	
	

}
