package Map_HashMap_Treemap_Linked;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        /*
        # 1. Once key and values stored in the map, you can look up value later using its key
        # 2. Map contain key and value, and it called "entries"
        # 3. With HashMap you get data in random order, with TreeMap you get data with an order
        # 4. Always define type of Maps

         */
        HashMap<String, Customer> map = new HashMap<>();

        Customer customer1 = new Customer("10", "Shawn Gibson");
        Customer customer2 = new Customer("12", "Ruth Walton");
        Customer customer3 = new Customer("15", "Michael Farr");

        //to put new customer objects to the map we use put() Method

        //           key of map             value of map
        map.put(customer1.getTableNumber(), customer1);
        map.put(customer2.getTableNumber(), customer2);
        map.put(customer3.getTableNumber(), customer3);

        //-----------------------------Print for each loop-----------------------------------------

        //When we print map data we dont get them in inserted order

        for (Map.Entry<String, Customer> mapPrint : map.entrySet()) {
            System.out.println(mapPrint.getValue());
        }


        System.out.println("\n----------------------------");

        //-----------------------------istediyini cağırmaq üçün------------------------------------------

        // to get the certain order
        //yeni class duzeldirik
        Order order = new Order("12");//we call istediyimiz key and its value
        Customer customerForOrder = map.get(order.getTableID());//we send key to the map and menimsedirik Customer's new adress
        System.out.println(customerForOrder);//and we call
        System.out.println("\n----------------------------");

        //-----------------------------------------------------------------------------------------------


    }
}

