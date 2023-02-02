package Ejemplos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File
* Lectura de un fichero de texto
*
* @author Juan A. García
*/
class Ejemplo1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("malaga.txt"));
            String linea =  br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero malaga.txt");
        } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero malagals.txt");
        }
    }
}