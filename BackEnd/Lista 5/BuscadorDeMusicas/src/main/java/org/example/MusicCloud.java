package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<>();
        // Insira algumas músicas disponíveis aqui
        musicasDisponiveis.add(new Musica("Rap god", "Eminem"));
        musicasDisponiveis.add(new Musica("Macarena", "Los Del Rio"));
        musicasDisponiveis.add(new Musica("Evidências", "Chitãozinho & Xororó"));
    }

    public Musica buscarMusica(String titulo) throws Exception {
        for (Musica musica : musicasDisponiveis) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                return musica;
            }
        }
        throw new Exception("A música " + titulo + " não foi encontrada no sistema.");
    }
}
