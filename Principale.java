import java.util.Scanner;

public class Principale {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        PlusGrandeValeur valeur = new PlusGrandeValeur();
        PlusGrandeValeurList valeurList = new PlusGrandeValeurList();

        while (true) {
            System.out.println("Veuillez sélectionner une option :");
            System.out.println("1. Utiliser ArrayList");
            System.out.println("2. Utiliser LinkedList");
            System.out.println("3. Sortie");
            System.out.println("");
            System.out.print("Saisissez votre choix : ");
            int choice = in.nextInt();
            in.nextLine();
            System.out.println("");

            switch (choice) {
                case 1:
                    valeur.tableau();
                    valeur.grande();
                    valeur.inx();
                    break;

                case 2:
                    valeurList.tableau();
                    valeurList.grande();
                    valeurList.inx();
                    break;

                case 3:
                    System.out.println("Fin du programme.");
                    System.out.println("");
                    System.exit(0);
                    in.close();
                    break;

                default:
                    System.out.println("Choix non valide. Veuillez saisir une option valide.");
                    System.out.println("");
            }
        }
    }
}
