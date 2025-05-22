import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas  con números aleatorios del 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)

        int rows = 100;
        int columns = 10;
        int[][] numbers = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = randomNumber();
            }
        }

        print2DArray(numbers);
    }

    /**
     * Function name: randomNumber
     *
     * @return (int)
     * <p>
     * Inside the function:
     * 1. generate random numbers from 0 to 99
     */

    public static int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    /**
     * Function name: print2DArray
     *
     * @param integers (2D array int)
     *                 <p>
     *                 Inside the function:
     *                 1. nested loop that prints a 2D array using the randomNumber function
     */

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}