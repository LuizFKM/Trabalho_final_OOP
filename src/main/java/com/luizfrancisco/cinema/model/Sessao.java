/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luizfrancisco.cinema.model;

import java.time.LocalTime;

/**
 *
 * @author User
 */
public class Sessao {
    private Filme filme;
    private Sala sala;
    private String horario;
    
    public Sessao(Filme filme, Sala sala, String horario) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
    }
    
    public void exibirSessao() {
        System.out.println("Sessão às " + horario + " na sala " + sala.getSalaID());
        System.out.println("Filme: ");
        filme.listaDeAtores();
        
    }
    
    
}
