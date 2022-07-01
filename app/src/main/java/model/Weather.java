package model;

public class Weather {private String DateTime;
    private String Datetime;
    private int weatherIcon;
    private String iconPhrase;
    private Temperature temperature;

    public Weather(String dateTime, String datetime, int weatherIcon, String iconPhrase, Temperature temperature) {
        DateTime = dateTime;
        Datetime = datetime;
        this.weatherIcon = weatherIcon;
        this.iconPhrase = iconPhrase;
        this.temperature = temperature;
    }

    public Weather() {
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getDatetime() {
        return Datetime;
    }

    public void setDatetime(String datetime) {
        Datetime = datetime;
    }

    public int getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}
