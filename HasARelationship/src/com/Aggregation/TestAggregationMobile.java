package com.Aggregation;

public class TestAggregationMobile {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.brand = "iphone";
		mobile.module = "12pro";
		mobile.storage = "512gb";
		mobile.price = 119213l;
		
		Internet internet = new Internet();
		internet.name = "Airtel";
		internet.bandwidth ="100mbps";
		internet.types ="5GB";
		mobile.internet=internet;
		
		
		System.out.println("Internet details of moblie is");
		System.out.println("name: " + mobile.internet.name);
		System.out.println("bandwidth: " + mobile.internet.bandwidth);
		System.out.println("types: " + mobile.internet.types);
	}

}

