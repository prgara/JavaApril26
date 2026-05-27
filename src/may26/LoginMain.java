package may26;

public class LoginMain {

    public static void main(String[] args) {
        Login login = new Login("Tom","Tom1234");
        login.setPassword("Abcd");


//        login.password = "Abcd";

        login.loginToApp("Tom","Abcd");
    }
}
