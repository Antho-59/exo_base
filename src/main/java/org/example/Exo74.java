package org.example;

import java.util.Scanner;

public class Exo74 {
    public static void main(String[] args) {
        /* Créer une variable annee de type entier
2. Affecter une valeur à la variable annee
3. Une année est bissextile si elle est divisible par 4 mais non divisible
par 100.
4. L'année est également bissextile si elle est divisible par 400
 */

        Scanner scanner =new Scanner(System.in);
        System.out.println("choisis une  année ");
        int annee = scanner.nextInt();

        if (annee%400==0)
            System.out.println( "année bissextile");
        else System.out.println("pas bissextile");
    }
}
