package com.antipattern.get;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import com.antipattern.service.MockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.GET, value = "/get_save_good", produces = "application/json")
    public GetResponse onlyFind() {
        mockService.find();
        return new GetResponse();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get_save_inner_crud", produces = "application/json")
    public GetResponse innerCrud() {
        mockService.findWithCurd();
        return new GetResponse();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get_save_regex", produces = "application/json")
    public GetResponse saveRegEx() {
        mockService.saveDetails();
        return new GetResponse();
    }

    @GetMapping(path = "/get_void_new")
    public void voidNewReturn() {
        log.info("Void new");
    }

    @GetMapping(path = "/get_link")
    public GetHyperLink getLink() {
        log.info(">>>>>>>>>>>>>>>>>>>");
        GetHyperLink getHyperLink = new GetHyperLink();
        getHyperLink.add(linkTo(ReflectionUtils
                .findMethod(GetAntiPatternController.class, "voidNewReturn"))
                .withRel("submission"));
        return new GetHyperLink();
    }


}
