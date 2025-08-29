package org.example;

public class GeradorDePersonagem {
    String nome;
    int vida;
    int ataque;

    public GeradorDePersonagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void receberDano(int dano) {
        if (vida <= 0) {
            return;
        }

        vida -= dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " foi derrotado!");
        }
    }

    public void atacar(GeradorDePersonagem alvo) {
        if (alvo.vida <= 0) {
            System.out.println("O ataque falhou. " + alvo.nome + " já está derrotado.");
            return;
        }

        alvo.receberDano(this.ataque);
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
