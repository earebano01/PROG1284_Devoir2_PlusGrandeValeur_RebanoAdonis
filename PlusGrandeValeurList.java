import java.util.Random;

public class PlusGrandeValeurList {

   // On declare une liste de tableaux (LinkedList) privée pour stocker les entiers.
   private LinkedList<Integer> tableauArray;

   // Voici le constructeur qui initialise la liste de tableaux.
   public PlusGrandeValeurList() {
    this.tableauArray = new LinkedList<>();
   }

   // On a créé une methode pour génèrer un nombre entier aléatoire entre 0 et 100.
   public static int rand() {                      
    Random hasard = new Random();
    int h = 0;
    while (true) {
        h = hasard.nextInt(101);       // Génère un entier aléatoire entre 0 et 100. 
        if (h != 0)
        break;
    }
    return h;       // Retourne l'entier aléatoire généré.
}

// On a créé une methode pour un tableau de 15 cellules qu'on initialise avec des nombres aléatoires 
public void tableau() {
    int[] index = new int[15];      // Déclaration d'un tableau d'entiers avec 15 éléments.

    for (int i = 0; i < index.length; i++) {
         int randomNumber = rand();         // On appelle la méthode rand() pour obtenir un nombre aléatoire.
         tableauArray.add(randomNumber);            // On ajoute le nombre aléatoire à LinkedList.
        System.out.println("Tableaux [" + (i + 0) + "] = " + randomNumber);         // On affiche l'indice qui commence a 0 et le nombre aléatoire.
    } System.out.println("");
}

// Ensuite, on a créé une méthode pour trouver le plus grand nombre dans notre LinkedList.
public void grande() {
    int max;
    max = tableauArray.get(0);      // On initialise 'max' avec le premier élément du LinkedList.

    for (int i = 0; i < tableauArray.size(); i++) {
        if (tableauArray.get(i) > max) {        // On compare l'élément actuel avec 'max' en utilisant la boucle.
            max = tableauArray.get(i);          // Ensuite on fait un affectation avec 'max' s'il y a un élément plus grand.
         }
     }   System.out.println("\nLe plus grand nombre du tableau est : " + max);          // On affiche le plus grand nombre dans le LinkedList
 }
 // Finalement, voici notre méthode pour afficher l'index de ce nombre.
 public void inx() {
     int grandeInx;
     grandeInx = tableauArray.get(0);     // On initialise 'grandeInx' avec le premier élément du LinkedList.
     int inx = 0;     // On initialise 'inx' pour suivre l'indice de la plus grande valeur.

     for (int i = 0; i < tableauArray.size(); i++) {
         int currentvalue = tableauArray.get(i);        // On obtient la valeur actuelle du LinkedList.
         if (currentvalue > grandeInx) {      // On compare la valeur actuelle avec 'grandeInx'.
             grandeInx = currentvalue;        // On fait un affection avec 'grandeInx' s'il y a une valeur plus grande.
             inx = i;     // On fait un affection avec 'inx' avec l'indice de la plus grande valeur.
         }
     }
     System.out.println("\nIl est a l'index : " + inx + "\n");        // On affiche l'indice qui contient le plus grande nombre dans le LinkedList
 }
}