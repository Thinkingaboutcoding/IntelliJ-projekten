package ch.bbw.pr.moreloops;

/**
 * App Klasse
 *   Anwenden von mehrfachen Loops
 *   und Kombination von Kontrollelementen.
 * @author Peter Rutschmann
 * @author <Ihre Name>
 * @version 07.11.2021
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Mehrfach-Schleifen" );
        
        /* 1. Ausgabe von 1x1 bis 10x10
         *==========================
         * Verwenden Sie einen Loop und innerhalb des Loops
         * einen zweiten Loop.
         */
        System.out.println("\n1x1 bis 10x10" );
        int rows=10;
        int columns=10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }



        /* 2. Ausgabe von Sternen auf einer Zeile
         *======================================
         * Verwenden Sie einen Loop, geben Sie 5 * aus.
         */
        System.out.println("\n\n5 Sterne:" );
        int numberOfStars=5;
        int stars = 0;
        while(stars < numberOfStars){
            stars++;
            System.out.print("*");
        }
        /* 3. Ausgabe von einem Dreieck aus *
         *======================================
         * Verwenden Sie einen Loop und innerhalb des Loops.
         * einen zweiten Loop, um eine solche Darstellung zu erzeugen
         *    *
         *    **
         *    ***
         *    usw.
         */
        System.out.println("\n\nDreieck:" );
        columns=3;
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /* 4. Gleiche Aufgabe wie zuvor
         *======================================
         * Verwenden Sie eine andere Loop-Art für die Lösung.
         *    *
         *    **
         *    ***
         *    usw.
         */
        System.out.println("\n\nDreieck, Variante 2:" );
        columns=3;
        int i = 1;

        while (i <= columns) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }




        /* 5. Dreieck mit Abstand zum Rand
         *======================================
         * Verwenden Sie einen Loop und innerhalb des Loops.
         * einen zweiten Loop, um eine solche Darstellung zu erzeugen
         * Das Dreieck hat am Anfang "Leerschläge" und ist somit
         * links abgestuft und rechts bündig.
         *     *
         *    **
         *   ***
         *    usw.
         */
        System.out.println("\n\nDreieck, rechtsbündig:" );
        columns=3;
        i = 1;
        while (i <= columns) {
            int spaces = columns - i;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }


        /* 6. Einfacher Tannenbaum
         *======================================
         * Verwenden Sie einen Loop und innerhalb des Loops.
         * einen zweiten Loop, um eine solche Darstellung zu erzeugen
         *
         *     *
         *    ***
         *   *****
         *    usw.
         */
        System.out.println("\n\nEinfacher Tannenbaum:" );
        rows = 3;

        for (i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        //Aufgabe Weihnachtsbaum einfach
        //Auf dem Bildschirm soll ein Weihnachtsbaum mit Kerzen ausgegeben werden.
        //Der Weihnachtsbaum soll 20 Zeilen hoch sein. (Baum ist hier zu klein gezeichnet.
        rows = 5;
        System.out.println("\n\nEinfacher Weihnachtsbaum:" );
        for ( i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (i = 0; i < 1; i++) {
            for (int j = 0; j < rows - 2; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 3; k++) {
                System.out.print("#");
            }

            System.out.println();
        }
        System.out.println("\n\nWeihnachtsbaum mit Kerzen:" );
        rows = 5;

        for ( i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 + 1; k++) {
                if (k == 0 || k == i * 2) {
                    System.out.print("i");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for ( i = 0; i < 1; i++) {
            for (int j = 0; j < rows - 2; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 3; k++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
