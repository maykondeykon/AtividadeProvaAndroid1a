package com.maykondeykon.atividade1a;

import java.io.Serializable;

/**
 * Created by maykon on 10/11/15.
 */
public class Estoque implements Serializable{
    private String nome;
    private String descricao;
    private String unidade;
    private Boolean perecivel;
    private Boolean promocao;
    private Boolean refrigerado;
    private String limite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Boolean getPerecivel() {
        return perecivel;
    }

    public void setPerecivel(Boolean perecivel) {
        this.perecivel = perecivel;
    }

    public Boolean getPromocao() {
        return promocao;
    }

    public void setPromocao(Boolean promocao) {
        this.promocao = promocao;
    }

    public Boolean getRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(Boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }
}
