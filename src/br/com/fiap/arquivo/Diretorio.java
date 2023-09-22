package br.com.fiap.arquivo;

import java.io.*;

public class Diretorio {
    public static void main(String[] args) {
        File diretorio = new File("diretorioTeste");

        if (diretorio.exists()){
            System.out.println("Diretorio existe!");
        }else {
            if (diretorio.mkdir()){
                System.out.println("Diretorio criado!");
            }else {
                System.out.println("Diretorio não foi criado!");
            }
        }
        File arquivo = new File(diretorio,"file.txt");
        try {
            if (arquivo.createNewFile())
                System.out.println("Arquivo criado!");
            else
                System.out.println("Arquivo não criado!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //Abre o arquivo para escrita
            FileWriter writer = new FileWriter(arquivo);
            PrintWriter print = new PrintWriter(writer);
            print.println("Escrevendo no arquivo criado\nNovo diretório\nNovo Arquivo");
            print.close();
            writer.close();

            //Abre o arquivo para leitura
            FileReader reader = new FileReader(arquivo);
            BufferedReader read = new BufferedReader(reader);
            String linha = read.readLine();
            while (linha!=null){
                System.out.println(linha);
                linha = read.readLine();
            }
            read.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
