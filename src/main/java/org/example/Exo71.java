package org.example;

import java.util.Scanner;

public class Exo71 {
    public static void main(String[] args) {

        /* 1. Créer une variable caractere
2. Affecter une valeur à la variable caractere
3. A l'aide des structures conditionnelles, déterminer si le caractère
est une consonne ou une voyelle
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("donne une lettre");
        char lettre = scanner.nextLine().charAt(0);

        switch (lettre) {
            case 'a','e','i','o','u':
                System.out.println("voyelle");
                break;
            default:
                System.out.println("consonne");
        }

    }
}
