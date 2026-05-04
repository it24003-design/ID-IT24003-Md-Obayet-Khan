import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        queue.remove();
        System.out.println("After remove: " + queue);

        System.out.println("Front element: " + queue.peek());
    }
}
