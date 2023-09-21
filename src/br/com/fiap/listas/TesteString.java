package br.com.fiap.listas;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Marihá Martins Alves Pereira";
        String[] nome1 = nome.split(" ");
        String nomeUpper = nome.toUpperCase();
        System.out.println("O nome : \n" + nomeUpper + " possui " + nomeUpper.length() + " caracteres.\n");

        for (String p: nome1) {
            System.out.println(p);
        }


        String nova = nome.substring(nome.lastIndexOf('P'));
        System.out.println("\n" + nova);

    }
}
