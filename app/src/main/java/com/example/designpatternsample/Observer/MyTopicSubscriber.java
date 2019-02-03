package com.example.designpatternsample.Observer;

public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String nm){
        this.name=nm;
    }

    @Override
    public void update() {

    }

    @Override
    public void setSubject(Subject sub) {

    }
}
