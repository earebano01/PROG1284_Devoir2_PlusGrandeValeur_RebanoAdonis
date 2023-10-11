import java.util.Random;

public class PlusGrandeValeur {
   private ArrayList<Integer> tableauArray;
   
   public PlusGrandeValeur() {
       this.tableauArray = new ArrayList<>();
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
    
    public void tableau() {
        int[] index = new int[15];
 
        for (int i = 0; i < index.length; i++) {
             int randomNumber = rand();
             tableauArray.add(randomNumber);
            System.out.println("Tableaux [" + (i + 0) + "] = " + randomNumber);
        } System.out.println("");
    }
 
    public void grande() {
        int max;
        max = tableauArray.get(0);
 
        for (int i = 0; i < tableauArray.size(); i++) {
            if (tableauArray.get(i) > max) {
                max = tableauArray.get(i);
             }
         }   System.out.println("\nLe plus grand nombre du tableau est : " + max);
     }
 
     public void inx() {
         int inx;
         inx = tableauArray.get(0);
         int grandeInx = 0;

         for (int i = 0; i < tableauArray.size(); i++) {
             int currentvalue = tableauArray.get(i);
             if (currentvalue > inx) {
                 inx = currentvalue;
                 grandeInx = i;
             }
         }
         System.out.println("\nIl est a l'index : " + grandeInx + "\n");
     }
 }