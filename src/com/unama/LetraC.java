package com.unama;

import java.util.Scanner;

public class LetraC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade ;
        double preco ;
        System.out.println("Comprei: ");
        quantidade = sc.nextInt();
        System.out.println("Por: ");
        preco = sc.nextDouble();
        System.out.println("O total foi de " + quantidade*preco);
    }
}