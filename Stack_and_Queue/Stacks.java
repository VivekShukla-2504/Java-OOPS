package Stack_and_Queue;

import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(2);
        stack.push(4);
        System.out.println(stack.push(8));
        System.out.println(stack.pop());
        
    }
}
