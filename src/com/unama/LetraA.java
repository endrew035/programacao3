package com.unama;

import java.util.Scanner;

public class LetraA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
	    int idade;
	    System.out.println("Infrome seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        System.out.println("Nome: "+ nome + ", Idade: " + idade);
    }
}
