
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
        int rows = 0;
        int columns = 1;
        
        while (input.hasNextLine()) {
            columns = 1;
            ++rows;
            String riga = input.nextLine();
            for (int i = 0; i < riga.length(); i++) {
                if (riga.charAt(i) == ' ') {
                    ++columns;
                }
            }
        }
        
        System.out.println("matrix has " + rows + " rows and " + columns + " columns");
        int[][] a = new int[rows][columns];

        input = new Scanner(new File("matrix.txt"));

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (input.hasNextInt()) {
                    a[i][j] = input.nextInt();
                }
            }
        }

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
