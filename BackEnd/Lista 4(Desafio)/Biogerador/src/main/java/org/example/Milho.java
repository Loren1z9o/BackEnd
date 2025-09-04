package org.example;
public class Milho extends Biocombustivel {
    public Milho(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return quilogramas + 1000;
    }
}
