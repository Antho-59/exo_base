package org.example;

public class Exo52 {
    public static void main(String[] args) {
        //1. Écrire un programme qui permet de permuter les valeurs entre
        // deux variables

        int a = 1, b = 2;
        int c = a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = b ;
        b = c ;
        System.out.println(a);
        System.out.println(b);
    }
}
