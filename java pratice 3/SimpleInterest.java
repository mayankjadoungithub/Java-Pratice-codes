public class SimpleInterest
 {  
   public static void main (String args[])  
    {   float PA, rate,  time,  SI; // PA= principal amount,  SI= simple interest respectively  
              PA = 13000;  rate = 12; time = 2;
              // formula to calculate simple interest    ( Simple interest = principal amount*rate*time/100)
               SI  = (PA*rate*time)/100;   
              System.out.println("Simple Interest is: " +SI);  
    }
 }
