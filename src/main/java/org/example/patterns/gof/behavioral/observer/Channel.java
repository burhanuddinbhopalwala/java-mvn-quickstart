package org.example.patterns.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Observer
public class Channel {
    private final List<Subscriber> subs = new ArrayList<>();
    private String name;

    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }


    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    public void notifySubs() {
        for (Subscriber sub : subs) {
            sub.update();
        }
    }
}