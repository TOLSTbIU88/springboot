package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MyControl {

    @RequestMapping(path = "/employee", method = RequestMethod.GET)
    public String employee() {

    }
}
