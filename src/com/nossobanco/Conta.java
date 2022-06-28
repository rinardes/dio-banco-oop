package com.nossobanco;

public abstract class Conta extends  Servico {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private PacoteDeServicos pacoteDeServicos;

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente titular;


    public Conta(Cliente titular) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.titular = titular;
    }

    public void Sacar(double valor){
        saldo-=valor;
    }

    public void Depositar(double valor){
        saldo+=valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public PacoteDeServicos getPacoteDeServicos() {
        return pacoteDeServicos;
    }

    public void setPacoteDeServicos(PacoteDeServicos pacoteDeServicos) {
        this.pacoteDeServicos = pacoteDeServicos;
    }

    public Cliente getTitular() {
        return titular;
    }
}