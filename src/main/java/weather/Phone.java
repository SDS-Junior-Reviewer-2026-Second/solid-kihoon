package weather;

public class Phone implements Notifier {
    public String generateWeatherAlert(String weatherDescription) {
        if (weatherDescription == "rainy") {
            String alert = "It is " + weatherDescription;
            return alert;
        } else return "";
    }
}