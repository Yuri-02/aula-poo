package com.poo.introducao;
import java.util.Scanner;


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

    void ex4(){
        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int pares=0;

        for(int i=0; i<9; i++){
            if(lista[i] % 2 == 0){
                pares++;
            }
        }
        System.out.println("A quantidades de números pares da lista é: " + pares);
    }

    void ex5(){
        String listaDeCompras[] = new String[100];
        int escolhaMenu;
        String item;
        boolean menu = true;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        while (menu) {
            System.out.println("""
                    ===== Menu =====
                     1 = Add item na lista de compras.
                     2 = Ver lista de compras
                     3 = Sair
                    """);

            escolhaMenu = sc.nextInt();

            if (escolhaMenu == 1) {
                if (contador < 100) {
                    System.out.println("Insira o item que deseja adicionar:");

                    item = sc.next();

                    listaDeCompras[contador] = item;
                    contador++;
                    System.out.println("\n\n");
                } else {
                    System.out.println("A lista está cheia");
                }
            }

            else if (escolhaMenu == 2) {

                if (contador != 0) {
                    System.out.println("\n\n===== Lista de Compras =====");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(contador + 1 + " - " + listaDeCompras[i]);
                    }
                } else {
                    System.out.println("\n\nLista de compras vazia");
                }
                System.out.println("\n\n");
            }

            else if (escolhaMenu == 3) {
                System.out.println("Saindo...");
                menu = false;
            }

            else {
                System.out.println("Digite um número válido! \n\n\n");
            }

        }
        sc.close();
    }

    void ex6(){
        String listaDeCompras[] = new String[100];
        int escolhaMenu;
        String item;
        boolean menu = true;
        int contador = 0;
        int removerItem;
        Scanner sc = new Scanner(System.in);

        while (menu) {

            System.out.println("""
                    ===== Menu =====
                     1 = Add item na lista de compras.
                     2 = Ver lista de compras
                     3 = Remover item
                     4 = Sair
                    """);

            escolhaMenu = sc.nextInt();

            if (escolhaMenu == 1) {
                if (contador < 100) {
                    System.out.println("Insira o item que deseja adicionar:");

                    item = sc.next();

                    listaDeCompras[contador] = item;
                    contador++;
                    System.out.println("\n\n");
                } else {
                    System.out.println("A lista está cheia");
                }
            }

            else if (escolhaMenu == 2) {

                if (contador != 0) {
                    System.out.println("\n\n===== Lista de Compras =====");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + 1 + " - " + listaDeCompras[i]);
                    }
                } else {
                    System.out.println("\n\nLista de compras vazia");
                }
                System.out.println("\n\n");
            }

            else if (escolhaMenu == 3) {

                if (contador == 0) {
                    System.out.println("Nenhum item adicionado na lista\n\n");
                } else {

                    System.out.println("\n\n===== Lista de Compras =====");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + 1 + " - " + listaDeCompras[i]);
                    }
                    System.out.println("Digite o número do item para remover: ");
                    removerItem = sc.nextInt();

                    listaDeCompras[removerItem - 1] = null;
                }
            }

            else if (escolhaMenu == 4) {
                System.out.println("Saindo...");
                menu = false;
            }

            else {
                System.out.println("Digite um número válido! \n\n\n");
            }
        }
        sc.close();
    }

    void ex7(){
        String listaDeCompras[] = new String[100];
        double listaDePreco[] = new double[100];
        int escolhaMenu;
        String item;
        double precoDoItem;
        boolean menu = true;
        int contador = 0;
        int removerItem;
        int itemRemovido = 0;
        Scanner sc = new Scanner(System.in);

        while (menu) {

            System.out.println("""
                    ===== Menu =====
                     1 = Add item na lista de compras.
                     2 = Ver lista de compras
                     3 = Remover item
                     4 = Sair
                    """);

            escolhaMenu = sc.nextInt();

            if (escolhaMenu == 1) {
                if (contador < 100) {
                    System.out.println("Insira o item que deseja adicionar:");

                    item = sc.next();

                    System.out.print("Insira o preço do item:");

                    precoDoItem = sc.nextDouble();

                    listaDeCompras[contador] = item;
                    listaDePreco[contador] = precoDoItem;
                    contador++;
                    System.out.println("\n\n");

                } else {
                    System.out.println("A lista está cheia");
                }
            }

            else if (escolhaMenu == 2) {

                if (contador != 0) {
                    System.out.println("\n\n===== Lista de Compras =====");

                    for (int i = 0; i < contador; i++) {
                        if (listaDeCompras[i] != null) {
                            System.out.println((i + 1 - itemRemovido) + " - " + listaDeCompras[i] + "   "
                                    + listaDePreco[i] + " R$");
                        }
                    }
                } else {
                    System.out.println("\n\nLista de compras vazia");
                }
                System.out.println("\n\n");
            }

            else if (escolhaMenu == 3) {

                if (contador == 0) {
                    System.out.println("Nenhum item adicionado na lista\n\n");
                } else {

                    System.out.println("\n\n===== Lista de Compras =====");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + 1 + " - " + listaDeCompras[i]);
                    }
                    System.out.println("Digite o número do item para remover: ");
                    removerItem = sc.nextInt();

                    listaDeCompras[removerItem - 1] = null;
                    listaDePreco[removerItem - 1] = 0;
                    itemRemovido++;
                }
            }

            else if (escolhaMenu == 4) {
                System.out.println("Saindo...");
                menu = false;
            }

            else {
                System.out.println("Digite um número válido! \n\n\n");
            }
        }
        sc.close();
    }

    
}
