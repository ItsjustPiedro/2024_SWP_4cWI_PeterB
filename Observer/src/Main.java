import at.htldornbirn._4cwi.swp.observer.NewsAgency;
import at.htldornbirn._4cwi.swp.observer.NewsChannel;

public class Main {

    String name ;

    public static void main(String[] args){

        var newAgency = new NewsAgency("AUA");

        var newsChannel = new NewsChannel("ORF.at");

        System.out.println("New NewsAgency: " + newAgency + " has been created" );

        System.out.println("New NewsChannel: " + newsChannel + " has been created" );

    }

}