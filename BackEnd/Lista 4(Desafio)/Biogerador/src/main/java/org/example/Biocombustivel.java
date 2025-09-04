package org.example;
import java.util.Random;

public class Biocombustivel {
    protected float quilogramas;

    // Construtor com valor padrão 1000
    public Biocombustivel() {
        this.quilogramas = 1000;
    }

    public Biocombustivel(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    public float getQuilogramas() {
        return quilogramas;
    }

    public void setQuilogramas(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    // Método processar padrão
    public float processar() {
        Random random = new Random();
        int n = random.nextInt(3) + 1; // gera entre 1 e 3
        return quilogramas * n;
    }
}
