package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jogador {
    private String nome;

    public Jogador[] entrar(Jogador[] time,int posicao){
        time[posicao] = this;
        return time;
    }
}
