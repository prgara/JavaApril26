package may26;

public class A {

     void show() {
        System.out.println("class A");
    }
}

class B extends A {

     void show() {
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        A a =  new B(); //upcasting
        a.show();
    }
}
