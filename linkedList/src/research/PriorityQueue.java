package research;

import java.util.*;

public class PriorityQueue {

    public static void main(String args[])
    {
        Queue<String> pq = (Queue<String>) new PriorityQueue();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial Queue " + pq);

        pq.remove("Geeks");

        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);
    }

}
