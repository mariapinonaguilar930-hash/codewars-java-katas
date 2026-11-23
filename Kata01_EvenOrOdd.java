/*
 * Kata 01: Even or Odd (8 kyu)
 * Enlace: https://codewars.com
 * Descripción: Recibe un número entero y devuelve "Even" si es par o "Odd" si es impar
 * comprobando si el resto de dividirlo entre 2 es igual a 0.
 */
public class Kata01_EvenOrOdd {
    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
