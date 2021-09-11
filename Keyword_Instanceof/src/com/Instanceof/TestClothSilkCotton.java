package com.Instanceof;

public class TestClothSilkCotton {
	public static void main(String[] args) {
		Cotton cotton = new Cotton();
		Silk silk = new Silk();
		Material material = new Material();
		material.stitch(cotton);
	}

}
