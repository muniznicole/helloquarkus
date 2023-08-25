package br.unitins.hello.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Caderno {

    @Id // Gerar id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gerar id incrementando automaticamente
    private Long id;
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
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
      
}
