public class lengthofStringhitoutLengthFun {
    public static void main(String []a){
        String word = " hello My World I love U soo Much";
         System.out.println(getLenStr(word));
    }
    public static int getLenStr(String str){
         int length =0;
         char[] strCharArray = str.toCharArray();
         for(char c:strCharArray){
            length++;
         }
         return length;
    }
}
