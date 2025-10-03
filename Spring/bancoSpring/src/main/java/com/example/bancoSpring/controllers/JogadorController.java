package com.example.bancoSpring.controllers;

import com.example.bancoSpring.models.Jogador;
import com.example.bancoSpring.services.JogadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    private JogadorService jogadorService;
    public JogadorController(JogadorService jogadorService){
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public Jogador CreateJogador(@RequestBody Jogador jogador){
        return jogadorService.createJogador(jogador.getNome(), jogador.getSobrenome());
    }

    @GetMapping
    public List<Jogador> getAllJogadores(){
        return jogadorService.getAllJogadores();
    }
}
