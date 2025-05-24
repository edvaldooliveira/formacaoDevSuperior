package com.desafioapirestcrud.controllers;


import com.desafioapirestcrud.clientRepository.ClientRepository;
import com.desafioapirestcrud.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente")
public class ClientController {

    @Autowired
    ClientRepository repository;

    @GetMapping
    public String teste() {

     Optional<Client> result = repository.findById(1L);

        Client client = result.get();
       return client.getName();

    }

}
