package br.com.fiap.listas;

import br.com.fiap.banco.ContaCorrente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TesteColecao {
    public static void main(String[] args) {
        /**
         * Implementando exemplos de List -> Array List
         */


        ArrayList lista = new ArrayList();
        lista.add("Docker");
        lista.add("Java");
        lista.add("Git");
        lista.add("Code.org");
        for (Object p :lista) {
            System.out.println(p);

        }

        lista.set(3, "Lógica de Programação");
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.size());

        int indice = lista.indexOf("Git");
        System.out.println("O valor de \"GIT\" está dentro da posição " + indice);

        // Finalizado exemplos de List -> Array List


        /**
         * Implementando exemplos de SET -> HashSet
         */

        HashSet meses = new HashSet();

        meses.add("Jan");
        meses.add("Fev");
        meses.add("Mar");

        meses.add("Jan"); //Repetido
        System.out.println(meses);

        // Finalizando exemplos de SET -> HashSet

        /**
         * Implementando exemplos de MAP ->HashMap
         */
        HashMap mapa = new HashMap();
        mapa.put("COD001", "Marihá Martins");
        mapa.put("COD002", "Thiago Tressoldi");

        System.out.println(mapa);

        System.out.println(mapa.get("COD002"));

        mapa.remove("COD002");
        System.out.println(mapa.get("COD002"));

        /**
         * Implementando exemplos do uso de Objetos Genericos
         */

        ArrayList<ContaCorrente> conta = new ArrayList<ContaCorrente>();
        ContaCorrente conta01 = new ContaCorrente("Gold");
        conta.add(conta01);

        ContaCorrente conta02 = new ContaCorrente("Silver");
        conta.add(conta02);

        for (ContaCorrente p: conta) {
            System.out.println(p.getTipo());
        }
    }
}
