package br.com.fiap.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Calculadora {
    public int dividir(int n1, int n2) throws Exception{

            return n1/n2;
    }
    public void gravarArquivo(String valor) throws SecurityException, FileNotFoundException, IOException{
        //Código
    }

    public void depositar(double valor){
        double saldo = 100;
        if (valor < 0){
            throw new IllegalArgumentException();
        }
        saldo = saldo + valor;
    }


}
