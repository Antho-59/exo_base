package org.example;

import java.util.Scanner;

public class Exo55 {
    public static void main(String[] args) {
       /* 1. Créer un programme qui permet de calculer le volume d'un cône
        2. La formule est la suivante : 1/3 × π × r² × h */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Rayon = ?");
        float r = scanner.nextFloat();
        System.out.println("hauteur = ?");
        float h = scanner.nextFloat();

        float v = (float) ((1/3F)*Math.PI*(r*r)*h);
        System.out.println("Volume =" +v);
    }
}
