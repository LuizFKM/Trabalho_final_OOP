/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luizfrancisco.cinema.model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Filme {
    private String tituloFilme;
    private String duracao;
    private ArrayList<Ator> elenco = new ArrayList<>();
    
    public Filme(String tituloFilme, String duracao){
        this.tituloFilme = tituloFilme;
        this.duracao = duracao;
        this.elenco = new ArrayList<>();
    }
    
    public void adicionarAtor(Ator ator) {
        elenco.add(ator);
    }
    
    public String getTituloFilme(){
        return this.tituloFilme;
    }
    
    public void listaDeAtores(){
        System.out.println("Elenco: ");
        for (Ator ator : elenco){
            System.out.println("- "+ ator.getNome());
        }
    }
}
