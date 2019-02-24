package com.nw.srs.beans;

public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC 0- Param Constructor......");
	}

	public String deliver(int orderId) {
		return "DTDC is ready to deliver  product of " + orderId;
	}

}
