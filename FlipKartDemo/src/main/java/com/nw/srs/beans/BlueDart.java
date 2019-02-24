package com.nw.srs.beans;

public class BlueDart implements Courier {

	public String deliver(int orderId) {
		return "Blue is ready to deliver Product " + orderId;
	}

	public BlueDart() {
		System.out.println("BlueDart 0- Param Constructor.....");
	}

}
