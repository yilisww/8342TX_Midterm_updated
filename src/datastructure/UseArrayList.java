package datastructure;

import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        int num = 12;
        int[] array1;
        array1 = new int [20];

        Random random1 = new Random();
        for (int a=0; a<array1.length; a++) {
            array1[a] = random1.nextInt(100);
        }
        for (int b=0; b<array1.length; b++) {
            System.out.print(array1[b]+ " ");
        }

        System.out.println();

        // ArrayList
        int limit = 20;
        List<Integer> list = new ArrayList<Integer>();

        // ArrayList can dynamically grow
        Random random = new Random();
        for (int i=0; i<limit; i++) {
            list.add (random.nextInt(100));
        }
        for (int j=0; j<list.size(); j++) {
            System.out.print(list.get(j)+ " ");
        }

        System.out.println();

        // ArrayList for String
        List<String> list2 = new ArrayList<String>();
        list2.add("Hello, everyone");
        list2.add("Hi");
        list2.add("Hard midterm");
        list2.add("try the best to finish in one day");
        System.out.println(list2);

        list2.remove(1);
        System.out.println(list2);

        // creating stack
        Stack list3 = new Stack();

        // populating stack
        list3.push("Java");
        list3.push("is");
        list3.push("an");
        list3.push("interesting language");

        System.out.println(list3);

        // checking the object
        System.out.println("The last word of the list2 is : " + list3.peek());
        System.out.println("The first word of the list2 is : " + list3.firstElement());
        System.out.println("The last word of the list2 is : " + list3.lastElement());

        //add to database
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromStringArrayListToMySql(list3, "word", "language");



    }

}
