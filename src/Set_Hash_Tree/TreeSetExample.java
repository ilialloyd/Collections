package Set_Hash_Tree;

import java.util.*;
import java.util.stream.Stream;

public class TreeSetExample {
    public static void main(String[] args) {

        //1.Cant contain two same elements
        //2. You can get elements sorted internally their natural order

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("World");
        set.add("1");
        set.add("2");
        set.add("3");

        //to see the size of Set
        int size = set.size();
        System.out.println("Size of Set is: " + size + "\n");

        //to check if set is empty or not
        boolean isEmpty = set.isEmpty();
        System.out.println("Set is empty? - " + isEmpty + "\n");

        // contains() method check if set contains given elements
        boolean given1 = set.contains("Hello");
        boolean given2 = set.contains("5");
        System.out.println("Does set contain Hello: " + given1);
        System.out.println("Does set contain 5: " + given2);

        System.out.println("\n" + "--------------" + "\n");


        //Print Set elements usint Inerator

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            //Output [1,2,3,Hello,World]
        }

        //---------------------------------------------------------------------
        System.out.println("\n" + "--------------" + "\n");

        //---------------------------------------------------------------------

        //with for loop

        for (String elements : set) {
            System.out.println(elements);
        }
        //---------------------------------------------------------------------

        System.out.println("\n" + "--------------" + "\n");
        //---------------------------------------------------------------------

        //With Stream
        //Java Stream api - https://www.youtube.com/watch?v=bcrl-GL0vV4&t=0s

        Stream<String> stream = set.stream();
        stream.forEach((element) -> {
            System.out.println(element);
        });
        //---------------------------------------------------------------------

        System.out.println("\n" + "--------------" + "\n");
        //---------------------------------------------------------------------

        //To remove elements
        Set<String> set1 = new TreeSet<>();
        set1.add("Hello");
        set1.add("World");
        set1.add("1");
        set1.add("2");
        set1.add("3");
        //set1.clear(); it will clear(delete) all set elements

        boolean remove1 = set1.remove("1");//if we have same element, it will remove and return true
        boolean remove2 = set1.remove("yes");// if we dont have it will remove false
        System.out.println(remove1);
        System.out.println(remove2);
        //---------------------------------------------------------------------
        System.out.println("\n" + "--------------" + "\n");
        //---------------------------------------------------------------------

        //Add new Sets of elements
        Set<String> set2 = new TreeSet<>();
        set2.add("Hello");
        set2.add("World");
        set2.add("1");
        set2.add("2");
        set2.add("3");
        set2.addAll(Set.of("1", "4", "yes"));
        System.out.println(set2);
        //Output :  [1, 2, 3, 4, Hello, World, yes]
        //It didnt add 1 2 times, because if you have same element in the old set it doenst add again

        //---------------------------------------------------------------------

        //remove sets of elements    ---------removeAll() Mehtod
        set2.removeAll(Set.of("1", "4", "yes"));
        System.out.println(set2);
        //Output: [2, 3, Hello, World]
        // Element "1" Deleted Because Old Set contain only "1"

        //---------------------------------------------------------------------
        //  retainAll() method
        set2.retainAll(Set.of("Hello", "1", "4", "yes"));
        System.out.println(set2);
        //OutPut:   [Hello]
        //Actually there were 2 elements, But because we remove element "1" one previous method we only got
        //one common element with old and new Set of elements

        //---------------------------------------------------------------------
        System.out.println("\n" + "--------------" + "\n");
        //---------------------------------------------------------------------

        // How to convert Set -> List

        Set<String> set4 = new TreeSet<>();
        set4.add("Hello");
        set4.add("World");
        set4.add("1");
        set4.add("2");
        set4.add("yes");
        set4.add("3");

        List<String> list = new ArrayList<>();
        list.addAll(set4);
        System.out.println(list);


    }
}


