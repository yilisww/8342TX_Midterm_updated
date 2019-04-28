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

        Queue<String> ticketOffice = new LinkedList<>();  // FIFO

        ticketOffice.add("New England Patriots");
        ticketOffice.add("Detroit Lions");
        ticketOffice.add("Dallas Cowboys");
        ticketOffice.add("Houston Texan");
        ticketOffice.add("New York Giants");
        ticketOffice.add("Indianapolis Colts");


        System.out.println("The NFL teams we love: ");
        for (String x : ticketOffice) System.out.print(x + ", ");
        System.out.println();

        System.out.println();
        System.out.println("take a peek:::" + ticketOffice.peek());  //FIFO
        ticketOffice.remove(4);            //FIFO -- "New York Giants" is removed

        System.out.println("The NFL teams we really love: ");
        for (String x : ticketOffice) System.out.print(x + ", ");
        System.out.println();

        System.out.println();
        System.out.println("NFL pool()::::" );  //poll() == peek() and remove()

        Iterator it = ticketOffice.iterator();
        while (it.hasNext()) System.out.print("\n"+it.next()+",");


    }

}
