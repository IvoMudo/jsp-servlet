package br.com.ada.model;

public record Address(
        String cep,
        String state,
        String city,
        String neighborhood,
        String street,
        String service
){}
