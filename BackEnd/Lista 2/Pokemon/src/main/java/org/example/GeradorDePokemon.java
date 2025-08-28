package org.example;

import java.util.Random;

public class GeradorDePokemon {

    private static final String[] NOMES = {"Pikachu", "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon",
            "Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie",
            "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill",
            "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate",
            "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu",
            "Raichu", "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina",
            "Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking", "Clefairy",
            "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff",
            "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume",
            "Paras", "Parasect", "Venonat", "Venomoth", "Diglett",
            "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck",
            "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag",
            "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam",
            "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell",
            "Victreebel", "Tentacool", "Tentacruel", "Geodude", "Graveler",
            "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro",
            "Magnemite", "Magneton", "Farfetch’d", "Doduo", "Dodrio",
            "Seel", "Dewgong", "Grimer", "Muk", "Shellder",
            "Cloyster", "Gastly", "Haunter", "Gengar", "Onix",
            "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb"};

    private static final String[] TIPOS = {
            "Normal", "Fogo", "Água", "Grama", "Elétrico",
            "Gelo", "Lutador", "Venenoso", "Terrestre", "Voador",
            "Psíquico", "Inseto", "Pedra", "Fantasma", "Dragão",
            "Noturno", "Metálico", "Fada"
    };

    private static final Random RANDOM = new Random();

    public static String gerarPokemon() {
        String nome = NOMES[RANDOM.nextInt(NOMES.length)];
        String tipo = TIPOS[RANDOM.nextInt(TIPOS.length)];
        int nivel = RANDOM.nextInt(100) + 1;

        return nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".";
    }
}
