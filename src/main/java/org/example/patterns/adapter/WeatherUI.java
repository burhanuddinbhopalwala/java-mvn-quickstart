package org.example.patterns.adapter;

public class WeatherUI {
    public static void main(String[] args) {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperature(11111);
        weatherUI.showTemperature(11112);
    }

    public void showTemperature(int zipcode) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        System.out.println(weatherAdapter.findTemperature(zipcode));
    }
}

