package Boolean_Equals;

public class TestIpad {

	public static void main(String[] args) {
		Ipad ipad = new Ipad("Apple","3gb",60000.00);
		Ipad ipad1 = new Ipad("Apple","3gb",60000.00);
		Ipad samsung = new Ipad("samsung","2gb",12000.00);
		 
		System.out.println(ipad.equals(samsung));
		System.out.println(ipad.equals(ipad1));	

	}

}
