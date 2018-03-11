package com.example.admin.hacknark;

import java.util.*;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class GameMode {
    public ArrayList<Mission> missions = new ArrayList<>();
    public String name;
    public String modeDescription;
    public boolean tasksChronologyOn;  // odblokowywanie kolejnych misji
    public java.util.Map<String,Mission> NameToObjectMission = new HashMap<String,Mission>();

    //If exists
    GameMode(int a){
        switch(a){
            case 1:
                Mission jeden = new Mission(1);
                Mission dwa = new Mission(2);
                Mission trzy = new Mission(3);
                Mission cztery = new Mission(4);
                Mission piec = new Mission(5);
                Mission szesc = new Mission(6);
                Mission siedem = new Mission(7);
                Mission osiem = new Mission(8);
                this.missions.add(jeden);
                this.missions.add(dwa);
                this.missions.add(trzy);
                this.missions.add(cztery);
                this.missions.add(piec);
                this.missions.add(szesc);
                this.missions.add(siedem);
                this.missions.add(osiem);
                for(Mission m:missions){
                    this.NameToObjectMission.put(m.name,m);
                }
                this.name = "Legendarny";
                this.modeDescription = "Odkryj niezwykły świat krakowskich legend. Poznaj miejsca owiane historią i tajemnicą. Wyrusz w podróż pełną magii kryjącej się w Krakowie!";
                GameData.NameToObjectMode.put(this.name,this);
        }
    }
}
