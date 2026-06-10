package jun06;

public class OnlineWebApp {

    void register() throws EmailNotVerified{
        throw new EmailNotVerified("Your email is not verified");
//        System.out.println("Email registered");
    }

    void login() throws EmailNotVerified{
        register();
        System.out.println("user logged in");
    }

    void shop() throws EmailNotVerified {
        login();
        System.out.println("Added items to the cart");
    }

    void payment() throws EmailNotVerified {
        shop();
        System.out.println("Payment done successfully");
    }

}
