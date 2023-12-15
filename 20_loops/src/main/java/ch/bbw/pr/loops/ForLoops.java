package ch.bbw.pr.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * For-Loops
 *   Methoden gemäss Anforderung implementieren.
 *   Unittest ausführen.
 * @author Peter Rutschmann
 * @author Nipun Golla
 * @version 05.11.2021
 */
public class ForLoops {

   /** 1. Alle Zahlen von 1 bis 50 ausgeben. */
   public static List<Integer> for1to50() {
      List<Integer> list = new ArrayList<>();
      for (int i = 1; i <= 50; i++) {
         list.add(i);
      }
      return list;
   }

   /** 2. Alle Zahlen von 0 bis 30 ausgeben. */
   public List<Integer> for0to30(){
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i <= 30; i++) {
         list.add(i);
      }
      return list;
   }

   /** 3. Alle Zahlen von 50 bis 100 ausgeben. */
   public List<Integer> for50to100(){
      List<Integer> list = new ArrayList<>();
      for (int i = 50; i <= 100; i++) {
         list.add(i);
      }
      return list;
   }

   /** 4. Alle Zahlen von 40 bis 0 ausgeben. */
   public List<Integer> for40to0(){
      List<Integer> list = new ArrayList<>();
      for (int i = 40; i >= 0; i--) {
         list.add(i);
      }
      return list;
   }

   /** 5. Alle Zahlen von 200 bis 180 ausgeben. */
   public List<Integer> for200to180(){
      List<Integer> list = new ArrayList<>();
      for (int i = 200; i >= 180; i--) {
         list.add(i);
      }
      return list;
   }

   /** 6. Alle Zahlen der 2-Reihe von 2 bis 20 ausgeben. */
   public List<Integer> for2er2to20(){
      List<Integer> list = new ArrayList<>();
      for (int i = 2; i <= 20; i = i+2) {
         list.add(i);
      }
      return list;
   }

   /** 7. Alle Zahlen der 7-Reihe von 7 bis 70 ausgeben. */
   public List<Integer> for7er7to70(){
      List<Integer> list = new ArrayList<>();
      for (int i = 7; i <= 70; i = i+7) {
         list.add(i);
      }
      return list;
   }

   /** 8. Alle Zahlen der 12-Reihe von 60 bis 120 ausgeben. */
   public List<Integer> for12er60to120(){
      List<Integer> list = new ArrayList<>();
      for (int i = 60; i <= 120; i = i+12) {
         list.add(i);
      }
      return list;
   }

   /** 9. Alle Zahlen der 5-Reihe von 125 bis 0 ausgeben. */
   public List<Integer> for5er125to0(){
      List<Integer> list = new ArrayList<>();
      for (int i = 125; i >= 0; i = i-5) {
         list.add(i);
      }
      return list;
   }

   /** 10. Alle Zahlen der 25-Reihe von 600 bis 200 ausgeben. */
   public List<Integer> for25er600to200(){
      List<Integer> list = new ArrayList<>();
      for (int i = 600; i >= 200; i = i-25) {
         list.add(i);
      }
      return list;
   }

   /** 11. Alle Zahlen der 13-Reihe von 2197 bis 2028 ausgeben. */
   public List<Integer> for13er2197to2028(){
      List<Integer> list = new ArrayList<>();
      for (int i = 2197; i >= 2028; i = i-13) {
         list.add(i);
      }
      return list;
   }
}
