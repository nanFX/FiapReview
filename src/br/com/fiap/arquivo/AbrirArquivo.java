package br.com.fiap.arquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AbrirArquivo {
    public static void main(String[] args) {
        try {
            //Abre o arquivo
            FileWriter stream = new FileWriter("Arquivo.txt");
            PrintWriter print = new PrintWriter(stream);

            //Add texto no arquivo
            print.println("Escrevendo");
            print.println("No arquivo.");

            print.close();
            //Fecha o arquivo
            stream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
