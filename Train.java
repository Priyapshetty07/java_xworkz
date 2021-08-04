class Train
   {
    void speed()
      {
        System.out.println("The speed of train is 80kmph");
       }
     
     void sound()
      {
        System.out.println("Train sounds high and it scares everyone");
       }
 
      void efficiency()
      {
        System.out.println("Efficency of the train is 80%");
       }

      String getDetails()
      {
        return "Train name: Banglore express\n"   +
                "Time     : 6:00AM\n"             +
            "Train Number : 23456\n"              +
              "Source     : Shimoga\n"            +
            "Destination  :  Banglore";
      }
      
      void printDetails()
      {
        System.out.println ("Train name: Banglore express\n"   +
                 "Time     :  6:00AM\n"                         +
            "Train Number  :   23456\n"                          +
              "Source      :   Shimoga\n"                        +
            "Destination   :   Banglore");
       }
     }