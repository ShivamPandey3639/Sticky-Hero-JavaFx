package com.example.stickyhero;

public class Pillar {
    private Platform p1;
    private Platform p2;

    public Pillar(Platform p1, Platform p2) {
        this.p1.setWidth(p1.getWidth());
        this.p2.setWidth(p2.getWidth());

    }


    public void setP1(Platform p1) {
        this.p1 = p1;
    }

    public void setP2(Platform p2) {
        this.p2 = p2;
    }
    public void positionP1(){}
    public void positionP2(){}

}
