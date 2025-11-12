package com.estacionamento.sistema_veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estacionamento.sistema_veiculos.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> { }
