import objet.LinkedList;
import java.util.Random;

public class PlusGrandeValeurList {

    // On declare une liste de tableaux (LinkedList) privée pour stocker les
    // entiers.
    private LinkedList<Integer> tableauArray;

    // Voici le constructeur qui initialise la liste de tableaux.
    public PlusGrandeValeurList() {
        this.tableauArray = new LinkedList<>();
    }

    public static int rand() {
        /**
         * cette méthode est utilisée pour générer des nombres aléatoires entre 0-100
         * à l'aide de la classe random.
         * 
         * @oaram hasard C'est un nom du notre classe pour générer des nombre aléatoire
         * @param h C'est le parametre pour stocker le nombre aléatoire
         * @return h C'est retourne le nombre aléatoire
         */
        Random hasard = new Random();
        int h = 0;
        while (true) {
            h = hasard.nextInt(101); // Génère un entier aléatoire entre 0 et 100.
            if (h != 0)
                break;
        }
        return h;
    }

    public void tableau() {
        /**
         * cette méthode est utilisée pour créér un tableau de 15 cellules qu'on
         * initialise avec des nombres aléatoires, ensuite on appelle la méthode rand() pour
         * obtenir un nombre aléatoire et on ajoute ce nombre à LinkedList. On affiche aussi
         * l'indice qui commence a 0 avec le nombre aléatoire comme :
         * 
         * Tableau [0] = nombre aléatoires
         * 
         * @param index        Déclaration d'un tableau d'entiers avec 15 éléments.
         * @param i            C'est un paramètre pour notre boucle
         * @param randomNumber C'est un paramètre qui va stocker le nombre dans l'autre methode rand()
         * @param tableauArray C'est un paramètre où on ajoute le nombre aléatoire
         */
        int[] index = new int[15];

        for (int i = 0; i < index.length; i++) {
            int randomNumber = rand();
            tableauArray.add(randomNumber);
            System.out.println("Tableaux [" + (i + 0) + "] = " + randomNumber);
        }
        System.out.println("");
    }

    public void grandeInx() {
        /**
         * cette méthode est utilisée pour afficher l'index du plus grand nombre.
         * 
         * @param grandeInx      C'est un paramètre pour stocker le plus grand nombre.
         * @param i              C'est un paramètre pour notre boucle.
         * @param inx            C'est un paramètre pour stocker l'indicen du plus grand nombre
         * @param tableauArray   C'est un paramètre où on ajoute le nombre aléatoire
         * @param valeurActuelle C'est un paramètre qu'on utilise pour stocker le
         *                       valeur actuelle et pour la comparaison avec grandeInx
         */
        int grandeInx;
        grandeInx = tableauArray.get(0); // On initialise 'grandeInx' avec le premier élément de LinkedList.
        int inx = 0; // On initialise 'inx' pour suivre l'indice de la plus grande valeur.

        for (int i = 0; i < tableauArray.size(); i++) {
            int valeurActuelle = tableauArray.get(i); // On obtient la valeur actuelle de LinkedList.
            if (valeurActuelle > grandeInx) { // On compare la valeur actuelle avec 'grandeInx'.
                grandeInx = valeurActuelle; // On fait un affection avec 'grandeInx' s'il y a une valeur plus grande.
                inx = i; // On fait un affection avec 'inx' avec l'indice de la plus grande valeur.
            }
        }
        System.out.println("\nLe plus grand nombre du LinkedList est : " + grandeInx); // On affiche le plus grand nombre dans LinkedList

        System.out.println("\nIl est a l'index : " + inx + "\n"); // On affiche l'indice qui contient le plus grande nombre dans LinkedList
    }
}