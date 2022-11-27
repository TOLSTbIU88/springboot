package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MyControl {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test() {
        log.info("Работает, Ура!");
        return "Ура, работает!";
    }

    @PostMapping(path = "/test")
    public String test2() {
        return "Постмаппинг работает!";
    }
}
