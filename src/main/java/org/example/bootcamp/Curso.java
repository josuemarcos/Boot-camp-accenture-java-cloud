package org.example.bootcamp;

import java.util.Objects;

public class Curso extends Conteudo{

    public Curso(String titulo, String descricao, double cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    private double cargaHoraria;

    @Override
    public Double calcularXp() {
        return this.cargaHoraria * XP_PADRAO;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Double.compare(cargaHoraria, curso.cargaHoraria) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cargaHoraria);
    }
}
