package org.example.bootcamp;

public class Curso extends Conteudo{

    public Curso(String titulo, String descricao, double cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    private double cargaHoraria;

    @Override
    Double calcularXp() {
        return this.cargaHoraria * XP_PADRAO;
    }
}
