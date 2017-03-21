package com.antipattern.post;

import com.antipattern.service.MockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostAntiPatternController {

    public MockService mockService;

    @RequestMapping(method = RequestMethod.POST, value = "/person?username=abc&location=remote")
    public PostResponse filterRecords() {
        return new PostResponse();
    }

    @PostMapping("/person?username=abc")
    public PostResponse getRecords() {
        return new PostResponse();
    }

    @PostMapping("/person?username=abc")
    public void dropResults() {
        mockService.drop();
    }

    @PostMapping("/person")
    public void savePerson() {
        mockService.save();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void saveUser() {
        mockService.saveDetails();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public PostResponse filterUser(){
        mockService.find();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public PostResponse findAndSave(){
        mockService.findAndSave();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public PostResponse findFirstAndSave(){
        mockService.findW();
        return new PostResponse();
    }



}
