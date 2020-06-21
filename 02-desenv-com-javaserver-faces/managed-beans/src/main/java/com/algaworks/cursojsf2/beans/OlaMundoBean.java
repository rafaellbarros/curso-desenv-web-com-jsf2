package com.algaworks.cursojsf2.beans;

// @ManagedBean
public class OlaMundoBean {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void enviar() {
        this.setNome(this.getNome().toUpperCase());
    }
}
