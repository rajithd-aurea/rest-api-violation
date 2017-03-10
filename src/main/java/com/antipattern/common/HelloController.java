package com.antipattern.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/hello_post")
    public void postHello() {
        log.info("POST");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/hello_put")
    public void putHello() {
        log.info("PUT");
    }

    @PostMapping(value = "/hello_post_new")
    public void postNew() {
        log.info("POST New");
    }


}
