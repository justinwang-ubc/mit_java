package javatutorial;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {

    
    // store a (key,value) pair of object
    // look up the key , get back the value 
    
    public static void main(String[] args) {
        HashMap<Integer , String> address = new HashMap<Integer, String>();
        
        address.put(1, "evan");
        address.put(2, "eugene");
        address.put(3, "adam");
        
        
        System.out.println(address.size());
        address.remove(1);
        System.out.println(address.get(2));
        
        
        for(Integer i : address.keySet()) {
            System.out.println("key: " + i + " value: " + address.get(i));
        }
        
        for(String s: address.values()) {
            System.out.println(s);
        }
        
        for( Map.Entry<Integer,String> pairs  : address.entrySet()) {
            System.out.println(pairs);
        }
    }
}
