package org.example.bootcamp;

public abstract class Conteudo {
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    protected String titulo;

    protected String descricao;
    public static final double XP_PADRAO = 10;

    public abstract Double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
