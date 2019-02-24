package com.nw.srs.beans;

import java.util.Random;

import org.apache.log4j.Logger;

public class FlipKart {

	private static final Logger logger = Logger.getLogger(FlipKart.class.getName());

	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public FlipKart() {
		System.out.println("FlipKart 0- Param Constructor...");
		logger.info("Enter into FlipKart 0-Param Constructor...");
	}

	public String purchase(String items[]) {
		// generate order id
		Random random = new Random();
		int orderId = random.nextInt(80000);

		// deliver order
		String status = courier.deliver(orderId);
		logger.debug("delevery status is :: "+status);
		return status + " Bill Amount for order id " + orderId + " is 8000";
	}
}
