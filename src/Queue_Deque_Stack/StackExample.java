package Queue_Deque_Stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        /*      Push here->  <-Pop here
                           ▢
                           ▢
                           ▢

          1. Stack is like a (ust uste yığılmış boşqablar)

          2. A Stack is a Last In First Out (LIFO) data structure.
          It supports two basic operations called .push() and .pop().
          The push operation adds an element at the top of the stack,
          and the pop operation removes an element from the top of the stack.
          3.

         */

        //---------------------2 way of Create Stack class---------------------------

        //Stack without Generic

        Stack stack = new Stack();
        stack.push("Ilham");
        stack.push("Serxan");


        String one = (String) stack.pop();
        String two = (String) stack.pop();

        System.out.println(one);//Serxan
        System.out.println(two);//Ilham

        //With Generic
        Stack<Customer> customer = new Stack<>();
        customer.push(new Customer("Nusaba"));
        customer.push(new Customer("Tehran"));

        Customer peek = customer.peek();
        System.out.println("Peek of the stack is: " + peek);


        Customer customer1 = customer.pop();
        Customer customer2 = customer.pop();

        System.out.println(customer1);//Tehran
        System.out.println(customer2);//Nusaba
        System.out.println();

        //--------search() method-------------
        Stack<String> strings = new Stack<>();
        strings.push("Bob");
        strings.push("Carlos");
        strings.push("Karen");





        //------------------Iterator--------------------
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        //---------------for-------------------
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println();


        //----------------stream api------------------
        strings.stream().forEach((element) -> {
            System.out.println(element);
        });

        //-----------Transfering Stack to Arraylist------------------

        Stack<String> integers = new Stack<>();
        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list);

        while(list.size()>0){
            integers.push(list.remove(0));

        }
        System.out.println(integers);

        while(integers.size()>0){
            list.add(integers.pop());
        }
        System.out.println(list);


        //-----------------index() method-----------------
        // there are two way you can use index() method
        Stack<Customer> customers = new Stack<>();

        //first way
        Customer customerBobbi = new Customer("Bobbi");
        Customer customerShawn = new Customer("Shawn");


        customers.push(customerShawn);
        customers.push(customerBobbi);
        customers.push((new Customer("Bobba")));
        int index3= customers.search(new Customer("Bobba"));//second way

        int index1 = customers.search(customerBobbi);
        int index2 = customers.search(customerShawn);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);


    }
}
