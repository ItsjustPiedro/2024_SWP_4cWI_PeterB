import at.htldornbirn._4cwi.swp.observer.NewsAgency;
import at.htldornbirn._4cwi.swp.observer.NewsChannel;

public class Main {

    String name ;

    public static void main(String[] args){


        //create new agencies
        var apa = new NewsAgency("APA");
        var reuters = new NewsAgency("reuters");


        // create news channel
        var orf = new NewsChannel("ORF.at");
        var nzz = new NewsChannel("nzz.ch");
        var mytimes = new NewsChannel("mytimes.com");

        //subscribe to apa
        apa.subscribe(orf);
        apa.subscribe(nzz);

        //subscribe to reuters
        reuters.subscribe(mytimes);

        //broadcast news

        apa.broadcast("Auf der Suche nach der nächsten Regierung");
        reuters.broadcast("Neues Gesetz für den Straßenbverkehr erlassen");


    }

}