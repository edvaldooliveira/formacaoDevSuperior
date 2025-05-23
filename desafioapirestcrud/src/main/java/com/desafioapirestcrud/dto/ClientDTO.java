package com.desafioapirestcrud.dto;

import com.desafioapirestcrud.entities.Client;

public class ClientDTO {

    private Long id;
    private String name;
    private String cpf;
    private Double income;

      public ClientDTO(Long id, String name, String cpf, Double income) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
    }


    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }
}
