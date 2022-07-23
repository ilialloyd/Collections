package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod_Wildcard {

    //----------Creating Generic method---------
    private static<T> void shout(T thingsToShout){
        System.out.println(thingsToShout +"!!!!!!");
    }


    //Wilcard_Method

    //when you declare generic with -?- it means you can send any type to there
    private static void printList(List<?> mylist){
        System.out.println(mylist);
    }

    public static void main(String[] args) {
        shout("Ilham");


        //for example of wildcard
        //you ncan declare many different varaibles and objects using same method without error. it is not
        // type safety but still you dont need to declare everytime new methods or stuff
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        printList(intList);

        List<String >stringList = new ArrayList<>();
        stringList.add("StringList");
        printList(stringList);


    }
}
