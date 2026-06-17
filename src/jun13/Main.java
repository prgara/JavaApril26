package jun13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {


    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); // 10 size
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("Strawberry");
        fruits.add("Pineapple");
        fruits.add("Banana");
        System.out.println(fruits.get(2));// cherry

        fruits.add(1, "Grapes");
        fruits.set(0, "Orange");
        fruits.set(1, "Orange");
        System.out.println("index of orange is : " + fruits.indexOf("Orange")); // 1, -ve, 0, null,
        fruits.remove("Orange");
        fruits.removeLast();
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Grapes"));


        List<Integer> nums = new ArrayList<>(1500);


//        System.out.println(fruits);

        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
        }

        System.out.println("Using for each loop");
        System.out.println(fruits);

//        for (String fruit : fruits ){
//            if("Cherry".equalsIgnoreCase(fruit)){
//                fruits.remove(fruit);
//            }
//        }
//        System.out.println(fruits);

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            if ("Cherry".equalsIgnoreCase(iterator.next())) {
                iterator.remove();
            }
        }

        System.out.println(fruits);
    }
}
