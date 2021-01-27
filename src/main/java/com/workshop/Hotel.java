package com.workshop;

public class Hotel {
    private String name;
    private int ratesForWeekDays;

    public Hotel(String name, int rate) {
        this.name = name;
        ratesForWeekDays = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRatesForWeekDays() {
        return ratesForWeekDays;
    }

    public void setRatesForWeekDays(int ratesForWeekDays) {
        this.ratesForWeekDays = ratesForWeekDays;
    }
}
