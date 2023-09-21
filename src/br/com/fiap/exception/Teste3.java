package br.com.fiap.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            //Faz a leitura de 2 numeros inteiros
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            //realiza a divisão
            int div = num1/num2;
            //imprime o resultado na tela
            System.out.println("O resultado da divisão é: " + div);
        } catch (ArithmeticException e){
            System.err.println("Erro ao dividir!");
        } catch (InputMismatchException e){
            System.err.println("Erro de entrada de dados!");
        }finally {
            System.out.println("Finalizando a execução do programa!");
            sc.close();
        }

    }
}
