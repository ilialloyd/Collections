package Iterator_Iterable_Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

//----------------------------Iterator .remove() method-------------------------------
        list.add("Bob");
        list.add("Keren");
        list.add("Shawn");
        System.out.println("Size of orijinal list is: " + list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();

        }
        System.out.println("Size of list after remove .method() is: " + list.size());
        System.out.println();


        //--------------ListIterator and .hasPrevious() method----------------------------

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hanna");
        arrayList.add("Suzanne");
        arrayList.add("Lee Ann");

        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());//will print list as a inserting order
        }

        //.hasPrevious() method
        //it calls object backward. if object has another object before that
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());//OUTPUT - Lee Ann, Suzanne, Hannah
        }
        System.out.println();


        //---------------MyIterator Implement----------------------------
        List<String> list2 = new ArrayList<>();
        list2.add("Ilia");
        list2.add("Tom");
        list2.add("Thomas");

        MyIterator<String> myListIterator = new MyIterator<>(list2);
        while (myListIterator.hasNext()) {
            System.out.println(myListIterator.next());
        }
        System.out.println();

        //------------iterator.forEachRemaining method with Lambda--------------------

        Iterator<String> iterator1 = list2.iterator();
        iterator1.forEachRemaining((elements) -> {
            System.out.println(elements);
        });


    }
}

