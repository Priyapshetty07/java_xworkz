package com.CustomArray;

public class TestCalender {

	public static void main(String[] args) {
		
		//Calender[] calenders = new Calender[3];
		
		Calender mallige = new Calender("mallige","Medium",20.00,"Pocket");
		Calender sampige = new Calender("Sampige","large",50.00,"Wall");
		Calender systemCalender = new Calender("Calender","small",1000.00,"System");
		
		Calender[] calenders = {mallige,sampige,systemCalender};
     
		for(Calender calender : calenders) 
		{
			//if(calender.type.equals("Pocket"))
			//{
				System.out.println(calender);
			//}
		}
		System.out.println("Name of the calenders:");
		for(Calender calender : calenders) 
		{
			System.out.println(calender.name);
		}
	}

}
