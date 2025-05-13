package org.example;

public class Exo80 {
    public static void main(String[] args) {
        /* 1. Créer un programme permettant d'afficher les tables de
multiplications de 1 à 10
*/

        int a = 1;
        System.out.println("table de "+a);
        for (int i=0;i<=10;i++ ){
            int r = a*i;
            System.out.println(a+" X "+i+" = "+r);

        }

    }
}
