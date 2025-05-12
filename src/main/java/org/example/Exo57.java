package org.example;

import java.util.Scanner;

public class Exo57 {
    public static void main(String[] args) {
        /* 1. Saisir la longueur du côté du carré et la stocker dans une variable
2. Calculer l'aire et le périmètre du carré
 */
        Scanner scanner =new Scanner(System.in);
        System.out.println("longueur = ?");
        float l = scanner.nextFloat();

       float a = (float)l*l;
       float p = (float)l*4;

        System.out.println("aire ="+a+" perimetre = "+p);
    }
}
