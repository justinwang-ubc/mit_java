package javatutorial;

import java.util.Set;
import java.util.TreeSet;

// my set demo
public class setDemo {
    
    // Set are like an arraylist,but no array index, only one cope of each object,
    // feature
    // add obecjt to the set
    // remove object from the set
    // is an object in thr set 
    
    public static void main(String[] args) {
        TreeSet<String> my_integer = new TreeSet<String>();
        
        my_integer.add("10");
        my_integer.add("2");
        my_integer.add("3");
        
        System.out.println(my_integer.size());
        System.out.println(my_integer.first());
        System.out.println(my_integer.last());
        
        my_integer.remove("10");
        
        for(String s: my_integer) {
            System.out.println(s);
        }
    }

}
