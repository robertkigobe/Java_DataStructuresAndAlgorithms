package Research;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
* Data dictionary gives us a data structure to insert, search delete using key value pairs
*Hash tables use key value pairs
*insertion has a complexity of O(1)
* load structure should be close to 1 meaning full utilization of the data structure
*big numbers can be stored by hashing the number to a smaller value
* collisions can happen when data is saved to an already filled position
* collisions can be handled by chaining where the hash table stores
* */
public class HashTables {

    public static void main(String[] args) {

        Hashtable<Integer, String> ht1 = new Hashtable<>();
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");

        ht2.put(4,"Four");
        ht2.put(5,"Five");
        ht2.put(6,"Six");

        System.out.println("Mappings of HT1: "+ ht1);
        System.out.println("Mappings of HT2: "+ ht2);

        Map<Integer,String> hm = new HashMap<>();
        hm.put(1, "Robert");
        hm.put(2, "Jacqueline");
        hm.put(3, "Lillian");

        Hashtable<Integer,String> ht3 = new Hashtable<>(hm); //this creates a hash table from the map
        System.out.println("Size of Map made from Hashmap is:- " + ht3.size());

        System.out.println("Before Update ht3 Map " + ht3);
        /* Check if a key is present and if present, print value  uses O(1) complexity */
        if (ht3.containsKey(2)) {
            String a = ht3.get(2);
            System.out.println("value for key 2 is:- " + a);
        }
        // Remove the map entry with key 4
        ht3.remove(2);

        ht3.put(3, "Rodney");
        System.out.println("Updated ht3 Map " + ht3);

        // Iterating using enhanced for loop
        for (Map.Entry<Integer, String> e : ht2.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
