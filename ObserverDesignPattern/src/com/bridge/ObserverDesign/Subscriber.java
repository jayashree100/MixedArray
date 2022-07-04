package com.bridge.ObserverDesign;

public class Subscriber implements Observer {
	private String name;
	private Subject channel;
	
	Subscriber(){
		
	}
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	
	@Override
	public void update() {
		System.out.println( "Hi  "  +name+  " video uploaded");
	}
	
	@Override
	public void subscribeChannel(Subject ch) {
		channel = ch;
	}

}
