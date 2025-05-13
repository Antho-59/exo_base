package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exo56 {
    public static void main(String[] args) {
        /* 1. Saisir une chaine et la stocker dans une variable
2. Effectuer les traitements suivants :
1. Afficher la chaîne en minuscule
2. Afficher la chaîne en majuscule
3. Bonus
1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
2. Afficher la première lettre de chaque mot en majuscule */

        Scanner scanner =new Scanner(System.in);
        System.out.println("ton texte = ?");
        String text = scanner.nextLine();

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());


        String[] text2 ={"c","a"," ","v","a"};
        System.out.println(text2[0].toUpperCase()+text2[1]+text2[2]+text2[3].toUpperCase()+text2[4]);

    }
}
