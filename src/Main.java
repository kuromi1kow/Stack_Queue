import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        /*var queue=new StackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        var deq=queue.dequeue();
        System.out.println(deq);
        System.out.println(queue.peek());
        System.out.println(queue.toString());*/

     var queue=new Priority_Queue(5);
     queue.insert(-1);
     queue.insert(30);
     queue.insert(10);
     queue.insert(-2);
     queue.remove();
        System.out.println(queue.getSize());
        System.out.println(queue.toString());
    }
}