package com.bridge.ObserverDesign;

public class YouTube {

	public static void main(String[] args) {
		Subject jaya = new Channel();
		Subscriber subsciber3 = new Subscriber("jaya");
		Subscriber subsciber1 = new Subscriber("kavya");		
		Subscriber subsciber4 = new Subscriber("sunil");
		Subscriber subsciber2 = new Subscriber("priya");

		Subscriber subsciber5 = new Subscriber("swathi");
	
			jaya.subscriber(subsciber1);
			jaya.subscriber(subsciber2);
			jaya.subscriber(subsciber3);

			jaya.subscriber(subsciber4);
			jaya.subscriber(subsciber5);
			
			jaya.upload("video uploaded sucessfully watch the video");



	}

}
