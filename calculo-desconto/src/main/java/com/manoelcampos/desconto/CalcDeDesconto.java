package com.manoelcampos.desconto;

import java.time.LocalDate;
import java.util.Optional;

public class CalcDeDesconto {

    public static void main(String[] args) {
        final Venda venda = new Venda(0, LocalDate.now(), 20000);
        final Cliente cliente = new Cliente(1, "Bruno", LocalDate.now());

        double descontoProgressivo = new DescontoProgressivo().calcular(venda, 0.0, cliente);
        double descontoAni = new DescontoAniversario().calcular(venda,0.0,cliente);
        double descontoDefinido = new DescontoDefinido().calcular(venda,0.0,cliente);

        System.out.println("Desconto definido: "+descontoDefinido);
        System.out.println("Desconto Aniversário: "+descontoAni);
        System.out.println("Desconto Progressivo: "+descontoProgressivo);
    }
}
