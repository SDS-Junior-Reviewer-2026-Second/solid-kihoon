package weather;

public class Email implements Notification {
    public String generateWeatherAlert(String weatherDescription) {
        if (weatherDescription == "sunny") {
            String alert = "It is " + weatherDescription;
            return alert;
        } else return "";
    }
}