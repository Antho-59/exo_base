package org.example;

import java.util.Scanner;

public class Exo70 {
    public static void main(String[] args) {

        /* 1. Créer 3 variables : nombre1, nombre2, nombre3
2. Affecter des valeurs aux variables
3. Créer des structures conditionnelles permettant d'afficher le
maximum parmis les 3 nombres créés précédemment
 */
        Scanner scanner =new Scanner(System.in);
        System.out.println("nbre 1 = ?");
        int n1 = scanner.nextInt();
        System.out.println("nbre 2 = ?");
        int n2 = scanner.nextInt();
        System.out.println("nbre 3 = ?");
        int n3 = scanner.nextInt();

        if (n1<n2)
            n1 =n2;
        if (n2<n3)
            n2 = n3;
        if (n1<n3)
            n1=n3;
        if (n3<n1)
            n3 = n1;

        System.out.println("+ grand nbre = "+n1);
    }
}

