/**
 * 3 Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
 * primeros dos ficheros mezcladas, es decir, la primera línea será del primer
 * fichero, la segunda será del segundo fichero, la tercera será la siguiente del
 * primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
 * pasar como argumentos en la línea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
 * pueden tener tamaños diferentes.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        //! PRIMER TRY CATCH ES PARA VER QUE LOS PARAMETROS QUE NOS PASEN SEAN CORRECTOS
        if(args.length != 3){
            System.out.println("Tiene que ser 3 argumentos");
        }

        String file1 = args[0];
		String file2 = args[1];
        String file3 = args[2];

        try {
            //! CREAMOS LOS BUFFERED, EN ESTE CASO PASAMOS LOS PARAMETROS Y CON launch.json PONEMOS LOS DATOS PARA PROBARLOS
            BufferedReader br1 = new BufferedReader(new FileReader("./Ejercicios/Ejercicio3/"+file1));
            BufferedReader br2 = new BufferedReader(new FileReader("./Ejercicios/Ejercicio3/"+file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter("./Ejercicios/Ejercicio3/"+file3));
            //! CREAMOS LAS ESTOS STRING PARA QUE GUARDEN LAS LINEAS QUE SE LEEN DE LOS ARCHIVOS
            String line = "";
            String line2 = "";

            while ((line != null) || (line2 != null)) {
                //! PRIMEROS LEEMOS LAS LINEAS
                line = br1.readLine();
                line2 = br2.readLine();
                //! DESPUES ESCRIBIMOS
                if (line != null)
                    bw.write(line + "\n");
                if (line2 != null)
                    bw.write(line2 + "\n");
            }
            //! CERRAMOS LOS BUFFERED
            br1.close();
            br2.close();
            bw.close();
            //! EXCEPCIONES DEL TRY CATCH DE LOS BUFFERED
            System.out.println("Archivo de mezcla de los archivos: " + file1 + ", " + file2 + " ha sido creado correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Alguno de los archivos no existen");
        } catch (IOException e){
            System.out.println("Se ha producido un error");
        }
    }
}
