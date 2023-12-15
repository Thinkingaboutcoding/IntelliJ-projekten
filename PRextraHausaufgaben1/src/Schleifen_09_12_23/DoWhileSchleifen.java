package Schleifen_09_12_23;

public class DoWhileSchleifen {
    public static void main(String[] args) {

        int num1 = 1;
        System.out.println("Aufgabe 1:");
        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= 5);


        int sumOfEvens = 0;
        int num2 = 4;
        System.out.println("\nAufgabe 2:");
        do {
            if (num2 % 2 == 0) {
                sumOfEvens += num2;
            }
            num2++;
        } while (num2 <= 14);
        System.out.println("Summe der geraden Zahlen von 4 bis 14: " + sumOfEvens);


        int num3 = 1;
        System.out.println("\nAufgabe 3:");
        do {
            int cube = num3 * num3 * num3;
            System.out.println("Die Kubuszahl von " + num3 + " ist: " + cube);
            num3++;
        } while (num3 <= 4);


        int num4 = 50;
        System.out.println("\nAufgabe 4:");
        do {
            System.out.println(num4);
            num4 -= 2;
        } while (num4 >= 40);


        int product = 1;
        int num5 = 1;
        System.out.println("\nAufgabe 5:");
        do {
            product *= num5;
            num5++;
        } while (num5 <= 6);
        System.out.println("Produkt der Zahlen von 1 bis 6: " + product);
    }
}