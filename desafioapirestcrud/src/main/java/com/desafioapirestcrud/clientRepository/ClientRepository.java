package com.desafioapirestcrud.clientRepository;

import com.desafioapirestcrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
