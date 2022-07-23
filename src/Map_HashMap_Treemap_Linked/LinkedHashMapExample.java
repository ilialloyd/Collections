package Map_HashMap_Treemap_Linked;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
           public static void main(String[] args) {

            //LinkedHashMap is the map type that you will get with the same order
            //you have inserted them all

            LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
            map.put(1994, "Ilham");
            map.put(1995, "Simuzer");
            map.put(1998, "Serxan");
            map.put(1968, "Nusaba");
            map.put(1964, "Tehran");

            //----------2 same key-------
            // first 1994's value will become Abdulali, last same key's value
            map.put(1994,"Abdulali");
            // OUTPUT: {**1994=Abdulali**, 1995=Simuzer, 1998=Serxan, 1968=Nusaba, 1964=Tehran}

            System.out.println(map+"\n");

            //---------------------to get value of the special key----------------------------------------
            System.out.printf(map.get(1995)+"\n");
            System.out.println("");

            //----------------------setting key or value to **null**----------------------------------------
            // you still can get their other pair with .get() method
            map.put(1999,null);
            map.put(null,"abc");
            System.out.println(map.get(1999));
            System.out.println(map.get(null));
            System.out.println("");


            //----------------------Passing Entries to another map----------------------------------------

            LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();

            map2.putAll(map);
            System.out.println(map2);

            //to get size of map
            System.out.println("Size of map2 is: "+map2.size());

            //to check if map empty or not
            System.out.println(map2.isEmpty());
            System.out.println(map2.size()==0);//you can try both
            System.out.println();


            //----------------------Checking if map contain certain elements--------------------------------


            System.out.println(map2.containsValue("Ilham"));// FALSE -Because we have menimsetmisiy Ilham-> Abduleli
            System.out.println(map2.containsKey(1998));//TRUE
            System.out.println();


            //----------------------remove method()--------------------------------
            System.out.println("Remove methodundan onceki size: "+map.size());
            map.remove(1998);//serxan
            System.out.println("Remove methodundan sonraki size: "+map.size());
            System.out.println();

            // to clear all the elements -------map.clear()-------


            //----------------------replace method()--------------------------------

            // System.out.println("Before replace: "+map.get(1994));
            String oldValue = String.valueOf(map.replace(1994,"ILHAM"));//when we set new value it return old value
            System.out.println("Before replace: "+oldValue);            // then it sets new to old value
            System.out.println("New Value: "+map.get(1994));//it sets new value(ILHAM)
            System.out.println();

            //----------------------Iterate keys and values(Print)--------------------------------

            Iterator<Integer > iterator = map2.keySet().iterator();
            while(iterator.hasNext()){
                Integer nextKey = iterator.next();
                System.out.println(nextKey+": "+map2.get(nextKey));
            }
            System.out.println();


            //----------------------NEW MAP--------------------------------
            LinkedHashMap<Integer, String> map3 = new LinkedHashMap<>();
            map3.put(1994, "Ilham");
            map3.put(1995, "Simuzer");
            map3.put(1998, "Serxan");
            map3.put(1968, "Nusaba");
            map3.put(1964, "Tehran");

            //----------------------for loop--------------------------------

            for(int key : map3.keySet()){
                System.out.println(key+" "+map3.get(key));
            }
            System.out.println();

            //----------------------With Stream - forEach loop----------------------

            map3.entrySet().stream().forEach((Map.Entry<Integer,String> entry)->{
                System.out.println(entry.getKey()+" "+entry.getValue());
            });

        }
    }



