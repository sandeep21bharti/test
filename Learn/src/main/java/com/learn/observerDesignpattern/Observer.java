package com.learn.observerDesignpattern;

//The Observers update method is called when the Subject changes
interface Observer {
	public void update(String name, String s);
}