package com.antipattern.postput;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import com.antipattern.post.PostResponse;
import com.antipattern.service.MockService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PostMapping(path = "/resource/{id}", consumes = APPLICATION_JSON_VALUE)
    public PostResponse createResource2() {
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

    @PutMapping(path = "/resource/results/{resultId}", consumes = APPLICATION_JSON_VALUE)
    public PostResponse updateResourceWithPut2() {
        mockService.findAndSave();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/resource/{id}")
    public PostResponse deleteResource() {
        mockService.drop();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/resource/{id}")
    public PostResponse deleteResource2() {
        mockService.findAndSave();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/resource/{id}")
    public PostResponse deleteResource3() {
        mockService.findWithCurd();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/resource/{id}")
    public PostResponse patchResource() {
        mockService.drop();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/resource/{id}")
    public PostResponse patchResource2() {
        mockService.findAndSave();
        return new PostResponse();
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/resource/{id}")
    public PostResponse patchResource3() {
        mockService.findW();
        return new PostResponse();
    }
}
