import java.util.Random;

// import packagelists.ArrayList;

/* 
Vous devez coder une classe nommée PlusGrandeValeur. Dans ce programme vous devrez avoir un tableau de 
15 cellules que vous devrez initialiser avec des valeurs au hasard (des entiers de 0 à 100). 
Le programme doit afficher les valeurs du tableau comme sortie. 

Pour finir, le programme affichera la plus grande valeur enregistre dans le tableau ainsi que l’index de la 
cellule contenant cette valeur. 
*/

public class PlusGrandeValeurList {
   private LinkedList<Integer> tableauArray;

   public PlusGrandeValeurList() {
    this.tableauArray = new LinkedList<>();
   }

   public static int rand() {
       Random hasard = new Random();
       int h = 0;
       while (true) {
           h = hasard.nextInt(101);
           if (h != 0)
               break;
       }
       return h;
   }

}