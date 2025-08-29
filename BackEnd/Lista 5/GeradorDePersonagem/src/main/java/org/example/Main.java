package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<GeradorDePersonagem> inimigos = new ArrayList<>();
        inimigos.add(new GeradorDePersonagem("Orc", 100, 10));
        inimigos.add(new GeradorDePersonagem("Goblin", 50, 5));
        inimigos.add(new GeradorDePersonagem("Lobo", 75, 15));
        inimigos.add(new GeradorDePersonagem("Cavaleiro", 200, 20));
        inimigos.add(new GeradorDePersonagem("Dragão", 500, 50));

        GeradorDePersonagem jogador = new GeradorDePersonagem("Steve", 100, 20);
        Random random = new Random();

        while (jogador.estaVivo() && inimigos.stream().anyMatch(GeradorDePersonagem::estaVivo)) {
            // Jogador ataca inimigo aleatório
            List<GeradorDePersonagem> vivos = inimigos.stream().filter(GeradorDePersonagem::estaVivo).toList();
            if (!vivos.isEmpty()) {
                GeradorDePersonagem alvo = vivos.get(random.nextInt(vivos.size()));
                jogador.atacar(alvo);
            }

            // Inimigos vivos atacam jogador
            for (GeradorDePersonagem inimigo : inimigos) {
                if (inimigo.estaVivo()) {
                    inimigo.atacar(jogador);
                }
            }
        }

        if (!jogador.estaVivo()) {
            System.out.println(jogador.nome + " foi derrotado!");
        }
    }
}
