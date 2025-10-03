package com.example.bancoSpring.repositories;

import com.example.bancoSpring.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogadorRepository extends JpaRepository<Jogador, UUID> {

}
