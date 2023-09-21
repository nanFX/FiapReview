package br.com.fiap.listas;

import br.com.fiap.banco.Conta;

import java.util.Scanner;

public class TesteArray {
    public static void main(String[] args) {
        int notas[] = new int[4];
        notas[0] = 10;
        notas[1] = 12;
        notas[2] = 14;
        notas[3] = 16;
        System.out.println(notas[0]);
        int nota[] = {10,9,8,2};
        int not[] = new int[]{4,6,8,10};

        //Exemplo
        Scanner sc = new Scanner(System.in);
        float[] notas1 = new float[2];
        for (int i = 0; i<notas1.length; i++){
            System.out.println("Digite a nota do aluno");
            notas1[i] = sc.nextFloat();
        }

        //Calcular média dos alunos
        float totalNotas = 0;
        for (int i = 0; i < notas1.length; i++) {
            totalNotas = totalNotas + notas1[i];
        }
        float mediaNotas = totalNotas/notas1.length;
        System.out.println("A média é: " + mediaNotas);

        Conta[] cc = new Conta[1];
        Conta cc1 = new Conta();
        cc1.setNumero(123);

        cc[0] = cc1;
        int numero = cc[0].getNumero();
        System.out.println(numero);

        for (Conta ccs: cc) {
            System.out.println(ccs.getNumero());
        }


    }
}
