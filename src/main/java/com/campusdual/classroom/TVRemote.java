package com.campusdual.classroom;

public class TVRemote {

    int channel;
    int volume;
    boolean on;
    String color;

    public TVRemote(String color) {
        this.color = color;
        this.channel = 0;
        this.volume = 0;
    }

    public boolean turnOn() {
        this.on = true;
        return this.on;
    }

    public boolean turnOff() {
        this.on = false;
        return this.on;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.checkMinValue(this.channel)) {
            this.channel--;
        } else {
            System.out.println("El canal ya está al mínimo");
        }
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.checkMinValue(this.volume)) {
            this.volume--;
        } else {
            System.out.println("El volumen ya está al mínimo");
        }
    }

    public String getColor() {
        return this.color;
    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }

}
