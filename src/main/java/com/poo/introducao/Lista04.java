package com.poo.introducao;

public class Lista04 {

    void ex1(){
        double[] precos = {2.50, 4.99, 9.98, 6.20, 15.49};
        double soma=0;

        for (int i=0; i<5; i++) {
            soma += precos[i];
        }

        System.out.println("--------------------------------------");
        System.out.println("Padaria do seu Zé");
        System.out.println("--------------------------------------");
        System.out.println("Valor total das vendas do dia: R$ " + soma );
        System.out.println("--------------------------------------");
    }
}
