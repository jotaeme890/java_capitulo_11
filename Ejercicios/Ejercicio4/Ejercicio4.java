/**
 * 4 Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * 
 */

package Ejercicios.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            Listar lm = new Listar(args[0], args[1]);    
            lm.writeToFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
