package org.example;

import java.util.Scanner;

public class Exo69 {
    public static void main(String[] args) {

        /* 1. Créer une variable nombre de type entier
2. Affecter une valeur à la variable nombre
3. Créer une condition qui permet d'afficher si le nombre est pair ou impair
*/

        Scanner scanner =new Scanner(System.in);
        System.out.println("ton nbre entier = ?");
        int n = scanner.nextInt();

        if (n%2==0)
            System.out.println("pair");
        else
            System.out.println("impair");

    }
}
