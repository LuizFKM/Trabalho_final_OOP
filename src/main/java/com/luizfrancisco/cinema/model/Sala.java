/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luizfrancisco.cinema.model;

/**
 *
 * @author User
 */
public abstract class Sala {
    private int salaID;
    private int assentosDisponiveis;
    private String nomeSala;
    
   
    
    public Sala(int salaID, int assentosDisponiveis, String nomeSala){
        this.assentosDisponiveis = assentosDisponiveis;
        this.salaID = salaID;
        this.nomeSala = nomeSala;
        
    }

    public int getSalaID() {
        return salaID;
    }

    public String getSalaNome(){
        return nomeSala;
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setSalaID(int salaID) {
        this.salaID = salaID;
    }

    public void atualizaAssentos(int vendidos){
        if(vendidos <= assentosDisponiveis){
            this.assentosDisponiveis -= vendidos;
        } else {
            System.out.println("Quantidade solicitada maior que a de lugares disponíveis.");
        }
    }

}
