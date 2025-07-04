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
   
    
    public Sala(int salaID, int assentosDisponiveis){
        this.assentosDisponiveis = assentosDisponiveis;
        this.salaID = salaID;
        
    }

    public int getSalaID() {
        return salaID;
    }

    

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

}
