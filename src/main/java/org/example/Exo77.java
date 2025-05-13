package org.example;

import java.util.Scanner;

public class Exo77 {
    public static void main(String[] args) {

        /* 1. Ecrire un programme qui permet de vérifier si un profil est valable pour une candidature
2. Le profil contient trois critères :
age : supérieur à 30 ans
salaire demandé : maximum 40 000€
années d'expériences : minimum 5 ans
3. Afficher un message pour chaque condition non respectée */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Age ?");
        int age =scanner.nextInt();
        System.out.println("pretention salarial en K ?");
        int salaire = scanner.nextInt();
        System.out.println("année XP ?");
        int xp = scanner.nextInt();

        if (age<30)
            System.out.println("trop jeune");
        else if (salaire> 40) {
            System.out.println("trop chère");
        }else if (xp<5) {
            System.out.println("pas assez d'XP");
        }
                else System.out.println("bon candidat");
            }

        }



