package Schleifen_09_12_23;
import java.util.ArrayList;
public class Forschleifen {

    public static void main(String[] args) {
        System.out.println("Zahlen von 1 bis 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        ArrayList<Integer> geradeZahlen = new ArrayList<>();
        int summeGeradeZahlen = 0;
        for (int j = 2; j <= 20; j += 2) {
            geradeZahlen.add(j);
            summeGeradeZahlen += j;
        }
        System.out.println("\nSumme der geraden Zahlen von 2 bis 20: " + geradeZahlen);
        System.out.println("\nDie ersten 5 Quadrate:");
        for (int k = 1; k <= 5; k++) {
            System.out.println(k * k);
        }


        System.out.println("\nZählen von 100 bis 90 in Schritten von 2:");
        for (int l = 100; l >= 90; l -= 2) {
            System.out.println(l);
        }


        ArrayList<String> ergebnisMultiplikation2 = new ArrayList<String>();
        int ergebnisMultiplikation = 1;
        for (int m = 1; m <= 5; m++) {
            ergebnisMultiplikation *= m;
            ergebnisMultiplikation2.add(String.valueOf(ergebnisMultiplikation));

        }
        System.out.println("\nErgebnis der Multiplikation von 1 bis 5: " + ergebnisMultiplikation2);
    }
}
