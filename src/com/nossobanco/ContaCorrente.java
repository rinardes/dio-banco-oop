package com.nossobanco;

public class ContaCorrente extends  Conta {
    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    public  void Transferir(Conta destino, double valor){
        Sacar(valor);
        destino.Depositar(valor);
    }
}
