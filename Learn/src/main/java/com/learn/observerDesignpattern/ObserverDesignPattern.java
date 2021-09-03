package com.learn.observerDesignpattern;

public class ObserverDesignPattern {

	 //behavioural patterns – Observer design pattern
	public static void main(String[] args) {

		// https://examples.javacodegeeks.com/core-java/java-observer-design-pattern-example/
		Celebrity salmankhan = new Celebrity("Salman Khan");
		Celebrity ranbirkapoor = new Celebrity("Ranbir Kapoor");
		Follower jay = new Follower("Jay");
		Follower rajan = new Follower("Rajan");
		
		salmankhan.register(jay);
		salmankhan.register(rajan);
		salmankhan.tweet("Hey guys, came across this interesting trailer, check it out.");
		
		salmankhan.unregister(rajan);
		salmankhan.tweet("Teaser of Secret Superstar has been released..!!");
	}

}
