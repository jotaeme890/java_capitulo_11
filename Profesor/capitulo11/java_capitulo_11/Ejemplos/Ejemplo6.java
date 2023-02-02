package Ejemplos;
import java.io.File;
/**
* Ejemplo de uso de la clase File
* Comprobación de existencia y borrado de un fichero
*
* @author Juan A. García
*/
class Ejemplo6 {
    public static void main(String[] args) {
        System.out.print("Introduzca el nombre del archivo que desea borrar: ");
        String nombreFichero = System.console().readLine();
        File fichero = new File(nombreFichero);
        if (fichero.exists()) {
            boolean deleted = fichero.delete();
            if(deleted)
                System.out.println("El fichero se ha borrado correctamente.");
            else
                System.out.println("No se ha podido borrar el archivo");
        } else {
            System.out.println("El fichero " + nombreFichero + " no existe.");
        }
    }
}