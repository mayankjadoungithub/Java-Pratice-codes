public class Palindromestring {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not a Palindrome 
                return false;
            }
            
        }
        
         return true;
    } 
    public static void main (String []a){
        String str1 = "noon";
        System.out.println(isPalindrome(str1));
    }
}
