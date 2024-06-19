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
        } else if (num2 > num1) {
            System.out.println("O número " + num2 + " é maior que " + num1);
        } else {
            System.out.println("Os números são iguais");
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
            } else {
                System.out.println("Login incorreto.");
            }
            if (!senhaCheck.equals(senhaCriada)) {
                System.out.println("Senha incorreta.");
            }
        } while (!senhaCheck.equals(senhaCriada) || !loginCheck.equals(loginCriado));
        sc.close();
    }

    void ex6() {
        String nome;
        float nota1;
        float nota2;
        float media;
        float notaRec;

        System.out.println("----------------------------------");
        System.out.print("Digite o nome do aluno: ");
        Scanner sc = new Scanner(System.in);

        nome = sc.nextLine();

        System.out.println("----------------------------------");
        System.out.print("Digite a nota do 1º semestre: ");

        nota1 = sc.nextFloat();

        System.out.println("----------------------------------");
        System.out.print("Digite a nota do 2º semestre: ");

        nota2 = sc.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("----------------------------------");
        System.out.println("A média do " + nome + " foi: " + media);
        System.out.println();
        if (media >= 6) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.print("Digite a nota de recuperação: ");
            notaRec = sc.nextFloat();
            System.out.println("----------------------------------");
            if (nota1 > nota2 && notaRec > nota2) {
                media = (nota1 + notaRec) / 2;
                if (media >= 6) {
                    System.out.println("A média do " + nome + " foi: " + media);
                    System.out.println("O aluno está aprovado!");
                } else {
                    System.out.println("A média do " + nome + " foi: " + media);
                    System.out.println("O aluno está reprovado!");
                }
            } else if (nota2 > nota1 && notaRec > nota1) {
                media = (nota2 + notaRec) / 2;
                if (media >= 6) {
                    System.out.println("A média do " + nome + " foi: " + media);
                    System.out.println("O aluno está aprovado!");
                } else {
                    System.out.println("A média do " + nome + " foi: " + media);
                    System.out.println("O aluno está reprovado!");
                }
            } else {
                System.out.println("A média do " + nome + " foi: " + media);
                System.out.println("O aluno está reprovado!");
            }
        }
        System.out.println("----------------------------------");
        sc.close();
    }

    void ex7() {
        int divisor;
        int dividendo;

        System.out.println("-------------------------------");
        System.out.println("Identificador de divisibilidade");
        System.out.println("-------------------------------");
        System.out.print("Digite um dividendo: ");
        Scanner sc = new Scanner(System.in);

        dividendo = sc.nextInt();

        System.out.print("Digite um divisor: ");

        divisor = sc.nextInt();
        System.out.println("-------------------------------");

        if ((dividendo % divisor) == 0) {
            System.out.println("O número " + dividendo + " é divisível por " + divisor);
        } else {
            System.out.println("O número " + dividendo + " não é divisível por " + divisor);
        }
        System.out.println("-------------------------------");
        sc.close();
    }

    void ex8() {
        String resposta1;
        String resposta2;
        String resposta3;
        String resposta4;
        String resposta5;
        int tentativas = 3;

        System.out.println("-------------------");
        System.out.println("$ Show do Milhão $");
        System.out.println("-------------------");
        System.out.println("1) Quem descobriu o Brasil?");
        System.out.println("a) Américo Vespúcio");
        System.out.println("b) Pedro Álvares Cabral");
        System.out.println("c) Cristóvão Colombo");
        Scanner sc = new Scanner(System.in);

        resposta1 = sc.nextLine();

        if (!resposta1.equals("b")) {
            tentativas--;
            System.out.println("Você errou, restam " + tentativas + " tentativas.");
        }

        System.out.println("-------------------");
        System.out.println("2) Qual foi o time campeão brasileiro de 1995?");
        System.out.println("a) Botafogo");
        System.out.println("b) Cruzeiro");
        System.out.println("c) Santos");

        resposta2 = sc.nextLine();

        if (!resposta2.equals("a")) {
            tentativas--;
            System.out.println("Você errou, restam " + tentativas + " tentativas.");
        }

        System.out.println("-------------------");
        System.out.println("3) Qual foi o primeiro homem a ir ao espaço?");
        System.out.println("a) Buzz Aldrin");
        System.out.println("b) Neil Armstrong");
        System.out.println("c) Yuri Gagarin");

        resposta3 = sc.nextLine();

        if (!resposta3.equals("c")) {
            tentativas--;
            System.out.println("Você errou, restam " + tentativas + " tentativas.");
        }
        if (tentativas == 0) {
            System.out.println("Suas três tentativas terminaram, você perdeu!");
        } else {
            System.out.println("-------------------");
            System.out.println("4) Qual o maior planeta do sistem solar?");
            System.out.println("a) Terra");
            System.out.println("b) Marte");
            System.out.println("c) Jupíter");

            resposta4 = sc.nextLine();

            if (!resposta4.equals("a")) {
                tentativas--;
                System.out.println("Você errou, restam " + tentativas + " tentativas.");
            }
            if (tentativas == 0) {
                System.out.println("Suas três tentativas terminaram, você perdeu!");
            } else {
                System.out.println("-------------------");
                System.out.println("5) Última pergunta. Quem pintou o quadro Monalisa?");
                System.out.println("a) Leonardo da Vinci");
                System.out.println("b) Michelangelo");
                System.out.println("c) Monet");

                resposta5 = sc.nextLine();

                if (!resposta5.equals("a")) {
                    tentativas--;
                    System.out.println("Você errou, restam " + tentativas + " tentativas.");
                }
                if (tentativas == 0) {
                    System.out.println("Suas três tentativas terminaram, você perdeu!");
                } else {
                    System.out.println("$ Parabéns, você venceu $");
                    System.out.println("-------------------");
                }
            }
        }
        sc.close();
    }

}
