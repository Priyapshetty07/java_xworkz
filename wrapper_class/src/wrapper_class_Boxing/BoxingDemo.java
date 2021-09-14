package wrapper_class_Boxing;

public class BoxingDemo {

	public static void main(String[] args) {
		
       int a =10; 
		Integer x =a;  //auto boxing
		
		Integer y = new Integer(a); //manual boxing
		System.out.println("a : " +a);
		System.out.println("x : " +x);
		System.out.println("y : " +y);
	}

}
