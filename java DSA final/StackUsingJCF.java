import java.util.*;
public class StackUsingJCF { 
    
    public static void main(String []a){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }

    }
}
