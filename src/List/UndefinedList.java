package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UndefinedList {
    public static void main(String[] args) {
        int count = 7;
/*
Arraylist bir Arraylar listidir ve aşağıdakı add methodu ilə içini doldura bilərik
 */

        //we add 3 different object to array list
        List list = new ArrayList(); //or ArrayList list = new ArrayList();
        list.add("Object 1");
        list.add("Object 2");
        list.add(count);

        //to get exact index we use
        int num = (int) list.get(2); //because list accepted only objects, we downcast object to int
        System.out.println("Second index of list: " + num);//fist index is 0;

        //to get size of list
        int size = list.size();//because size return int, we use int
        System.out.println("Size of list: " + size);

        //to print all list elements we can use few loops

        //with while loop
        //with Iterator
        Iterator iterator = list.iterator();
        System.out.println("Print lists with iterator while loop:");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("\n---------------------\n");

        //with for loop
        System.out.println("Print lists with for loop:");
        for (Object next : list) {
            System.out.println(next);
        }

        System.out.println("\n---------------------\n");
        System.out.println("Print lists with  for(int i) loop:");


        //other form of for loop
        //But in this version if you use LinkedList it will work really slow
        //Because Linked list cat getr directly from certain index
        //it will check all the places before its index
        for (int i = 0; i < list.size(); i++) {
            Object next = list.get(i);
            System.out.println(next);
        }

        //to clear list
        list.clear();


    }
}

