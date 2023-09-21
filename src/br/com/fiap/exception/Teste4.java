package br.com.fiap.exception;

import br.com.fiap.banco.Conta;

public class Teste4 {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.retirar(100);

        }catch (Exception e){
            e.printStackTrace();
        }

        c.depositar(200);
    }
}
