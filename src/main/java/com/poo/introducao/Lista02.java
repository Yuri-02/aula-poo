package com.poo.introducao;
import java.util.Scanner;

public class Lista02 {

    void ex1(){
        int numDigitado;

        System.out.println("-----------------------------------------------------");
        System.out.print("Digite um número para saber se é par, ímpar ou zero: ");
        Scanner sc = new Scanner(System.in);

        numDigitado = sc.nextInt();

        if (numDigitado != 0){
            if((numDigitado % 2) == 0){
                System.out.println("O número " + numDigitado + " é par.");
            } else {
                System.out.println("O número " + numDigitado + " é ímpar.");
            }
        } else{
            System.out.println("O número é 0 (zero).");
        }
        sc.close();
    }

    void ex2(){
        double num1;
        double num2;
        System.out.println("-------------------------------");
        System.out.println("Descubra qual o maior número");
        System.out.println("-------------------------------");
        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextDouble();

        System.out.print("Digite o último número: ");

        num2 = sc.nextDouble();
        System.out.println("-------------------------------");

        if(num1 > num2){
            System.out.println("O número " + num1 + " é maior que " + num2);
        } else {
            System.out.println("O número " + num2 + " é maior que " + num1);
        }
        System.out.println("-------------------------------");
        sc.close();
    }
    }
