package may30;

public abstract class Notification {

    String message;

    public Notification(String message) {
        this.message = message;
    }

    abstract void send();
}
