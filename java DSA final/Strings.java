import java.util.*;
public class Strings {
   public static void printLetters(String str){
      for(int i=0;i<str.length();i++){
         System.out.println(str.charAt(i));
      }
   }
 public static void main(String []a){
   //  String str1 ="abcd";
   //  String str2= new String("xyz");
   // // String are IMMUTABLE
   // Scanner sc = new Scanner(System.in);
   // String name;
   // System.out.println("Enter Your String :");
   // name = sc.nextLine(); 
   // System.out.println(name);
   // length
   
   
   // concatenation 
   String firstName= "Mayank";
   String lastName = "Jadoun";
   String fullName= firstName+" "+lastName;
   // System.out.println(fullName.charAt(1));
   printLetters(fullName);


 }   
}
