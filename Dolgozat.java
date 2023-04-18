package rendezesekdolgozat;


public class Dolgozat {    
     public int[] rendezes(int[] tomb) {    
        for (int i = 0; i < tomb.length; i++) 
            for (int j = i+1; j < tomb.length; j++)
                if(tomb[i] > tomb[j]) {
                    int tmp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = tmp;
                }
        return tomb;
    }
     
    public void kiir(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
    }
}
