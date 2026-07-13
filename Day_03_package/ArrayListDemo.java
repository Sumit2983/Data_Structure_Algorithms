package Data_Structure_Algorithms.Day_03_package;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo{
    public static void Alloops(){
        
    }

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Size = "+fruits.size());
//  reverse funciton 
        Collections.reverse(fruits);
        System.out.println("Reversed: "+fruits);



//   sort arraylist
        Collections.sort(fruits);
        System.out.println("Sorted: "+fruits);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(11);
        // maximum number in arraylist
        System.out.println("Maximum number: " + Collections.max(numbers));

        // minimum number in arraylist
        System.out.println("Minimum number: " + Collections.min(numbers));




  //Question      // you hava a parking lot you have cark,trucks, bikes,buses  and have oops principal implement all principal
        

    }
}