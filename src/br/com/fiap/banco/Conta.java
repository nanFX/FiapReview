package br.com.fiap.banco;
public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public Conta() {
    }

    public Conta(int numero, int agencia, double saldo) {
        super();
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor < 0){
            throw new IllegalArgumentException();
        }
        saldo = saldo + valor;
    }

    public void retirar(double valor) throws Exception{
        if (valor > saldo){
            throw new Exception("Saldo insuficiente!");
        }
        saldo = saldo - valor;
    }

/**
 * Getters and Setters
 * */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}