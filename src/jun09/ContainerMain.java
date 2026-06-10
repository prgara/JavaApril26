package jun09;

import java.util.ArrayList;
import java.util.Objects;

public class ContainerMain {

    public static void main(String[] args) {
        Container<String,Integer,Boolean> cont = new Container<>("true",21,false);
        Container<Integer,Integer,String> cont1 = new Container<>(21,34,"Chair");
        Container<Boolean,String,String> bool = new Container<>(true,"false","Table");
        System.out.println(cont);
        System.out.println(cont1);
        System.out.println(bool);

    }
}
