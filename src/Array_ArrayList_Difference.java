import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Array_ArrayList_Difference {
    public static void main(String[] args) {

        /*
        --------------------------Array----------------------------------
       # 1.If you declare size of array, you can't add more than size, or you can't modifier size later on.
       2. Arrays can hold everything. primitives, objects
       3. we call fields(length, etc) with array
       4. you cant add new element end of your array. because it is immutable, you cant change because array has fixed size
       5. you cant remove element from the Array
         */
        //declaring array : declaring size first
        String[] family = new String[4];
        family[0] = "ilham";
        family[1] = "serxan";
        family[2] = "Simuzer";
        family[3] = "Nusaba";
        for (int i = 0; i < family.length; i++) {
            System.out.println(family[i]);
        }
        // or declaring values of array
        String[] friends = {"Tural", "Abdulali", "Nadir", "Elnur"};


        // to  set/change element in array
        family[0] = "Tehran";
        System.out.println(Arrays.toString(family));

       /*
       -----------------------ArrayList--------------------------
       1. arrayList can grow and shrink , so you don't need to worry about its size
       2. ArrayList can hold only Objects, but also wrapper type of primitives
       3. Mostly we call methods working with list
        */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Alma");
        list1.add("Armur");
        //or
        //when you declare asList, you cant change the values of the list. so this is safer if you will not modifier your list
        ArrayList<String> assistantsList = new ArrayList<>(Arrays.asList("Lee Ann", "Ilham", "Tom", "Suzanne"));

        //getting objects from the list
        System.out.println(list1.get(1));

        Iterator<String> iterator = assistantsList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //to add element we use add method
        //to set element we use set method
        //to remove element .remove()

    }
}
