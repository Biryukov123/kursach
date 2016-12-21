package com.example.controller;

import com.example.dto.PersonDto;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonController {


    @Autowired
    @Qualifier(value = "personServiceImpl")
    PersonService service;

    @GetMapping(value = "/id1")
    public String read(@RequestParam(value = "id", required = false, defaultValue = "1") Integer id) {

        return service.get(id).toString();
    }

    @GetMapping(value = "/id2")
    public String read2(@RequestParam(value = "id", required = false, defaultValue = "2") Integer id) {

        return service.get(id).toString();
    }

    @GetMapping(value = "/id3")
    public String read3(@RequestParam(value = "id", required = false, defaultValue = "3") Integer id) {

        return service.get(id).toString();
    }

    @GetMapping(value = "/persons")
    public String readAll( ) {

        String s="";
        for (PersonDto personDto : service.getAll()) {
            s+=personDto.toString();
        }
        return s;
    }






}
