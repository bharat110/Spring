package com.nw.ars.replacer;


import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {

	private static final Logger logger = Logger.getLogger(IntrRateReplacer.class.getName());

	private float rate;

	public void setRate(float rate) {
		this.rate = rate;
	}

	public IntrRateReplacer() {
		System.out.println("0- Param Replacer Constructor ....");
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
	
		logger.info("Enter into IntrRateReplacer:reimplement(-,-,-) method");

		if (method.getName().equals("calIntrAmt")) {
			float pamt = (Float) args[0];
			float time = (Float) args[1];
			return pamt * time * rate / 100.0f;
		} else {
			return 0.0f;
		}
	}// reimplement
}// class
