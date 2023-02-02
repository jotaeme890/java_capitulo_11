package Ejemplos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File
* Escritura en un fichero de texto
*
* @author Juan A. García
*/
class Ejemplo3 {
    public static void write(String text){
        System.out.print(text);
    }
    public static void write(String text, BufferedWriter bw) throws IOException{
        if(bw!=null){
            try {
                bw.write(text);    
            } catch (Exception e) {
                throw e;
            }
        }   
        else
            write(text);        
    }
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriterConsole(new FileWriter("fruta.txt"));
            bw.write("naranja\n");
            bw.write("mango\n");
            bw.write("chirimoya");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}