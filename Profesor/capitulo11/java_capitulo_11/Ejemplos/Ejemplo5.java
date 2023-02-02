package Ejemplos;
import java.io.File;
/**
* Ejemplo de uso de la clase File
* Listado de los archivos del directorio actual
*
* @author Juan A. García
*/
class Ejemplo5 {
    public static void main(String[] args) {
        try {
            File f = new File("malaga2.txt"); // se indica la ruta entre comillas
            String[] listaArchivos = f.list();
        for(String nombreArchivo : listaArchivos) {
            System.out.println(nombreArchivo);
        }
                
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        
        
        
    }
}