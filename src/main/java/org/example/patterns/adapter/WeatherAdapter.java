package org.example.patterns.adapter;

// Note: Typically use while integrating the  2 applications!
public class WeatherAdapter {
    public int findTemperature(int zipcode) {
        String city = null;
        if (zipcode == 11111) {
            city = "Dubai";
            WeatherFinder weatherFinder = new WeatherFinderImpl();
            return weatherFinder.find(city);
        }
        return -1;
    }
}
