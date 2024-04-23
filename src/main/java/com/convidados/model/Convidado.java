package com.convidados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Convidado implements Serializable {
    //serialVersionUID esta relacionado a interface Serializable
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    private String nome;

    private int quantidade_acompanhantes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade_acompanhantes() {
        return quantidade_acompanhantes;
    }

    public void setQuantidade_acompanhantes(int quantidade_acompanhantes) {
        this.quantidade_acompanhantes = quantidade_acompanhantes;
    }
}