package Queue_Deque_Stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueExample {

    public static void main(String[] args) {
/*
------------------------------How Queue Works---------------------------
------------------------Head-------12345--------Tail------------
-----Start here/Take here-->  ▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢ <--Add here-------

        # 1. FIFO first in first out. You remove beginning of the queue,
        and you add element end of the queue
        # 2.Queue is interface, so you can't directly instantiate Queue
        instead you create  class that implements Queue
        # 3. There are 3 commonly used classes that you can use with Queue
           LinkedList<>()  |  ArrayDeque<>()   |  PriorityQueue<>()
        # 4.  It is bewt practise that use always generic
        # 5. Birinci element Birinci capa verilir

 */
        //------------Create and call and print queue object---------------------------
        Queue<Customer> queue = new LinkedList<>();
        //how to add data to queue
        queue.add(new Customer("Ilham"));
        queue.add(new Customer("Melahet"));
        queue.add(new Customer("Kamil"));
        //how to call queue list - first go first, last go last
        Customer customer1 = queue.poll();
        Customer customer2 = queue.poll();
        Customer customer3 = queue.poll();
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println();

        //------------Using Generic and not using Generic---------------------------

        Queue<Customer> queue1 = new LinkedList<>();
        queue1.add(new Customer("Ilham"));//Compiler accept this type Because its Customer type
        //queue1.add("Ilham") Compiler will not accept second one because it is String type not Customer type

        Customer customer = queue1.poll();//you dont need to cast because queue1 is Customer type(generic)
        System.out.println();

        // --------Without Generic--------
        //Because we dont define Type of set, it will accept all type of objects
        //! But it is not good example
        Queue queue2 = new LinkedList();
        queue2.add(new Customer("Ilham"));//Customer type object
        queue2.add("Ilham");//String type object
        System.out.println();

        //Because we didnt define Set generic, we should cast them for their type
        Customer customer4 = (Customer) queue2.poll();
        String customer5 = (String) queue2.poll();
        System.out.println(customer4);
        System.out.println(customer5);
        System.out.println();

        /*
        .offer() method - tries to add an element to a queue, and returns false
         if the element can't be added (like in case when a queue is full),
         or true if the element was added, and doesn't throw any specific exception
         .
        .add() method - tries to add an element to a queue, returns true if the element was added,
         or throws an IllegalStateException if no space is currently available.
        */

        BlockingQueue<String> queue5 = new ArrayBlockingQueue<>(2);
        queue5.add("TestQuue1");
        queue5.add("TestQuue2");
        //queue5.add("TestQuue3");  // will throw "java.lang.IllegalStateException: Queue full
        //System.out.println(queue5);


        BlockingQueue<String> queue6 = new ArrayBlockingQueue<>(2);
        queue6.offer("TestQuue1");
        queue6.offer("TestQuue2");
        queue6.offer("TestQuue3"); // will not throw any exception but also not printing 3th line because only 2 defined
        System.out.println(queue6);

        //---------------.contains method()----------------
        System.out.println(queue6.contains("TestQuue1"));//true
        System.out.println(queue6.contains("Tehran"));//false
        System.out.println();

        //------------------remove element from the Queue----------------------
        // Either you use pull() or .remove() method to take element from the queue

        LinkedList<Customer> cos2 = new LinkedList<>();
        cos2.add(new Customer("Ilia"));
        cos2.add(new Customer("Ilham"));
        cos2.add(new Customer("Serxan"));

        //---------------------------Iterator--------------------------------
        System.out.println("--------Iterator--------------");
        Iterator<Customer> iterator = cos2.iterator();
        while (iterator.hasNext()) {
            Customer c = iterator.next();
            System.out.println(c);
        }
        //---------------------------For loop--------------------------------
        System.out.println("----------for loop--------");
        for (Customer cc : cos2) {
            System.out.println(cc);
        }
        System.out.println();

        //---------------------------Stream--------------------------------
        System.out.println("----------Stream-----------");
        cos2.stream().forEach(cos3 -> {// birbaşa yeni variable vere bilersen uzun uzadi define elemeye ehtiyac yoxdu
            System.out.println(cos3);
        });


        System.out.println();
        Customer coo1 = cos2.peek(); // returns the element at the front the container. Peek doesn't take element from the queue
        System.out.println(cos2.size()); //to check the size of queue ---   size- 3
        System.out.println(coo1);

        Customer coo2 = cos2.poll();// take element from the queue
        System.out.println(cos2.size());   //size 2 - because with .pull()  we already took first element
        System.out.println(coo2);

        Customer coo3 = cos2.remove(); //delete element from the list
        System.out.println(cos2.size());
        System.out.println((coo2));
        System.out.println();


    }
}
