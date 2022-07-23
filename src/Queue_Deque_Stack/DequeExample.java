package Queue_Deque_Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
/*

    ------------------------------How Stack(Deque) Works---------------------------
    -----------------------Head------54321-------Tail------------------
    --Add here/Take here-->  ▢▢▢▢▢▢▢▢▢▢▢▢▢ -----------------------

      1. The pronunciation is -Dek(deck) and represents double ended queue
      2. It is double ended queue, and you add, and you take from the ent od Stack
      3. Because Deque is interface, you can't instantiate deque/cant create its object

*/
        //You can Instantiate(can create) Deque object with these 2 classes that implement Deque
        Deque<String> de = new ArrayDeque<>();
        Deque<String>dee = new LinkedList<>();


//-------------------------Deque without Generic type--------------------------------

        //You can create Deque without Generic type, but it is not good example
        System.out.println("Deque with/without Generic type");
        Deque deeq = new ArrayDeque();
        deeq.offer("Hi, Deque");
        deeq.offer(Integer.valueOf(123));

        String string = (String)deeq.poll(); //you should cast if you don't put generic at the beginning
        Integer integer = (Integer) deeq.poll();

        //its better to type the Generic
        Deque<String>deqqqq = new ArrayDeque<>();
        deqqqq.offer("Hey,You");

        String s =deqqqq.poll();
        System.out.println();





//------------------------------Queue Mode-------------------------------------
        Deque<String> dequeDeque = new ArrayDeque<>();
        System.out.println("\t\tQueue Mode");

        //In Queue Mode, You add always from the end

        dequeDeque.offerLast("Ilham");
        dequeDeque.offerLast("Simuzer");
        dequeDeque.offerLast("Serxan");
        dequeDeque.offerLast("Tehran");

        //You get elements from the front of Queue

        String e1 = dequeDeque.pollFirst();
        String e2 = dequeDeque.pollFirst();
        String e3 = dequeDeque.pollFirst();
        String e4 = dequeDeque.pollFirst();
        System.out.println(e1+"\n"+e2+"\n"+e3+"\n"+e4);
        System.out.println();

        //-----------------------Stack Mode-----------------------------------
        System.out.println("\t\tStack Mode");

        //In stack mode, You add elements from the front/head side
        //Because it looks like ***this(54321)*** First element will be first last element when you call First

        Deque<String> dequeStack = new ArrayDeque<>();
        dequeStack.offerFirst("Element 1");
        dequeStack.offerFirst("Element 2");
        dequeStack.offerFirst("Element 3");
        dequeStack.offerFirst("Element 4");

        //you pull elements from the tail side. So First pull will be last inserted element
        String el4 = dequeStack.pollFirst();
        String el3 = dequeStack.pollFirst();
        String el2 = dequeStack.pollFirst();
        String el1 = dequeStack.pollFirst();
        System.out.println(el1+"\n"+el2+"\n"+el3+"\n"+el4);
        System.out.println();//Element 1, Element 2, Element 3, Element 4


        //-----------------------add(), offer() , push() methods-----------------------------------

        Deque<Integer> deq1 = new ArrayDeque<>();
        //add()
        //if there is no way to add element add method will throw Exception
        deq1.add(1);// add just adding in a row
        deq1.addFirst(2);// add as a first element of queue
        deq1.addLast(3);//add as a last element
        System.out.println(deq1);//[2, 1, 3]

        //offer()
        //if there is no way to add element with offer it will just return false!
        Deque<Integer> deq2 = new ArrayDeque<>();
        deq2.offer(4);
        deq2.offerLast(5);
        deq2.offerFirst(6);
        System.out.println(deq2);//[6, 4, 5]

        //push()
        //it throw Exception as well

        deq2.push(7);//It is same as addFirst
        System.out.println(deq2);//[7, 6, 4, 5]
        System.out.println();

        //-----------------------peek(), getFirst() , getLAst() methods-----------------------------------
        /*
        1. If deck is empty peek methofd will return null
        2. But get Method will throw an Exception
         */

        //peek() method
        Deque<String> dee1 = new ArrayDeque<>();
        dee1.offer("A element");
        dee1.offer("B element");
        dee1.offer("C element");
        System.out.println(dee1);  //Last come first

        String a = dee1.peek();
        String b = dee1.peekFirst();//it shows first element without remove from deck
        String c = dee1.peekLast();

        System.out.println("a-peek: "+a);
        System.out.println("b-peekFirst: "+b);
        System.out.println("c-peekLast: "+c);

        //get() method
        String A = dee1.getFirst();
        String B = dee1.getLast();
        System.out.println(A);
        System.out.println(B);
        System.out.println();



        //-----------------------Iterator, for and Stream API-----------------------------------

        System.out.println("\t\tIterator, for and Stream API");

        Deque<String > stringDeque = new ArrayDeque<>();
        stringDeque.offer("Element 1");
        stringDeque.offer("Element 2");
        stringDeque.offer("Element 3");

        //Iterator
        Iterator<String> iterator = stringDeque.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\nfor each");

        //for each
        for(String element : stringDeque){
            System.out.println(element);
        }

        System.out.println("\nStream");

        //Stream
        stringDeque.stream().forEach((element)->{
            System.out.println(element);
        });

    }

}
