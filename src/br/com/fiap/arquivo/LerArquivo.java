package br.com.fiap.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            //Abre o arquivo
            FileReader stream = new FileReader("Arquivo.txt");
            BufferedReader reader = new BufferedReader(stream);

            //Ler uma linha do arquivo
            String linha = reader.readLine();
            while (linha != null){
                System.out.println(linha);
                //Lê a próxima linha
                linha = reader.readLine();
            }
            reader.close();
            //Fechar o arquivo
            stream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
