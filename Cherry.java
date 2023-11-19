package com.example.stickyhero;

public class Cherry {
    private static int count;

    public Cherry(int count) {
        Cherry.count = count;
    }

    public Cherry() {
    }

    public static int getCount() {
        return count;
    }
    public void buyCherry(int no){}
    public void increment(int no){}
    public void decrement(int no){}
}
