package org.example;
public class Biogerador {
    private float potenciaAtual;
    private float cargaAtual;
    private final float cargaMaxima;

    // Construtor
    public Biogerador() {
        this.potenciaAtual = 0;
        this.cargaAtual = 0;
        this.cargaMaxima = 5;
    }

    // Getters e Setters
    public float getPotenciaAtual() {
        return potenciaAtual;
    }

    public void setPotenciaAtual(float potenciaAtual) {
        this.potenciaAtual = potenciaAtual;
    }

    public float getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(float cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    // Método carregar
    public void carregar(Biocombustivel b) throws GeradorCheioException {
        if (cargaAtual >= cargaMaxima) {
            throw new GeradorCheioException("O gerador já está cheio!");
        }
        float potenciaGerada = b.processar() * 2.36f;
        this.potenciaAtual += potenciaGerada;
        this.cargaAtual += 1;
    }

    // Método esvaziar
    public void esvaziar() {
        this.potenciaAtual = 0;
        this.cargaAtual = 0;
    }
}
