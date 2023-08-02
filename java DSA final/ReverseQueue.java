import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
     while (!queue.isEmpty()) {
           stack.push(queue.poll());
        }

        // Your code here
        while (!stack.isEmpty()) queue.offer(stack.pop());
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        reverseQueue(queue);
    }
}