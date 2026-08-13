package Stack_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(34);
        queue.add(32);
        queue.add(30);
        queue.add(39);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        
    }
}
