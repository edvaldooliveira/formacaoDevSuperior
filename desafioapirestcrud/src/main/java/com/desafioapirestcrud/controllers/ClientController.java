package com.desafioapirestcrud.controllers;



import com.desafioapirestcrud.dto.ClientDTO;

import com.desafioapirestcrud.services.ClientService;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;
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

    @GetMapping
    public List<ClientDTO> findAll() {
       return service.findAll();
    }


}
