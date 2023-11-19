package com.example.stickyhero;

public class Character {
    private int taps;
    private Cherry count;
    private Stick length;

    public Character(int taps, Cherry count, Stick length) {
        this.taps = taps;
        this.count = count;
        this.length = length;
    }

    public Character() {
    }

    public int getTaps() {
        return taps;
    }

    public Cherry getCount() {
        return count;
    }

    public Stick getLength() {
        return length;
    }
    public void moveForward(Stick length){}
    public void jump(){}
    public void Avatar(Cherry count){}
    public void flippingDown(){}
    public void CollectCherry(Cherry count){}

}
