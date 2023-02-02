package Ejemplos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File
* Calcula la media de los números que se encuentran en un fichero de texto
*
* @author Juan A. García
*/
class Ejemplo2 {
    public static void main(String[] args) {
        System.out.print("Introduzca el nombre del archivo donde se encuentran los números: ");
        String nombreFichero = System.console().readLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
            String linea = "";
            int i = 0;
            double suma = 0;
            linea = br.readLine();
            while (linea != null) {
                i++;
                suma += Double.parseDouble(linea);
                linea = br.readLine();
            }
            br.close();
            System.out.println("La media es " + suma / (double)i);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}