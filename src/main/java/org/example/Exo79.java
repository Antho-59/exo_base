package org.example;

import java.util.Scanner;

public class Exo79 {
    public static void main(String[] args) {

        /* 1. Créer un programme qui permet d'afficher un nombre de chapitres et de sous-parties
2. Le programme demandera le nombre de chapitres ainsi que le nombre de sous-parties à
afficher */

        Scanner scanner = new Scanner(System.in);
        System.out.println("nbre de chapitre");
        int chapitre = scanner.nextInt();
        System.out.println("nbre de sous-partie ?");
        int souspartie = scanner.nextInt();

for (int i = 1; i<= chapitre;i++){
        System.out.println("chaptre"+i);
for (int cpt =1 ; cpt <= souspartie; cpt++)
    System.out.println("sous partie "+i + "."+cpt);
}

    }
}
