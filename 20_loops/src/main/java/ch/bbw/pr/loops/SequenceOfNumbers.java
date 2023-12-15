package ch.bbw.pr.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * SequenceOfNumbers
 *   Weitere Zahlenreihen
 *   Methoden gemäss Anforderung implementieren.
 *   Unittest ausführen.
 * @author Peter Rutschmann
 * @author <hier Ihren Namen eintragen>
 * @version 05.11.2021
 */
public class SequenceOfNumbers {

   /** 1. For-Loop: Alle Quadratzahlen für die Zahlen 1 bis 5*/
   public List<Integer> forQuadrat1to5() {
      List<Integer> list = new ArrayList<>();
      for (int i = 1; i <= 5; i++) {
         int square = i * i;
         list.add(square);
      }
      return list;
   }

   /** 2. While-Loop: Alle Quadratzahlen für die Zahlen 5 bis 10*/
   public List<Integer> whileQuadrat5to10(){
      List<Integer> list = new ArrayList<>();
      int i = 5;
      while (i <= 10) {
         int square = i * i;
         list.add(square);
         i = i + 1;
      }
      return list;
   }

   public static List<Integer> doWhileQuadrat10to15() {
      List<Integer> list = new ArrayList<>();
      int i = 10;

      do {
         int square = i * i;
         list.add(square);
         i++;
      } while (i <= 15);

      return list;
   }

   /** 4. Alle Quadratzahlen zwischen 1 und 1000
    * Das Ergebnis liegt zwischen 1 und 1000, inkl. Grenzen
    */
   public List<Integer> quadratRange1to1000(){
      List<Integer> list = new ArrayList<>();
      int square = 0;
      for (int i = 1; square <= 960; i++) {
         square = i * i;
         list.add(square);
      }
      return list;
   }

   /** 5. Alle Kubikzahlen für die Zahlen 1 bis 10
    *  Den Loop können Sie frei wählen
    */
   public List<Integer> kubik1to10(){
      List<Integer> list = new ArrayList<>();
      for (int i = 1; i <= 10; i++) {
         int kubik = i * i * i;
         list.add(kubik);
      }
      return list;
   }
}
