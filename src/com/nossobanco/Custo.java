package com.nossobanco;

import java.util.Date;

public class Custo {
    private double custoDoServico;
    private Date dataDeCobrança;

    public Custo(double custoDoServico) {
        this.custoDoServico = custoDoServico;
    }

    public double Cobrar(){
        //criar algo que verifique a data de cobrança no futuro.
        return custoDoServico;
    }
}
