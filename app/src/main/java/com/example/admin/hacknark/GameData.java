package com.example.admin.hacknark;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class GameData {
    private static GameData instance;
    public ArrayList<GameMode> modes = new ArrayList<>();

    public GameData(){
        GameMode jeden = new GameMode(1);
        this.modes.add(jeden);
    }
}
