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


        /*       if (cc instanceof Conta){
            System.out.println("cc é do tipo Conta");
        }else{
            System.out.println("cc não é do tipo Conta");
        }
        */
    }
}
