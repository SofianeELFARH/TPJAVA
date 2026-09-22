/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * ELFARH SOFIANE
 * BDML1
 * TP0 - Partie 2
 * 22-09-2026
 */

package exo2;

import java.util.Scanner;

/**
 *
 * @author elfar
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        int nb;
        int result;
        int ind;
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); 
        result=0;
        
        //Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind++;//Ajoute 1 à ind
        }
        
        //Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
