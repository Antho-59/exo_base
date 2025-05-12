package org.example;

import java.util.Scanner;

public class Exo54 {
    public static void main(String[] args) {
        /* 1. Créer une variable age et lui affecter une valeur
2. Vérifier si la personne est mineure ou majeure à l'aide des
opérateurs logiques
3. Afficher le résultat
4. /!\ Ne pas utiliser de structure conditionnelle */

        Scanner scanner =new Scanner(System.in);
        System.out.println("age = ?");
       int age = scanner.nextInt();
        System.out.println(age>=18);

      /* if (age <= 18)
           System.out.println( "mineur");
           else
        System.out.println("majeur");
*/
    }
}
