package com.magang.merchant.utils;

public enum TestCases {

	T1("Testing the authentication");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
