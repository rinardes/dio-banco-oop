package com.acesso;

import com.nossobanco.Banco;
import com.nossobanco.Conta;

public class Main {
    public static void main(String[] args) {
        Banco novoBanco = new Banco();
        Conta conta = novoBanco.GerarContaCorrente();
        conta.getTitular().setNome("Richard");

        novoBanco.AdicionarConta(conta);

        conta.Depositar(10);
        System.out.println(conta.getSaldo());

    }
}
