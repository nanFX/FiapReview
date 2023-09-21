package br.com.fiap.exception;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
    try {
        int div = num1/num2;
        System.out.println("O resultado da divisão é: " + div);
    } catch (ArithmeticException e){
        System.err.println("Erro ao dividir!");
    }
        sc.close();
    }
}
