package com.nw.ars.beans;

public class Bank {

	public float calIntrAmt(float pamt, float time) {
		System.out.println("Bank CalIntAmt()");
		return pamt * time * 2.0f / 100;
	}

	public float calcIntAmt() {
		return 123.0f;
	}
}
