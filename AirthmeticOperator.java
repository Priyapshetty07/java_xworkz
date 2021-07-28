class AirthmeticOperator
 {

     public int add(int a ,int b)
        {
         return a+b;
        }
     
     public int sub(int p ,int q)
       {
         return p-q;
       }

     public int mul(int m ,int n)
       {
         return m*n;
        }

     public int div(int x ,int y)
       {
         return x/y;
       }

      public int mod(int e ,int f)
       {
         return e%f;
       }

      public static void main(String args[])
           {
            AirthmeticOperator  operator = new AirthmeticOperator();
               System.out.println("ADDITION" +operator.add(5,5));
               System.out.println("SUBTRACTION" +operator.sub(10,5));
               System.out.println("MULTIPLICATION" +operator.mul(5,6));
               System.out.println("DIVISION" +operator.div(24,2));
               System.out.println("MODULUS" +operator.mod(10,3));
            }
 }