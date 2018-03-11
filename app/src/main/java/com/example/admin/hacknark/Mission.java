package com.example.admin.hacknark;

import java.util.ArrayList;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class Mission {
    public String name;
    boolean isDone;
    private String missionDescription;
    public ArrayList<MissionTask> tasks = new ArrayList<>();

    Mission(int a){
        this.isDone = false;
        switch(a){
            case 1:
                this.name = "Smok wawelski";
                this.missionDescription = "Poznaj legendę o smoku";
                MissionTask m1 = new MissionTask("Odnajdź kryjówkę smoka wawelskiego",
                        50.053151, 19.933751, MissionTask.TaskType.SEARCH);
                this.tasks.add(m1);
                //this.tasks.add(new MissionTask("Odnajdź kryjówkę smoka wawelskiego",
                //        50.053151, 19.933751, MissionTask.TaskType.SEARCH));
                //this.tasks.add(new MissionTask("Odnajdź posąg",
                //        50.053030,19.933586, MissionTask.TaskType.SEARCH));
                break;
            case 2:
                this.name = "Legendarny skarb";
                this.missionDescription = "Odkryj legendarny skarb";
                this.tasks.add(new MissionTask("Idź do pałacu Krzysztofory",
                        50.062920,19.936729, MissionTask.TaskType.SEARCH));
                break;

        }
        GameMode.NameToObjectMission.put(this.name,this);
    }

/*      Oblicza dystanse po punktach
    double distanceTo(BoundingBox bbx){
        if(this.isEmpty() || bbx.isEmpty())
            throw new NullPointerException("Coordinates of BoundingBox are not implemented");
        double lambda1 = this.getCenterX();
        lambda1 = lambda1 * 180/Math.PI;
        double fi1 = this.getCenterY();
        fi1 = fi1 * 180/Math.PI;
        double lambda2 = bbx.getCenterX();
        lambda2 = lambda2 * 180/Math.PI;
        double fi2 = bbx.getCenterY();
        fi2 = fi2 * 180/Math.PI;
        double result = Math.pow(Math.sin((fi2-fi1)/2),2) + Math.cos(fi1)*Math.cos(fi2)*Math.pow(Math.sin((lambda2-lambda1)/2),2);
        return 2*6378.14*Math.asin(Math.sqrt(result));
    }

*/
}
