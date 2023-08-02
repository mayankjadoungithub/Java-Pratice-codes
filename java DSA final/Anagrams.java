import java.util.*;
public class Anagrams {
    public static void main(String[]a){
        String str = "earth";
        String str1 = "heart";

      // convert into lowecase
        str=  str.toLowerCase();
        str1 = str1.toLowerCase();
        // check the length - are same or not........first step
        if(str.length() == str1.length()){
             // convert string into chararray
            char[] strchararray = str.toCharArray();
            char[] str1chararray = str1.toCharArray();
            // the the char array
            Arrays.sort(strchararray);
            Arrays.sort(str1chararray);
            // if the sorted char arrays are same or ientical then the string is anagrams otherwise not?..........
            boolean result = Arrays.equals(strchararray,str1chararray);

              if(result){
                System.out.println(str + " and "+str1+ " equals");
              }
              else{
                System.out.println("not anargrams");
               }

            }else{
            System.out.println("when length are not equls");
        }
            }
        }

    

