package com.antipattern.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MockService {

    private AnotherMockService anotherMockService;

    public void save() {
        log.info("Save");
    }

    public void saveDetails() {
        log.info("Save");
    }

    public void find(){
        log.info("Only find");
    }

    public void findWithCurd(){
        drop();
    }

    public void drop(){

    }

    public void findAndSave(){
        find();
        save();
    }

    public void findW(){
        find();
        anotherMockService.save();
    }

    public void create() {
        log.info("Create");
    }
}
