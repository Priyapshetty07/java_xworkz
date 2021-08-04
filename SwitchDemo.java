class SwitchDemo
  {
    public static void main(String[] args)
    {
     String trafficsignal ="red";

          switch(trafficsignal)
            {
         case "red" : System.out.println("stop"); 
             break;

         case "yellow" : System.out.println("ready"); 
             break;

         case "green" : System.out.println("move");
            break;

          default :     System.out.println("invalid");
            }
    }
}