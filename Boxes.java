import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        
        /* ¡Nos mudamos de piso! vamos a crear un pequeño programa que nos ayude a saber en que caja pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 3. Bolsos
        Caja 4. Zapatos
        Caja 5. Cosas de verano
        Caja 6. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas
        String[] inBox = {"Libros", "Utensilios de cocina", "Artículos de baño", "Bolsos", "Zapatos", "Cosas de verano", "Cosas de invierno"};


        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar? (la respuesta deberá aparecer en la terminal en la misma línea)
        System.out.print("Hola, soy tu asistente de la organización ¿Qué deseas buscar? ");
        String find = myObj.nextLine();

        //Crea un programa que te devuelva lo siguiente: <cosas> están en la caja <índice> en el caso de no existir que devuelva: <cosas> no las empacaste, oops!
        boolean found = false;
        for (int i = 0; i < inBox.length; i++) {
            if (inBox[i].equalsIgnoreCase(find)) {
                System.out.println(find + " están en la caja " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(find + " no las empacaste, oops!");
        }

        myObj.close();
    }
}