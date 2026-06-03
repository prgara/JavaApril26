package may30;

public class SmsNotification extends Notification{

    public SmsNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Sms notification sent : " + message);
    }
}
