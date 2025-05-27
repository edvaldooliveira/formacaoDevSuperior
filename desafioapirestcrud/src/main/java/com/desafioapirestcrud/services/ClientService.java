package com.desafioapirestcrud.services;

import com.desafioapirestcrud.clientRepository.ClientRepository;

import com.desafioapirestcrud.dto.ClientDTO;
import com.desafioapirestcrud.entities.Client;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
   public ClientDTO findById(Long id){
    Optional<Client> result = repository.findById(id);
       Client client = result.get();
       ClientDTO dto = new ClientDTO(client);
       return dto;
   }

   @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
       List<Client> result = repository.findAll();

        return result.stream().map(x -> new ClientDTO(x)).toList();


    }

}
