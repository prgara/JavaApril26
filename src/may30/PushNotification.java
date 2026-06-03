package may30;

public class PushNotification extends Notification{
    public PushNotification(String message) {
        super(message);
    }


    @Override
    void send() {
        System.out.println("Push notification : "+ message);
    }
}
