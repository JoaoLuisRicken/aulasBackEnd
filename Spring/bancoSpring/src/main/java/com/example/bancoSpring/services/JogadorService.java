package com.example.bancoSpring.services;

import com.example.bancoSpring.models.Jogador;
import com.example.bancoSpring.repositories.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JogadorService {
    private JogadorRepository jogadorRepository;
    public JogadorService(JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }

    public Jogador createJogador(String nome, String sobrenome){

        Jogador novoJogador = new Jogador();
        novoJogador.setNome(nome);
        novoJogador.setSobrenome(sobrenome);
        novoJogador.setClube("Criciúma");
        jogadorRepository.save(novoJogador);
        return novoJogador;
    }
    public List<Jogador> getAllJogadores(){
        return jogadorRepository.findAll();
    }
}
