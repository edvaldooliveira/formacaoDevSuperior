package com.desafioapirestcrud.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class ClientController {


    @GetMapping
    public String teste() {
        return "ClienteTransfor";
    }

}
