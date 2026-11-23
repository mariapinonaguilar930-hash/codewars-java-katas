/*
 * Kata 02: Counting sheep... (8 kyu)
 * Enlace: https://codewars.com
 * Descripción: Recorre un array de Boolean y cuenta cuántas ovejas están presentes (true),
 * evitando errores si hay valores nulos (null).
 */
public class Kata02_CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int contador = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
                contador++;
            }
        }

        return contador;
    }
}
