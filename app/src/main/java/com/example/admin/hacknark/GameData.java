package com.example.admin.hacknark;

import java.util.*;
import java.util.Map;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class GameData {
    public static Map<String,GameMode> NameToObjectMode = new HashMap<String,GameMode>();
    private static GameData instance;
    public ArrayList<GameMode> modes = new ArrayList<>();

    public GameData(){
        GameMode jeden = new GameMode(1);
        this.modes.add(jeden);
    }
}
