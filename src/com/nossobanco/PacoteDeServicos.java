package com.nossobanco;

import java.util.ArrayList;
import java.util.List;

public class PacoteDeServicos {

    private List<Servico> servicos = new ArrayList<>();

    public void AdicionarServico(Servico servico){
        servicos.add(servico);
    }
}
