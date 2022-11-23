package com.manoelcampos.desconto;

import java.util.Optional;

public class DescontoDefinido implements Desconto{
    private Desconto proximo;


    @Override
    public Double calcular(Venda venda, double desconto, Cliente cliente) {
        return venda.getValorTotal() * (desconto/100);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
