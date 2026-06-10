package jun06;

import java.util.ArrayList;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);


        System.out.println(arrayList);

        float x = 10;
        int y = (int) x;

    }

    public <T extends Number> void show(T name){
        System.out.println(name);
    }

}
