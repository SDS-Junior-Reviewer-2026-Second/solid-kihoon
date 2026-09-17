package weather;

public class NotificationFactory {
    public Notification create(String weatherDescription) {
        if (weatherDescription.equals("rainy")) return new Phone();
        if (weatherDescription.equals("sunny")) return new Email();
        return null;
    }
}
