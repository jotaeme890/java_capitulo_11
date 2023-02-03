/**
 * 4 Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Debe tener 2 argumentos");
            System.exit(-1);
        }
        try {
            int l = args[0].length();
            String nombre = args[0].substring(0, l - 4);
            String extension = args[0].substring(l - 4, l);

            Listar lm =  new Listar(args[0],nombre + "_sort" + extension);   
            lm.writeToFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
