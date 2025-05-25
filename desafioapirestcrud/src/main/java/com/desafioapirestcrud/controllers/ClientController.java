package com.desafioapirestcrud.controllers;


import com.desafioapirestcrud.clientRepository.ClientRepository;
import com.desafioapirestcrud.dto.ClientDTO;
import com.desafioapirestcrud.entities.Client;
import com.desafioapirestcrud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente")
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping(value = "/{id}")
 public ClientDTO findById(@PathVariable Long id) {
    ClientDTO dto = service.findById(id);
     return dto;
 }

}
