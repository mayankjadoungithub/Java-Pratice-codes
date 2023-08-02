import java.util.*;
public class lowercaselettercount {
    public static void main(String []a){
     Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int count =0;

    for(int i=0;i<str.length();i++){
        char v = str.charAt(i);
        if(v == 'a'|| v == 'e' ||v == 'i'|| v == 'o' || v == 'u'){
            count++;
        }
    }
    System.out.println("total no of vowels : "+ count);
    }
}
