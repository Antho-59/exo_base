package org.example;

import java.util.Scanner;

public class Exo53 {
    public static void main(String[] args) {
        /*  1. Écrire un programme avec les variables suivantes : a, b
            2. Afficher la somme des carrés de ces deux nombres */

        int a ,b;
        Scanner scanner =new Scanner(System.in);
        System.out.println("a = ?");
        a = scanner.nextInt();
        System.out.println("b = ?");
        b = scanner.nextInt();

        int result = a*a + b*b;
        System.out.println("la somme des carrés = "+result);


    }

}
