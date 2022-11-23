package com.manoelcampos.desconto;

import java.util.Optional;

public interface Desconto {

    Double calcular(Venda venda, double desconto, Cliente cliente);

    void setProximo(Desconto proximo);
}
