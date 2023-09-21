package br.com.fiap.banco;

public class Teste {
    public static void main(String[] args) {
        Conta cc = new Conta();

        cc.setSaldo(50);
        cc.setAgencia(123);
        cc.setNumero(321);
        cc.depositar(100);
        System.out.println(cc.getSaldo());

        Conta poupanca = new Conta(111, 222, 1000);
        poupanca.retirar(50);
        System.out.println(poupanca.getSaldo());

        //Laço de repetição While
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.println(i);
        }

        //Laço de repetição Do-While
        i = 0;
        do {
            i = i + 1;
            System.out.println(i);
        }while (i < 10);
    }
}
