package may12;

public class Main {

    static {
        System.out.println("Static blocked executed");
    }

    {
        System.out.println("Instance block executed");
    }
    public Main() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Main main = new Main();

        Employee emp = new Employee("John",12);
    }
}
