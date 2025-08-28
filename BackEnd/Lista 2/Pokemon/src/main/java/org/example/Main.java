package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Pokémon você deseja gerar? ");
        int quantidade = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            System.out.println(GeradorDePokemon.gerarPokemon());
        }

        scanner.close();
    }
}
