package com.antipattern.get;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by rajith on 5/8/17.
 */
public class GetHyperLink extends ResourceSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
