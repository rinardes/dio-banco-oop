package com.nossobanco;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new LinkedList<Conta>();

    public List<Conta> getContas() {
        return contas;
    }

    public Conta GerarContaPoupanca(){
        Cliente novoCliente = new Cliente();
        Conta novaConta = new ContaPoupanca(novoCliente);
        PacoteDeServicos novoPacote = new PacoteDeServicos();
        novaConta.setPacoteDeServicos(novoPacote);
        return novaConta;
    }

    public Conta GerarContaCorrente() {
        Cliente novoCliente = new Cliente();
        Conta novaConta = new ContaCorrente(novoCliente);
        PacoteDeServicos novoPacote = new PacoteDeServicos();
        novaConta.setPacoteDeServicos(novoPacote);
        return novaConta;
    }

    public void AdicionarConta(Conta conta){
        contas.add(conta);
    }
}
