/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * ELFARH SOFIANE
 * BDML1
 * TP0 - Exo1
 * 22-09-2026
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author elfar
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Affichage du message Bonjour
        System.out.println("Bonjour");
        // Création de la variable discussion pour stocjer la réponse
        String discussion;
        // Déclaration du scanner
        Scanner sc;
        // Création du scanner
        sc = new Scanner(System.in);
        // Pose une question à l'utilsateur
        System.out.println("Comment vas tu ?");
        // Récupération de la réponse
        discussion = sc.nextLine();
        // Affichage du message de fin
        System.out.println("Au revoir");
        
    }
    
}
