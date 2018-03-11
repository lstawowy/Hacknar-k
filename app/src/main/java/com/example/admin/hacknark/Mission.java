package com.example.admin.hacknark;

import java.util.ArrayList;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class Mission {
    public String name;
    boolean isDone;
    public String missionDescription;
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


                //Tworzenie eventów na mapce ->
                //createPUT("50.062920","19.936729","id","label","description");
                break;
            case 3:
                this.name = "Dwie wieże";
                this.missionDescription = "Legenda o dwóch braciach, słynnych murarzach, którzy pod koniec XIII wieku zaczęli budowę. Kiedy starszy brat zorientował się, że jego wieża jest znacznie wyższa, nie chcąc dać się wyprzedzić - zamordował brata. Jednak wyrzuty sumienia nie dawały mu spokoju, dlatego wbił nóż w swoje serce, a potem rzucił się ze szczytu wieży. Ów skrwawiony braterską krwią nóż do dziś wisi, przykuty łańcuchem w Sukiennicach. ";
                this.tasks.add(new MissionTask("znajdź wieże budowane przez braci z opowieści",50.061628, 19.938997,MissionTask.TaskType.SEARCH));
                this.tasks.add(new MissionTask("znajdź nóż w bramie", 50.061628, 19.938997, MissionTask.TaskType.SEARCH));
                break;
            case 4:
                this.name = "o Wandzie";
                this.missionDescription = "Księżniczka Wanda, która nie chciała poślubić germańskiego księcia Rydygiera, by nie oddawać kraju pod obce panowanie. Książę zagroził, że najedzie ziemie Wandy, ale płomienna mowa wygłoszona przez księżniczkę sprawiła, że wróg odstąpił od planu zbrojnego. Upokorzony książę odebrał sobie życie. Wanda była jednak smutna, bo wiedziała, że musi złożyć bogom ofiarę dziękczynną.";
                this.tasks.add(new MissionTask("znajdź miejsce upamiętniające księżniczkę Wandę", 50.070300, 20.068052,MissionTask.TaskType.SEARCH));
                break;
            case 5:
                this.name = "Zaczarowane gołębie";
                this.missionDescription = " Gdy na książęcym tronie zasiadł Henryk IV Prawy, zapragnął zjednoczyć wszystkie ziemie księstwa, ale nie miał pieniędzy. Wtedy wróżka zamieniła książęcą drużynę w gołębie. Obsiadły one kościół Mariacki i zaczęły wydziobywać kamyki, które spadając na ziemię zamieniały się w złote monety. Książę ze złotem wyprawił się do Rzymu po poparcie papieża. Ale po drodze ucztował, bawił się i stracił pieniądze. Nigdy już nie wrócił do Krakowa, a jego drużyna pozostała zaklęta. Gołębie z krakowskiego Rynku Głównego nie boją się ludzi i fruwają nad ich głowami. Czasem przysiadają na ramieniu, licząc, że to powracający książę, który zdejmie z nich czar. ";
                this.tasks.add(new MissionTask("przespaceruj się dookoła rynku karmiąc gołębie", 50.062654, 19.936929, MissionTask.TaskType.SEARCH));
                break;
            case 6:
                this.name = "Żółta ciżemka";
                this.missionDescription = " W 1867 r., w czasie prac konserwatorskich w kościele Mariackim, za ołtarzem Wita Stwosza odkryto zakurzony żółty trzewik. Jak się tam znalazł? Legenda głosi, że należał do Wawrzka, wiejskiego chłopca, który gdy tylko kawałek drewna znalazł, zabierał się za rzeźbienie. Raz tak zapomniał o Bożym świecie, że nie zauważył, jak krowa, której pilnował, zniszczyła zboże na polu proboszcza. Bał się Wawrzek do domu wrócić i uciekł w las. Tam zgubił drogę, szedł, szedł, aż znalazł się w Krakowie. Przygarnął go kanonik, który szybko poznał się na talencie chłopca i oddał go na naukę do mistrza Wita Stwosza. Talent Wawrzka docenił sam król Kazimierz Jagiellończyk i podarował chłopcu wymarzone żółte trzewiczki. Niestety, chłopiec nie cieszył się nimi zbyt długo. Chciał je włożyć na uroczystość odsłonięcia ołtarza, ale malując jedną z jego rzeźb zgubił jeden bucik, który spadł za ołtarz i przeleżał tam prawie 400 lat. A biedny Wawrzek znowu musiał chodzić boso.";
                this.tasks.add(new MissionTask("odnajdź ołtarz, który pomagał tworzyć Wawrzynek", 50.0616411,19.9380857, MissionTask.TaskType.SEARCH));
                break;
            case 7:
                this.name = "Żydowskie Wesele";
                this.missionDescription = "Jednym z najczęściej odwiedzanych miejsc Kazimierza jest plac na ul. Szerokiej. Pewnego dnia bogaty Żyd, mimo sprzeciwu rabina z pobliskiej synagogi Remuh, urządził w tym miejscu wesele córki. Zabawa trwała do późnego wieczora w piątek, kiedy już nastał szabas i czas modlitwy. Weselników spotkała za to sroga kara: wszyscy umarli tego samego wieczora. Od tej pory nigdy nie urządzano już w piątek żydowskich zaślubin, a po dziś dzień można nieopodal synagogi usłyszeć szepty i jęki przeklętych weselników. Tylko liczni goście okolicznych knajpek zdają się ich nie słyszeć... do czasu!";
                this.tasks.add(new MissionTask("Zjedz obiad w restauracji na Kazimierzu", 50.0616411,19.9380857, MissionTask.TaskType.SEARCH));
                break;
            case 8:

                break;

        }
    }



    public class PUTThread extends Thread {
        public String latitude;
        public String longitude;
        public String priority;
        public String id;
        public String label;
        public String icon;
        public String description;
        public String attachmentName;
        public String attachmentContentType;
        public String attachmentUrl;


        public void run(){
            String url = "https://hacknarock.release.commandcentral.com";
            URL obj = null;
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
            Date date = new Date();
            String acDate = dateFormat.format(date);
            String actDate = acDate.replace('_','T');
            String actualDate = actDate.concat(".000Z");
            System.out.print(actualDate);

            try {
                obj = new URL(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            HttpsURLConnection con = null;
            try {
                con = (HttpsURLConnection) obj.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }

            con.setRequestProperty("Authorization", "Basic " + "dmZWdHZnRVI2YjlvN3Zn");
            con.setRequestProperty("Content-Type", "application/json");

            try {
                con.setRequestMethod("PUT");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }
            con.setDoOutput(true);
            DataOutputStream wr = null;
            try {
                wr = new DataOutputStream(con.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }

            JSONObject js = null;
            try {
                js = new JSONObject("{\n" +
                        " \"metaHeader\":\n" +
                        " {\n" +
                        "   \"metaTimeStamp\": \""+actualDate+"\"\n" +
                        " },\n" +
                        " \"eventHeader\":\n" +
                        " {\n" +
                        "   \"id\": \""+id+"\",\n" +
                        "   \"label\": \""+label+"\",\n" +
                        "   \"timeStamp\": \""+actualDate+"\",\n" +
                        "   \"location\": {\n" +
                        "     \"latitude\": "+latitude+",\n" +
                        "     \"longitude\": "+longitude+"\n" +
                        "   },\n" +
                        "\"detailedDescription\": \""+description+"\","+
                        "   \"icon\":\n" +
                        "   {\n" +
                        "     \"url\": \"MsiIcon://"+icon+"\"\n" +
                        "   },\n" +
                        "   \"expirationTimeStamp\": \"2018-03-11T02:52:56.618Z\",\n" +
                        "   \"priority\": \""+priority+"\",\n" +
                        "    \"attachments\": [\n" +
                        "      {\n" +
                        "        // Title of Attachment\n" +
                        "        \"name\": \""+attachmentName+"\",\n" +
                        "        \"contentType\": \""+attachmentContentType+"\",\n" +
                        "        \"url\": \""+attachmentUrl+"\"\n" +
                        "      }\n" +
                        "    ]" +
                        " }\n" +
                        "}");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                wr.writeBytes(js.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                wr.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                wr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int responseCode = 0;
            try {
                responseCode = con.getResponseCode();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("\nSending 'POST' request to URL : " + url);
            //        System.out.println("Post parameters : " + urlParameters);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = null;
            try {
                in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String inputLine;
            StringBuffer response = new StringBuffer();

            try {
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //print result
            System.out.println(response.toString());


        }
    }

    public void createPUT(String lonitude, String latitude, String id, String label, String description) throws IOException, JSONException {
        //Dodawanie punktow na mapie
        PUTThread thread = new PUTThread();
        thread.longitude=longitude;
        thread.latitude=latitude;
        //priorities = ['emergency' | 'high' | 'medium' | 'low' | 'diagnostic' | 'unknown']
        thread.priority="medium";
        thread.id=id;
        thread.label=label;
        //iconsAvailable https://codepen.io/anon/pen/LQodbY
        thread.icon="ic_unit_police_sirens";
        thread.description=description;
        thread.attachmentName="Incident location";
        thread.attachmentContentType="application/link";
        thread.attachmentUrl="https://goo.gl/maps/Yiz4TLDBF3L2";

        thread.start();
    }

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
