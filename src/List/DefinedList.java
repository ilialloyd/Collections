package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DefinedList {
    public static void main(String[] args) {


        //you can define your arraylist to use certain type
        List<String> list = new ArrayList<String>();
        list.add("First place");
        list.add("Second place");
        list.add("Third place");
        //because we defined String in list you cant add other types to add method
        //     list.add(5)  //not possible

        System.out.println("Print lists for each loop:\n");

        for (String next : list) {//Because we defined String in array
            //we dont need to use Object or cast
            System.out.println(next);
        }
        System.out.println("\n---------------\n");
        System.out.println("Print lists with iterator while loop:\n");
        //with Iterator
        // Iterator check if the iteration(or loop) has more elements
        // hansı ki özündən sonra gəlkənin olub olmadığını yoxlayır
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();//because we defined String we dont need to use Object
            System.out.println(next);
        }


    }
}


