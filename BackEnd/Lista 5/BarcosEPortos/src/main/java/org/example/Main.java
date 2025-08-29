package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando os barcos
        Barco barco1 = new Barco("Barco 1", 2);
        Barco barco2 = new Barco("Barco 2", 5);
        Barco barco3 = new Barco("Barco 3", 7);
        Barco barco4 = new Barco("Barco 4", 12);
        Barco barco5 = new Barco("Barco 5", 20);

        // Criando os portos
        PortoPequeno portoPequeno = new PortoPequeno();
        PortoGrande portoGrande = new PortoGrande();

        // Lista de barcos
        List<Barco> barcos = List.of(barco1, barco2, barco3, barco4, barco5);

        // Tentando atracar os barcos
        for (Barco barco : barcos) {
            portoPequeno.atracarBarco(barco); // Tentando no porto pequeno
            if (!portoPequeno.barcosAtracados.contains(barco)) {
                portoGrande.atracarBarco(barco); // Se não conseguir, tenta no porto grande
            }
        }

        // Mostrando barcos atracados
        portoPequeno.mostrarBarcos();
        portoGrande.mostrarBarcos();
    }
}
