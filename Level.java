package com.example.stickyhero;

import java.util.Map;

public class Level {
    private int level_no;
    private Map<Integer,Graphic> map;
    private Map<Integer,Sound> map1;

    public Level(int level_no, Map<Integer, Graphic> map, Map<Integer, Sound> map1) {
        this.level_no = level_no;
        this.map = map;
        this.map1 = map1;
    }

    public int getLevel_no() {
        return level_no;
    }

    public Map<Integer, Graphic> getMap() {
        return map;
    }

    public Map<Integer, Sound> getMap1() {
        return map1;
    }
}
