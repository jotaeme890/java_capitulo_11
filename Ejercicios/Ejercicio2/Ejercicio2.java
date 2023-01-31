/**
 * 2 Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.   
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            //! RUTA DE DONDE ESTA EL ARCHIVO
            BufferedReader br = new BufferedReader(new FileReader("./Ejercicios/Ejercicio1/primos.dat"));
            String line = "";
            //! MIENTRAS ES NULL HABRA LINEAS PARA LEER, EN ESTE CASO SERIAN LOS NUMEROS SEPARADOS POR , 
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            
        } catch (FileNotFoundException e){
            System.out.println("El archivo no se encuentra");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}
