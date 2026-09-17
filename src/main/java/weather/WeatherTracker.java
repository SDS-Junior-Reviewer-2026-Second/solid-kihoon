package weather;

public class WeatherTracker {
    String currentConditions;
    NotificationFactory notificationFactory;

    public WeatherTracker() {
        notificationFactory = new NotificationFactory();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        Notification notification = notificationFactory.create(weatherDescription);
        String alert = notification.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }
}