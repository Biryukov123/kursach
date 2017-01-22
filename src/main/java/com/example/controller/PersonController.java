package com.example.controller;

import com.example.dto.PersonDto;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {


    @Autowired
    PersonService service;

    @GetMapping(value = "/id{id}")
    public PersonDto read(@PathVariable Integer id) {

        return service.get(id);
    }

    @GetMapping
    public String read( ) {

        String s="";
        for (PersonDto personDto : service.getAll()) {
            s+=personDto.toString();
        }
        return s;
    }






}
