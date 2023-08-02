import java.util.Calendar;  
public class CalendarEx{  
   public static void main(String[] args) {  
   Calendar calendar = Calendar.getInstance();  
   /*****
   System.out.println("The current date is : " + calendar.getTime());  
   calendar.add(Calendar.DATE, -15);  
   System.out.println("15 days ago: " + calendar.getTime());  
   calendar.add(Calendar.MONTH, 4);  
   System.out.println("4 months later: " + calendar.getTime());  
   calendar.add(Calendar.YEAR, 2);  
   System.out.println("2 years later: " + calendar.getTime()); 
   ***/
   System.out.format("%n %tB %te  %tY%n",calendar,calendar,calendar);
System.out.format("%n %tA %tB  %tY%n",calendar,calendar,calendar);
System.out.format("%n %tH %tM  %tp%n",calendar,calendar,calendar);
System.out.format("%n %tH %tM  %tS%n",calendar,calendar,calendar);

   }  
}  