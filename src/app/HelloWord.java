package app;

import java.util.Scanner;

public class HelloWord {

    public static void main(String[] args) {
//Inserindo a classe Scanner para coleta informação do usuário via teclado
        Scanner sc = new Scanner(System.in);
        int idade = 10;
        double preco = sc.nextDouble();
        char sexo = 'M';
        boolean maiorIdade = true;

//        maiorIdade = idade >= 18;

        if (maiorIdade == false && sexo != 'M') {
            System.out.println("Teste 002");
        } else if (maiorIdade == false && sexo != 'F') {
            System.out.println("Teste 003");
        } else {
            System.out.println("Teste 001");
        }

        System.out.println(preco);
        sc.close();
    }

}
