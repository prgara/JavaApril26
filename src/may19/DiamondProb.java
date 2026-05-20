package may19;

public class DiamondProb {
}


class Aa{
    void show(){
        System.out.println("class A");
    }
}


class Bb extends Aa {
    void show(){
        System.out.println("class B");
    }
}class Cc extends Aa {
    void show(){
        System.out.println("class C");
    }
}


class Dd extends Bb{
    public static void main(String[] args) {
        Dd d = new Dd();
//        d.show();
        Bb b = new Bb();
        b.show();
    }
}
