package com.example.admin.hacknark;

import java.util.ArrayList;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class GameMode {
    public ArrayList<Mission> missions = new ArrayList<>();
    private String name;
    private String modeDescription;
    private boolean tasksChronologyOn;  // odblokowywanie kolejnych misji

    //If exists
    GameMode(int a){
        switch(a){
            case 1:
                Mission jeden = new Mission(1);
                Mission dwa = new Mission(2);
                this.missions.add(jeden);
                this.missions.add(dwa);
                this.name = "Legendarny";
                this.modeDescription = "Tryb skierowany dla najmłodszych graczy. Odkryj niezwykły świat krakowskich" +
                        "legend i daj się porwać przygodzie.";
        }
    }
}
