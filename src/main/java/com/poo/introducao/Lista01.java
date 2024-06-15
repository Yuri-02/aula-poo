package com.poo.introducao;

import java.util.Scanner;

public class Lista01 { 
    void ex1(){
        int num1;
        int num2;
        int res;

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.println("Digite mais um número: ");

        num2 = sc.nextInt();

        res = num1 + num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " é igual à: " + res);
        
    }

    void ex2(){
        String nome;
        String sobrenome;

        System.out.println("Digite seu primeiro nome: ");
        Scanner sc = new Scanner(System.in);

        nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: ");
        
        sobrenome = sc.nextLine();

        System.out.println("Olá, " + nome + " " + sobrenome + " !");
        
    }

    void ex3(){
        double valorReais;
        double valorDolar;

        System.out.println("Conversor Real R$ - Dólar $ ");
        System.out.print("Valor em R$: ");
        Scanner sc = new Scanner(System.in);

        valorReais = sc.nextDouble();

        valorDolar = valorReais / 5.25;

        System.out.println("------------------");
        System.out.println("Valor em $: " + valorDolar);

    }
}

