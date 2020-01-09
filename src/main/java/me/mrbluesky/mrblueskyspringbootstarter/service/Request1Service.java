package me.mrbluesky.mrblueskyspringbootstarter.service;

import org.springframework.stereotype.Service;

@Service
public class Request1Service {

    private int delta;
    private int weight;

    public Request1Service() {

        this.delta = 1;
        this.weight = 2;

    }

    public int getResult(Integer input) {


        return weight * (input + delta);

    }

}
