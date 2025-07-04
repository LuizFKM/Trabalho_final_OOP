/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luizfrancisco.cinema.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {
    public int MenuFilmes(){   
        
    Scanner menu = new Scanner(System.in);
    
    SalaWoodyAllen wa = new SalaWoodyAllen(1, 150);
    SalaStanleyKubrick sk = new SalaStanleyKubrick(2, 90);
    
    Ator tomCruise = new Ator("Tom Cruise");
    Ator penelopeCruz = new Ator("Penélope Cruz");
    Filme vanillaSky = new Filme("Vanilla Sky", "1:00");
    vanillaSky.adicionarAtor(tomCruise);
    vanillaSky.adicionarAtor(penelopeCruz);
    
    Sessao s1 = new Sessao(vanillaSky, sk, "15:00");
    
    Ator owenWilson = new Ator("Owen Wilson");
    Ator rachelMcAdams = new Ator("Rachel McAdams");
    Filme meiaNoiteParis = new Filme("Meia-noite em Paris", "1:35");
    meiaNoiteParis.adicionarAtor(owenWilson);
    meiaNoiteParis.adicionarAtor(rachelMcAdams);
    
    Sessao s2 = new Sessao(meiaNoiteParis, wa, "17:00");
    
    Ator jonathanRhysMeyers = new Ator("Jonathan Rhys Meyers");
    Ator scarlettJohansson = new Ator("Scarlett Johansson");
    Filme matchPoint = new Filme("Match Point", "2:04");
    matchPoint.adicionarAtor(jonathanRhysMeyers);
    matchPoint.adicionarAtor(scarlettJohansson);
    
    Sessao s3 = new Sessao(matchPoint, wa, "17:00");

        int escolha = 0;
        do {
            System.out.println("Filmes em cartaz: \n");
            System.out.println("1 - Vanilla Sky");
            System.out.println("2 - Meia noite em Paris");
            System.out.println("3 - Match Point");
            System.out.println("Digite 0 para sair");
            escolha = menu.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu Vanilla Sky");
                    System.out.println("Quantidade de ingressos: ");
                    break;
                case 2:
                    System.out.println("Você escolheu Meia-noite em Paris");
                    break;
                case 3:
                    System.out.println("Você escolheu Match Point");
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
         return escolha;
    }
    
    public void Compra(){
        
    }
}
