package may30;

public class EmailNotification extends Notification{

    public EmailNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Email notification sent : " + message );
    }
}
