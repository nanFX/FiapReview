package br.com.fiap.exception;

public class Teste2 {
    public static void main(String[] args) {
        int[] array = new int[2];

        try {
            //tenta acessar uma posição inexistente no vetor
            array[2] = 10;
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Mensagem de erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
