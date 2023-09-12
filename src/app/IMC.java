package app;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso ......");
        float peso = sc.nextFloat();
        System.out.println("Digite sua altura ....");
        float altura = sc.nextFloat();

        float imc = peso / (altura * altura);


        System.out.println(imc);
        if (imc >= 18.5 && imc <= 25) {
            System.out.println("Está dentro do peso normal");
        }else {
            System.out.println("Você está fora do peso normal");
        }

        sc.close();
    }
}
