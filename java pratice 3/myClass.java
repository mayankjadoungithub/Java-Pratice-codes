import java.util.Scanner;
public class myClass {
   
    public static void main(String args[]) { 
                  
     Scanner sc = new Scanner(System.in);
      char x = sc.next().charAt(0);   
      String ans = x=='a' ? ("Vowel"):(x=='e' ? ("Vowel") : (x=='i'? ("Vowel") : (x=='o' ? ("Vowel") : (x=='u' ? ("Vowel") : ("Consonent"))) ));

      System.out.println(ans);
      
    }
}