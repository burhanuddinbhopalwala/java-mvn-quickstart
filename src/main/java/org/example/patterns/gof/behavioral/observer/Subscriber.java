package org.example.patterns.gof.behavioral.observer;

// Subject
public class Subscriber {
    private String name;
    private Channel channel;

    public void update() {
        System.out.println("Video uploaded!");
    }
}
