package com.bridge.ObserverDesign;

public interface Observer {

	void update();

	void subscribeChannel(Subject ch);

}