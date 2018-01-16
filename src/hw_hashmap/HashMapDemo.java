package hw_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by nkkhan on 1/10/18.
 */
public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John", "44223344");
        phoneBook.put("Chase", "66552233");


        Set s  = phoneBook.keySet();
        Iterator iterator = s.iterator();

        while (iterator.hasNext()){
            String key = (String) iterator.next();
            String value = (String) phoneBook.get(key);
            System.out.println("Name: "+key+", phone number = "+value);
        }
    }
}
