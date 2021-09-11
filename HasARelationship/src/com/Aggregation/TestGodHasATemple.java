package com.Aggregation;

public class TestGodHasATemple {
	public static void main(String[] args) {
		God god = new God();
		god.name="SaiBaba";
		god.gender="MALE";
		
		Temple temple = new Temple();
		temple.name = "Shirdi Sai Baba Temple";
	    temple.address = "Vinobhanagar shimoga";
	    temple.time = "8am to 8pm";
	    temple.god = god;
	    
	    System.out.println("GOD DETAILS FROM THE TEMPLE");
	    System.out.println("name:" + temple.god.name);
	    System.out.println("gender:" + temple.god.gender);

	}

}
