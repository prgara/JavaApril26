package may30;

public class NotificationSystem {


    public static void main(String[] args) {
        String type = "email";

        if(type.equalsIgnoreCase("email")){
            System.out.println("Email notificiation sent");
        }else if (type.equalsIgnoreCase("sms")){
            System.out.println("Sms notification sent");
        } else if (type.equalsIgnoreCase("push")) {
            System.out.println("Push notification sent");
        } else if(type.equalsIgnoreCase("whatsApp msg"))
            System.out.println("Whats app msg sent");
    }
}
