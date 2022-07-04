package com.bridge.ObserverDesign;

public interface Subject {

	void subscriber(Subscriber sub);

	void unSubscriber(Observer sub);

	void notifySubscriber();

	void upload(String title);

}