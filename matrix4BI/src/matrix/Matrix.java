
package matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author giussani.mirko
 */
public class Matrix {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("matrix.txt"));
        int righe = 0;
        int colonne = 1;
        
        while (input.hasNextLine()) {   //ciclo finchè c'è una riga
            colonne = 1;
            ++righe;
            String riga = input.nextLine(); //prende la linea dal file
            for (int i = 0; i < riga.length(); i++) {
                //conta gli spazi presenti in una riga e aggiungendo 1 trova le colonne
                if (riga.charAt(i) == ' ') {
                    ++colonne;
                }
            }
        }
        
        System.out.println("la matrice ha " + righe + " righe e " + colonne + " colonne");
        int[][] a = new int[righe][colonne];    //creo una matrice con righe e colonne adeguate

        input = new Scanner(new File("matrix.txt"));    /* non ho capito a cosa serve */

        for (int i = 0; i < righe; ++i) {
            for (int j = 0; j < colonne; ++j) {
                if (input.hasNextInt()) {   //se il carattere è un intero
                    a[i][j] = input.nextInt();  //inserisce il carattere scansionato nella matrice
                }
            }
        }

        //stampa matrice
        for (int i = 0; i < righe; ++i) {
            for (int j = 0; j < colonne; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
