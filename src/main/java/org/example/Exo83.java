package org.example;

import java.util.Scanner;

public class Exo83 {
    public static void main(String[] args) {

        /* 1. Créer une variable stockant le nombre de notes à saisir
2. Afficher la note la plus haute
3. Afficher la note la plus basse
4. Afficher la moyenne des notes
5. /!\ la note doit être comprise entre 0 et 20 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("cb de note voulez vous saisir?");
        int nbnote = scanner.nextInt();
        for (int i=1;i<=nbnote;i++){
            System.out.println("Inserer la note "+i);
            int note1 = scanner.nextInt();
        }
    }
}
