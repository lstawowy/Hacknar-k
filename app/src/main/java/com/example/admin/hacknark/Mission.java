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
                this.missionDescription = "Każdy zna legendę o wawelskim smoku, pokonanym przez dzielnego szewczyka Skubę, który zabił barana, wypchał go siarką i smołą, a następnie podrzucił pod smoczą jamę. Potwór, aby ugasić pragnienie, tak długo pił wiślaną wodę, aż pękł. Wielka była radość krakowian, a szewczyk ze skóry zabitego smoka wykroił wiele par butów. Jak głosi legenda, do dziś można je kupić w Sukiennicach.";
                MissionTask m1 = new MissionTask("znajdź jamę w której zamieszkał Smok Wawelski",
                        50.053151, 19.933751, MissionTask.TaskType.SEARCH);
                this.tasks.add(m1);
                MissionTask m2 = new MissionTask("znajdź pomnik Smoka Wawelskiego",50.053030, 19.933586, MissionTask.TaskType.SEARCH );
                this.tasks.add(m2);
                //this.tasks.add(new MissionTask("Odnajdź kryjówkę smoka wawelskiego",
                //        50.053151, 19.933751, MissionTask.TaskType.SEARCH));
                //this.tasks.add(new MissionTask("Odnajdź posąg",
                //        50.053030,19.933586, MissionTask.TaskType.SEARCH));
                break;
            case 2:
                this.name = "Legendarny skarb";
                this.missionDescription = "Dawno dawno temu w lochach pewnego palacu, zamożny czarnoksiężnik przechowywał swe skarby. Chętnych aby zdobyć bogactwo nigdy nie brakowało, choć szczęście dopisało jedynie pewnej krakowiance. Podążyła ona do Krzysztoforów za kogutem niknącym w lochach, a tam ptak przybrał postać diabła, strzegącego skarbu. Pozwolił jej zabrać tyle złota, ile zdoła sama unieść, przestrzegł jednak, by aż do wyjścia nie oglądała się za siebie, w przeciwnym razie wszystko straci. Dziewczyna, będąc już na ostatnim stopniu obejrzała się, czy przypadkiem czart jej nie ściga. Wtedy ciężkie drewniane wrota zatrzasnęły się z hukiem. I takim sposobem po dziś dzień gdzieś w lochach pałacu znajduje się ogromny skarb czekający na szczęśliwego śmiałka.";
                this.tasks.add(new MissionTask("Znajdź pałac o którym mowa w historii",
                        50.062920,19.936729, MissionTask.TaskType.SEARCH));
                break;
            case 3:
                this.name = "Dwie wieże";
                this.missionDescription = "Legenda o dwóch braciach, słynnych murarzach, którzy pod koniec XIII wieku zaczęli budowę. Kiedy starszy brat zorientował się, że jego wieża jest znacznie wyższa, nie chcąc dać się wyprzedzić - zamordował brata. Jednak wyrzuty sumienia nie dawały mu spokoju, dlatego wbił nóż w swoje serce, a potem rzucił się ze szczytu wieży. Ów skrwawiony braterską krwią nóż do dziś wisi, przykuty łańcuchem w Sukiennicach. ";
                this.tasks.add(new MissionTask("znajdź wieże budowane przez braci z opowieści",50.061628, 19.938997,MissionTask.TaskType.SEARCH));
                this.tasks.add(new MissionTask(""))

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

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
