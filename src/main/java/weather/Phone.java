package weather;

public class Phone implements Notification {
    public String generateWeatherAlert(String weatherDescription) {
        if (weatherDescription == "rainy") {
            String alert = "It is " + weatherDescription;
            return alert;
        } else return "";
    }
}