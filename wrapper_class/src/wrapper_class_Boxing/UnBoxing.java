package wrapper_class_Boxing;

public class UnBoxing {

	public static void main(String[] args) {
      
		 Integer i = new Integer(100);
		 int j= i; //autoboxing
        
		 int k = i.intValue();//manual unboxing
		 System.out.println("k : " +k);
		
		 Float f =1000.00f;
		 float pf = f.floatValue(); //manual unboxing
	     System.out.println("pf : " +f);
  }

}
