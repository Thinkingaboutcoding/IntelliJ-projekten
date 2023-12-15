package ch.bbw.pr.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * WhileLoops
 *   Methoden gemäss Anforderung implementieren.
 *   Unittest ausführen.
 * @author Peter Rutschmann
 * @author <hier Ihren Namen eintragen>
 * @version 05.11.2021
 */
public class WhileLoops {

   /** 1. Alle Zahlen von 0 bis 20 ausgeben. */
   public static List<Integer> while0to20() {
      List<Integer> list = new ArrayList<>();
      int i = 0;
      while (i <= 20) {
         list.add(i);
         i++;
      }
      return list;
   }

   /** 2. Alle Zahlen von 25 bis 50 ausgeben. */
   public List<Integer> while25to50(){
      List<Integer> list = new ArrayList<>();
      int i = 25;
      while (i <= 50) {
         list.add(i);
         i++;
      }
      return list;
   }

   /** 3. Alle Zahlen von -25 bis 25 ausgeben. */
   public List<Integer> whileM25to25(){
      List<Integer> list = new ArrayList<>();
      int i = -25;
      while (i <= 25) {
         list.add(i);
         i++;
      }
      return list;
   }

   /** 4. Alle Zahlen der 4-Reihe von 4 bis 40 ausgeben. */
   public List<Integer> while4er4to40(){
      List<Integer> list = new ArrayList<>();
      int i = 4;
      while (i <= 40) {
         list.add(i);
         i = i + 4;
      }
      return list;
   }

   /** 5. Alle Zahlen der 9-Reihe von 9 bis 81 ausgeben. */
   public List<Integer> while9er9to81(){
      List<Integer> list = new ArrayList<>();
      int i = 9;
      while (i <= 81) {
         list.add(i);
         i = i + 9;
      }
      return list;
   }

   /** 6. Alle Zahlen der 11-Reihe von 44 bis 121 ausgeben. */
   public List<Integer> while11er44to121(){
      List<Integer> list = new ArrayList<>();
      int i = 44;
      while (i <= 121) {
         list.add(i);
         i = i + 11;
      }
      return list;
   }

   /** 7. Alle Zahlen der 8-Reihe von 96 bis 16 ausgeben. */
   public List<Integer> while8er96to16(){
      List<Integer> list = new ArrayList<>();
      int i = 96;
      while (i >= 16) {
         list.add(i);
         i = i - 8;
      }
      return list;
   }

   /** 8. Alle Zahlen der 25-Reihe von 400 bis 100 ausgeben. */
   public List<Integer> while25er400to100(){
      List<Integer> list = new ArrayList<>();
      int i = 400;
      while (i >= 100) {
         list.add(i);
         i = i - 25;
      }
      return list;
   }

   /** 9. Alle Zahlen der 13-Reihe von 2197 bis 2028 ausgeben. */
   public List<Integer> while13er2197to2028(){
      List<Integer> list = new ArrayList<>();
      int i = 2197;
      while (i >= 2028) {
         list.add(i);
         i = i - 13;
      }
      return list;
   }
}
