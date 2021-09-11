package com.Instanceof;

public class StateOfWater {
	void season(Water water)
	{
		if(water instanceof HotWater)
		{
		System.out.println("we drink Hot Water in Winter Season");
		}
		else {
			System.out.println("we drink Cold Water in Summer Season");
		}
	}

}
