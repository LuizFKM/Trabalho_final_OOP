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
    private int capacidadeTotal;
    private String nomeSala;
    
   
    
    public Sala(int salaID, int capacidadeTotal, String nomeSala){
        this.capacidadeTotal = capacidadeTotal;
        this.salaID = salaID;
        this.nomeSala = nomeSala;
        
    }

    public int getSalaID() {
        return salaID;
    }
    
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public String getSalaNome(){
        return nomeSala;
    }

    public int getAssentosDisponiveis() {
        return capacidadeTotal;
    }

    public void setSalaID(int salaID) {
        this.salaID = salaID;
    }


}
