package org.example.bootcamp;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo{
    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.dataMentoria = LocalDate.now();
    }

    private LocalDate dataMentoria;

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO + 40;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "dataMentoria=" + dataMentoria +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(dataMentoria, mentoria.dataMentoria);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dataMentoria);
    }
}
