package Set_Hash_Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        //1.HashSet Set cant contain 2 same-similar element
        //2. You cant print with same order you wrote
        //3.
        Set<String> set1 = new HashSet<>();
        // we try to give 2 same element to the set
        System.out.println("Does set accepted both element we send it?");
        boolean add1 = set1.add("Hello");
        boolean add2 = set1.add("Hello");
        //Element accepted because there is not "Hello" element
        System.out.println("add1 --- " + add1);
        //2. attempt of insert same element is rejected - false
        System.out.println("add2 ---" + add2);

//it is possible to create Set that elements already added in it
        Set<String> set2 = Set.of("Hi", "Hello");

        System.out.println("\n" +
                "--------------" +
                "\n");

//With HashSet you cant print in order that you have added elements

        Set<String> set3 = new HashSet<>();
        set3.add("Hi");
        set3.add("What's up?");
        set3.add("1");
        set3.add("2");
        set3.add("3");

        //   set3.remove(2);//to remove element

        //To print set elemets we can use Iterator
        Iterator<String> iterator = set3.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println();
        //event it doesnt print same order if Set has elements already
        Set<String> set4 = Set.of("World", "Hello", "1", "2", "3", "4");
        System.out.println(set4);
        //Output: [3, 2, Hello, 1, World, 4]
        System.out.println();
        //With Iterator loop
        Iterator<String> iterator1 = set4.iterator();
        while (iterator.hasNext()) {
            String next = iterator1.next();
            System.out.println("With Iterator" + next);
        }
    }
}

