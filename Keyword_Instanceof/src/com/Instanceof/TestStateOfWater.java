package com.Instanceof;

public class TestStateOfWater {
	public static void main(String[] args) {
		HotWater hot = new HotWater();
		ColdWater cold = new ColdWater();
		StateOfWater state = new StateOfWater();
		state.season(hot);

	}

}
