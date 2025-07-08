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
    private int entrada;
    private int assentosVendidos = 0;
    

    
    public Sessao(Filme filme, Sala sala, String horario) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;

    }
    
    public boolean venderIngressos(int quantidade, int entrada) {
        int assentosDisponiveis = sala.getCapacidadeTotal() - assentosVendidos;

        if (quantidade <= assentosDisponiveis) {
            this.entrada = entrada;
            this.assentosVendidos += quantidade;
            return true;
        } else {
            return false;
        }
    }
    
    public void exibirSessao() {
        System.out.println("------------------------------");
        System.out.println("Sessão às " + horario + " | Sala: " + sala.getSalaNome());

        if (entrada == 1) {
            System.out.println("Entrada: Meia entrada");
        } else {
            System.out.println("Entrada: Inteira");
        }

        System.out.println("Quantidade de ingressos: " + assentosVendidos);
        System.out.println("Filme: " + filme.getTituloFilme());
        filme.listaDeAtores();
        System.out.println("------------------------------");
    }
    
    public int getAssentosDisponiveis() {
        return sala.getCapacidadeTotal() - assentosVendidos;
    }
    
}
