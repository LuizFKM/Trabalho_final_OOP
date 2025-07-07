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
    private SalaWoodyAllen wa = new SalaWoodyAllen(1, 150, "Sala Woody Allen");
    private SalaStanleyKubrick sk = new SalaStanleyKubrick(2, 90, "Sala Stanley Kubrick");
    private Filme vanillaSky;
    private Filme meiaNoiteParis;
    private Filme matchPoint;
    private Sessao s1, s2, s3;
    
    int escolha = 0;
    int assentos = 0;
    
    public int MenuFilmes(){   
        
    Scanner menu = new Scanner(System.in);
    Scanner compra = new Scanner(System.in);

    Ator tomCruise = new Ator("Tom Cruise");
    Ator penelopeCruz = new Ator("Penelope Cruz");
    vanillaSky = new Filme("Vanilla Sky", "1:00");
    vanillaSky.adicionarAtor(tomCruise);
    vanillaSky.adicionarAtor(penelopeCruz);
    
    s1 = new Sessao(vanillaSky, sk, "15:00");
    
    Ator owenWilson = new Ator("Owen Wilson");
    Ator rachelMcAdams = new Ator("Rachel McAdams");
    meiaNoiteParis = new Filme("Meia-noite em Paris", "1:35");
    meiaNoiteParis.adicionarAtor(owenWilson);
    meiaNoiteParis.adicionarAtor(rachelMcAdams);
    
    s2 = new Sessao(meiaNoiteParis, wa, "17:00");
    
    Ator jonathanRhysMeyers = new Ator("Jonathan Rhys Meyers");
    Ator scarlettJohansson = new Ator("Scarlett Johansson");
    matchPoint = new Filme("Match Point", "2:04");
    matchPoint.adicionarAtor(jonathanRhysMeyers);
    matchPoint.adicionarAtor(scarlettJohansson);
    
    s3 = new Sessao(matchPoint, wa, "17:00");

        
        do {
            System.out.println("Filmes em cartaz: \n");
            System.out.println("1 - Vanilla Sky");
            System.out.println("2 - Meia noite em Paris");
            System.out.println("3 - Match Point");
            System.out.println("Digite 0 para sair\n");
            escolha = menu.nextInt();
            
            switch (escolha) {
                case 1:
                    if((sk.getAssentosDisponiveis() != 0)){
                        System.out.println("Voce escolheu Vanilla Sky");
                        System.out.println("Lugares disponiveis: " + sk.getAssentosDisponiveis());
                        System.out.println("Quantidade de ingressos: ");
                        assentos = compra.nextInt();
                        Comprovante(escolha);
                    } else {
                        System.out.println("Sessao esgotada");
                    }
                    
                    
                    break;
                case 2:
                    if ((wa.getAssentosDisponiveis() != 0)) {
                        System.out.println("Voce escolheu Meia-noite em Paris");
                        System.out.println("Quantidade de ingressos: ");
                        assentos = compra.nextInt();
                        Comprovante(escolha);
                    } else {
                    System.out.println("Sessao esgotada");
                    }
                    break;
                case 3:
                    if ((wa.getAssentosDisponiveis() != 0)) {
                        System.out.println("Voce escolheu Match Point");
                        System.out.println("Quantidade de ingressos: ");
                        assentos = compra.nextInt();
                        Comprovante(escolha);
                    } else {
                        System.out.println("Sessao esgotada");
                    }
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
    
    public void Comprovante(int escolha){
        switch (escolha) {
            case 1:
                sk.atualizaAssentos(assentos);
                s1.exibirSessao();
                break;
            case 2:
                wa.atualizaAssentos(assentos);
                s2.exibirSessao();
                break;
            case 3:
                wa.atualizaAssentos(assentos);
                s3.exibirSessao();
                break;
        }
    }
}
