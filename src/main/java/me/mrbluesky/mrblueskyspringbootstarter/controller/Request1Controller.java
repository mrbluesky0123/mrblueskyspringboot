package me.mrbluesky.mrblueskyspringbootstarter.controller;

import me.mrbluesky.mrblueskyspringbootstarter.service.Request1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/req1")
public class Request1Controller {
it bash
    private Request1Service request1Service;

    @Autowired
    public Request1Controller(Request1Service request1Service) {
        this.request1Service = request1Service;
    }

    @GetMapping(value = "/{request}")
    public int getRequest1Result(@PathVariable Integer request) {
        return this.request1Service.getResult(request);
    }

}
