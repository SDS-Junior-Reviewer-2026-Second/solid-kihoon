package weather;

public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Email email;

    public WeatherTracker() {
        phone = new Phone();
        email = new Email();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (phone.generateWeatherAlert(weatherDescription) != null)
            System.out.print(phone.generateWeatherAlert(weatherDescription));
        if (email.generateWeatherAlert(weatherDescription) != null)
            System.out.print(email.generateWeatherAlert(weatherDescription));
    }
}