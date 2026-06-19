package jun16;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> cities  = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("Delhi");
        cities.add("Toronto");
        cities.add("Vancouver");

        List<String> countries = new ArrayList<>();
        countries.add("Canada");
        countries.add("India");
        countries.add("Japan");
        countries.add("USA");

        // list = tokyo,canada,india,japan,usa,delhi,toronto,vancouver
        cities.addAll(1,countries);
        System.out.println(cities);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list );

//        System.out.println(list.get(100000));


            for(Integer i : list){
                System.out.println(i);
            }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.reverse(list);
        Collections.unmodifiableList(list);
        Collections.synchronizedList(list);


        // for each or traditional for-loop, while

        System.out.println(list);


    }
}
