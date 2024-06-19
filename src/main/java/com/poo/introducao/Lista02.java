package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {

    void ex1() {
        int numDigitado;

        System.out.println("-----------------------------------------------------");
        System.out.print("Digite um número para saber se é par, ímpar ou zero: ");
        Scanner sc = new Scanner(System.in);

        numDigitado = sc.nextInt();

        if (numDigitado != 0) {
            if ((numDigitado % 2) == 0) {
                System.out.println("O número " + numDigitado + " é par.");
            } else {
                System.out.println("O número " + numDigitado + " é ímpar.");
            }
        } else {
            System.out.println("O número é 0 (zero).");
        }
        sc.close();
    }

    void ex2() {
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

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que " + num2);
        } else {
            System.out.println("O número " + num2 + " é maior que " + num1);
        }
        System.out.println("-------------------------------");
        sc.close();
    }

    void ex3() {
        String idoso;
        String gestante;
        String deficiente;

        System.out.println("-------------------");
        System.out.println("Atendimento virtual");
        System.out.println("-------------------");
        System.out.print("Você tem 65 anos ou mais? Responda com s/n: ");
        Scanner sc = new Scanner(System.in);

        idoso = sc.nextLine();

        if (idoso.equals("s")) {
            System.out.println("Encaminhe-se à fila preferencial.");
        } else {
            System.out.print("Você é gestante? Responda com s/n: ");
            gestante = sc.nextLine();
            if (gestante.equals("s")) {
                System.out.println("Encaminhe-se à fila preferencial.");
            } else {
                System.out.print("Você é deficiente? Responda com s/n: ");
                deficiente = sc.nextLine();
                if (deficiente.equals("s")) {
                    System.out.println("Encaminhe-se à fila preferencial.");
                } else {
                    System.out.println("Encaminh-se à fila comum.");
                }
            }
        }
        sc.close();
    }

    void ex4() {
        int idade;

        System.out.print("Digite a sua idade: ");
        Scanner sc = new Scanner(System.in);

        idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode entrar no evento.");
        } else if (idade <= 18) {
            System.out.println("Você só poderá entrar acomponhado dos responsáveis.");
        } else {
            System.out.println(" Pode entrar.");
        }
        sc.close();
    }

    void ex5() {
        String loginCriado;
        String senhaCriada;
        String loginCheck;
        String senhaCheck;

        System.out.print("Crie um login: ");
        Scanner sc = new Scanner(System.in);

        loginCriado = sc.nextLine();

        System.out.print("Crie uma senha: ");

        senhaCriada = sc.nextLine();
        do {
            System.out.println("-----------------------------");
            System.out.print("Digite seu login: ");

            loginCheck = sc.nextLine();

            System.out.print("Digite sua senha: ");

            senhaCheck = sc.nextLine();

            if (loginCheck.equals(loginCriado)) {
                if (senhaCheck.equals(senhaCriada)) {
                    System.out.println("---- Bem-vindo! ----");
                }
            }   else {
                    System.out.println("Login incorreto.");
                }
            if (!senhaCheck.equals(senhaCriada)) {
                System.out.println("Senha incorreta.");
            }
        }
        while (!senhaCheck.equals(senhaCriada) || !loginCheck.equals(loginCriado));
        sc.close();
    }
}
