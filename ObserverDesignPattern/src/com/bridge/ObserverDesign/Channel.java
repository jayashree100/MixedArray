package com.bridge.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List<Subscriber> subscriber = new ArrayList<>();
	String title;
	
	@Override
	public void subscriber(Subscriber sub) {
		subscriber.add(sub);
	}
	
	@Override
	public void unSubscriber(Observer sub) {
		subscriber.remove(sub);
	}
	
	@Override
	public void notifySubscriber() {
		for(Observer subs : subscriber) {
			subs.update();
		}
	}
	
	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}

}
