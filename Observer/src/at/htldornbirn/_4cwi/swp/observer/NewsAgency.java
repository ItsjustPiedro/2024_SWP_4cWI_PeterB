package at.htldornbirn._4cwi.swp.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private final String name;
    private final List<NewsChannel> newsChannelList;

    public NewsAgency(String name) {

        this.name= name;

        this.newsChannelList = new ArrayList<NewsChannel>();

    }

    public void subscribe(NewsChannel channel)
    {
        System.out.println(channel + " has subscribed to " + this);
        this.newsChannelList.add(channel);
    }

    public void unsubscribe(NewsChannel channel)
    {
        System.out.println(channel + " has unsubscribed to " + this);
        this.newsChannelList.remove(channel);
    }

    public void broadcast(String news) {

        System.out.println(this + " broadcasts " + news);
        for (NewsChannel channel : newsChannelList)
        {
            channel.notify(news);
        }


    }

    @Override
    public String toString() {
        return this.name;
    }
}
