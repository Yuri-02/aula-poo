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

    void ex2(){
        double[] precos = {2.50, 4.99, 9.98, 6.20, 15.49};
        double maior=0;
        double menor = 100000000;

        for (int i=0; i<5; i++) {
            if (precos[i] > maior){
                maior = precos[i];
            } 
            if (precos[i] < menor){
                menor = precos[i];
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Padaria do seu Zé");
        System.out.println("--------------------------------------");
        System.out.println("A venda de maior valor do dia foi de: R$ " + maior );
        System.out.println("A venda de menor valor do dia foi de: R$ " + menor );
        System.out.println("--------------------------------------");
    }

    void ex3(){
        double[] precos = {2.50, 4.99, 9.98, 6.20, 15.49};
        double soma=0;
        double media;

        for (int i=0; i<5; i++) {
            soma += precos[i];
        }

        media=soma/precos.length;
        System.out.println("--------------------------------------");
        System.out.println("Padaria do seu Zé");
        System.out.println("--------------------------------------");
        System.out.println("A média do valor de vendas do dia foi de: R$ " + media);
        System.out.println("--------------------------------------");
    }
}
