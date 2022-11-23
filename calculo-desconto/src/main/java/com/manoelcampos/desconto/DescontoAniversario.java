package com.manoelcampos.desconto;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

public class DescontoAniversario implements Desconto {

    private Desconto proximo;

    @Override
    public Double calcular(Venda venda, double desconto, Cliente cliente) {
        if (Objects.equals(cliente.getDataNascimento(), LocalDate.now())) {
            return venda.getValorTotal()*0.15; // 10% de desconto no aniversário
        } else {
            return proximo.calcular(venda, desconto, cliente);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}