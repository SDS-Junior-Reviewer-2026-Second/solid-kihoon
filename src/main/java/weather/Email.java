package weather;

public class Email implements Notifier {
    public String generateWeatherAlert(String weatherDescription) {
        if (weatherDescription == "sunny") {
            String alert = "It is " + weatherDescription;
            return alert;
        } else return "";
    }
}