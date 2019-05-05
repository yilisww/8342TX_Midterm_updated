package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> ticket = new LinkedList<>();  // FIFO

        ticket.add("New England Patriots");
        ticket.add("Detroit Lions");
        ticket.add("Dallas Cowboys");
        ticket.add("Houston Texan");
        ticket.add("New York Giants");
        ticket.add("Indianapolis Colts");

        for (String x : ticket) System.out.print(x + ", ");
        System.out.println();

        System.out.println();
        System.out.println("take a peek::: the best NFL team is : " + ticket.peek());
        ticket.remove(4);            //FIFO -- "New York Giants" is removed

        System.out.println("\n"+"The NFL teams we really love: ");
        for (String x : ticket) System.out.print(x + ", ");
        System.out.println();

        System.out.println();
        System.out.println("NFL pool()::::" );

        Iterator it = ticket.iterator();
        while (it.hasNext()) System.out.print("\n"+it.next()+",");


    }

}
