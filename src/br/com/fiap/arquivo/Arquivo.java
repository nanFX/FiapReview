package br.com.fiap.arquivo;

import java.io.File;
import java.io.IOException;

public class Arquivo {
    public static void main(String[] args) {
        File arquivo = new File("Arquivos.txt");
        //Verifica se o arquivo existe;
        if (arquivo.exists()){
            System.out.println("Arquivo existe!"+
                    "\nPode ser lido....."+ arquivo.canRead()+
                    "\nPode ser gravado.."+arquivo.canWrite()+
                    "\nTamanho..........." +arquivo.length()+
                    "\nCaminho..........."+arquivo.getPath());
        }else {
            //Cria arquivo
            try {
                if (arquivo.createNewFile()){
                    System.out.println("Arquivo criado!");
                }else {
                    System.out.println("Arquivo não foi criado!");
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
