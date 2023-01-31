/**
 * 1 Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author jotaeme 
 */

package Ejercicios.Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        int N = 500;
        try {
            //! CREAMOS EL MANEJADOR PARA QUE ESCRIBA Y SE CREE EN LA CARPETA EN LA QUE ESTAMOS, PARA ELLO PONDRÍAMOS LA RUTA COMPLETA
            BufferedWriter bw = new BufferedWriter(new FileWriter("./Ejercicios/Ejercicio1/primos.dat"));
            //! PARA HACER LOS 500PRIMER NÚMEROS PRIMOS
            for(int i = 0; i < N ;i++){  
                if(esPrimo(i)){
                    if(i<N-1)
                        bw.write(i + ", ");
                    //! PARA QUITAR LA ÚLTIMA COMA
                    else
                        bw.write(i + " ");
                }
            }
            //! CERRAMOS EL MANEJADOR
            bw.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        }
    }
    //! FUNCIÓN PARA SABER SI UN NÚMERO ES PRIMO O NO
    public static Boolean esPrimo(int x){
        if(x<0){
            x = -x;
        }
        if(x<2){
            return false;
        }
        int divisor =2;
        while (divisor<=x/2) {
            if((x%divisor)==0){
                return false;
            }
            divisor++;
        }
        return true;
    }
}
