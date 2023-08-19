package br.unitins.hello.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Caderno extends PanacheEntity {

    private String titulo;    // ex: Caderno inteligente da barbie
    private String colecao;   // ex: Barbie by Niad
    private String tamanho;   // ex: TAM P

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getColecao() {
        return colecao;
    }
    public void setColecao(String colecao) {
        this.colecao = colecao;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
      
}
