package br.edu.ifpb.ads.padroes.atv2;

public class Servico implements Item {

    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {

        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public void aceitar(Visitor visitor) {

        visitor.visitar(this);

    }

    @Override
    public double getValor() {

        return valor;

    }

    public String getDescricao() {

        return descricao;

    }
}