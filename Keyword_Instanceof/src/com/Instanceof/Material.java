package com.Instanceof;

public class Material {
	void stitch(Cloth cloth) 
	{
		if(cloth instanceof Cotton)
		{
			System.out.println("Cotton Material is best for stitching the kurtha");
		}
		else {
			System.out.println("Silk Material is best for stitching the Top");
		}
	}

}
