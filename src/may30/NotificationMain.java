package may30;

public class NotificationMain {

    public static void main(String[] args) {
        Notification notification = new EmailNotification("Welcome to the system");
        Notification sms = new SmsNotification("Welcome to the system");
        Notification push = new PushNotification("Welcome to the system");
        notification.send();
        sms.send();
        push.send();
        Notification whatsApp
                = new
                WhatsAppNotification("Whats App notification");
        whatsApp.send();
    }
}
