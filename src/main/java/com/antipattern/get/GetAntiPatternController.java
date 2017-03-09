package com.antipattern.get;

import com.antipattern.service.MockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GetAntiPatternController {

    @Autowired
    private MockService mockService;

    @RequestMapping(method = RequestMethod.GET, value = "/get_void")
    public void voidReturn() {
        log.info("Void return");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get_save", produces = "application/json")
    public GetResponse saveAndReturn() {
        mockService.save();
        return new GetResponse();
    }

    @GetMapping(path = "/get_void_new")
    public void voidNewReturn() {
        log.info("Void new");
    }


}
