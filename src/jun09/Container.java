package jun09;

public class Container<L,U,R> {

    L item1;
    U item2;
    R item3;

    public Container(L item1, U item2,R item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return "Container{" +
                "item1='" + item1 + '\'' +
                ", item2='" + item2 + '\'' +
                ", item3='" + item3 + '\'' +
                '}';
    }
}
