package com.estacionamento.sistema_veiculos.model;

import jakarta.persistence.*;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private int quilometragem;
    private String status;

    // Getters e Setters
}
