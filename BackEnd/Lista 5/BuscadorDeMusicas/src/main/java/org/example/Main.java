package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud();

        System.out.print("Digite o nome da playlist: ");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        while (true) {
            System.out.print("Digite o nome da música (ou digite 'sair' para encerrar): ");
            String nomeMusica = scanner.nextLine();

            if (nomeMusica.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Musica musica = musicCloud.buscarMusica(nomeMusica);
                playlist.adicionarMusica(musica);
                System.out.println("Você adicionou a música " + musica.getTitulo() + " na playlist.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        playlist.imprimirPlaylist();

        scanner.close();
    }
}
