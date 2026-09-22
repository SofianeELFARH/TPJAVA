/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * ELFARH SOFIANE
 * BDML1
 * TP0 - Calculette
 * 22-09-2026
 */

package calculator;

import java.util.Scanner;

/**
 *
 * @author elfar
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Affichage des opérations
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        Scanner sc = new Scanner(System.in);
        
        // Variable opérateur
        int operateur;    
        System.out.println("\n Entrer l'opérateur :");
        operateur=sc.nextInt(); 
        
        // Operande1
        int operande1; 
        System.out.println("\n Entrez la première valeur:"); 
        operande1 = sc.nextInt(); 
        
        // Operande2
        int operande2; 
        System.out.println("\n Entrez la seconde valeur:"); 
        operande2 = sc.nextInt(); 
        
        // Bloc d'opérations
        
        int resultat = 0;
        if (operateur == 1) {
            resultat = operande1 + operande2;
        }
        else if (operateur == 2) {
            resultat = operande1 - operande2;
        }
        else if (operateur == 3) {
            resultat = operande1 * operande2;
        }
        else if (operateur == 4) {
            resultat = operande1 / operande2;
        }
        else if (operateur == 5) {
            resultat = operande1 % operande2;
        }
        else {
            System.out.println("Erreur :l'opérateur choisi n'est pas entre 1 et 5");// Message d'erreur
        }
        
        System.out.println("Le résultat est : " + resultat); 

    }
    
}
