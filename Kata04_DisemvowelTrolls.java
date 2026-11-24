/*
 * Kata 04: Disemvowel Trolls (7 kyu)
 * Enlace: https://codewars.com
 * Descripción: Elimina todas las vocales (mayúsculas y minúsculas, excepto la 'y')
 * de una cadena de texto usando el método replaceAll con una expresión regular.
 */
public class Kata04_DisemvowelTrolls {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
