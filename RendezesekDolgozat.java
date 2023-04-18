package rendezesekdolgozat;

public class RendezesekDolgozat {

    public static void main(String[] args) {
        int[] tomb = {10, 23, 7, 56, 4, 3, 43, 8, 11, 1};
        
        Dolgozat d = new Dolgozat();
        d.kiir(d.rendezes(tomb));
        
        assert teszt(d.rendezes(tomb)) : "A sorozat nem rendezett!";
    }

    private static boolean teszt(int[] tomb) {
        int i = 0;
        while(i < tomb.length-1 && tomb[i] < tomb[i+1])
            i++;
        
        return i == tomb.length-1;
    }
    
}
