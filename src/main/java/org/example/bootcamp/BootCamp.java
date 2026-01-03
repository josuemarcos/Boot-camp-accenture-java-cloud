package org.example.bootcamp;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class BootCamp {
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(40);
    private String nome;
    private String descricao;
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();


    public Set<Conteudo> getConteudos(Conteudo conteudo) {
        return conteudos;
    }

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }


    public LocalDate getDataInicial() {
        return dataInicial;
    }


}
