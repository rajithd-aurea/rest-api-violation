package com.antipattern.postput;

import com.antipattern.post.PostResponse;
import com.antipattern.service.MockService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostPutAntiPatternController {

    public MockService mockService;

    @RequestMapping(method = RequestMethod.POST, value = "/resource")
    public PostResponse createResource() {
        mockService.save();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/resource/{id}")
    public PostResponse createResourceWithPost() {
        mockService.findAndSave();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/anotherresource/{id}")
    public PostResponse createResourceWithPost2() {
        mockService.create();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/resource")
    public PostResponse updateResource() {
        mockService.findAndSave();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/resource/{id}")
    public PostResponse updateResourceWithPut() {
        mockService.findAndSave();
        return new PostResponse();
    }
}
