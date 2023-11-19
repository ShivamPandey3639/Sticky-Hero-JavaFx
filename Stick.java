package com.example.stickyhero;

public class Stick {
    private double size;
    private Character taps;

    public Stick(double size, Character taps) {
        this.size = size;
        this.taps = taps;
    }

    public Stick() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void fall(double size){}
}
