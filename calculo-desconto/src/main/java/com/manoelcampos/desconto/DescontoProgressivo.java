package com.manoelcampos.desconto;

import java.util.Optional;

public class DescontoProgressivo implements Desconto{
    private Desconto proximo;
    @Override
    public Double calcular(Venda venda, double desconto, Cliente cliente) {

        if((venda.getValorTotal()/25) > 20){
            return 20.0;
        }else{
            return (venda.getValorTotal()/25);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
