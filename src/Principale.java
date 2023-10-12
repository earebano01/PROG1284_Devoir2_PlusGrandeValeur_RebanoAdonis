/*
Titre : Plus Grande Valeur
Auteur: Adonis Rebano
Date : 11/10/2023
Description : Dans ce programme, on a un tableau de 15 cellules qu'on a initialisé avec des valeurs 
aléatoires (des entiers de 0 à 100). Le programme affiche ensuite les valeurs du tableau en sortie. 
Enfin, le programme affiche la plus grande valeur enregistrée dans le tableau ainsi que l'index de la 
cellule contenant cette valeur.
*/

import java.util.Scanner;

public class Principale {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        PlusGrandeValeur valeur = new PlusGrandeValeur();       // On crée une instance de la classe PlusGrandeValeur.
        PlusGrandeValeurList valeurList = new PlusGrandeValeurList();       // On crée une instance de la classe PlusGrandeValeurList.

        while (true) {      // On affiche un menu pour sélectionner des options.
            System.out.println("Veuillez sélectionner une option :");
            System.out.println("1. Utiliser ArrayList");
            System.out.println("2. Utiliser LinkedList");
            System.out.println("3. Sortie");
            System.out.println("");
            System.out.print("Saisissez votre choix : ");       // On demande l'utilisateur à entrer son choix.
            int choice = in.nextInt();
            in.nextLine();
            System.out.println("");

            switch (choice) {
                case 1:     
                    // On appelle la méthode qu'on a créé dans notre class PlusGrandeValeur (version ArrayList).
                    valeur.tableau();
                    valeur.grande();
                    valeur.inx();
                    break;

                case 2:     
                    // On appelle la méthode qu'on a créé dans notre class PlusGrandeValeurList (version LinkedList).
                    valeurList.tableau();
                    valeurList.grande();
                    valeurList.inx();
                    break;

                case 3:     
                    // On affiche un message de fin de programme, puis on termine le programme.
                    System.out.println("Fin du programme.");
                    System.out.println("");
                    System.exit(0);
                    in.close();
                    break;

                default:    
                    // On affiche un message d'erreur pour un choix invalide.
                    System.out.println("Choix non valide. Veuillez saisir une option valide.");
                    System.out.println("");
            }
        }
    }
}
