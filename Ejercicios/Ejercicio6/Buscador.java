package Ejercicios.Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buscador {
    private int cont;
    private String palabra;

    public Buscador(String orig1, String palabra) throws Exception{
        try {
            this.init(orig1,palabra);
        } catch (Exception e) {
            throw e;
        }
    }

    public void init(String orig1,String palabra){
        this.palabra = palabra;
        int i = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(orig1));

            String linea = "";
            //! A LA LINEA SE LE DA EL VALOR DE LA LINEA LEIDA, Y MIENTRAS NO SE NULL HACE
            while ((linea = br.readLine()) != null) {
                //! MIENTRAS HAYA UNA OCURRENCIA DE LA PALABRA, SE VA A DEVOLVER EL VALOR Y SI NO LA HAY VA A DEVOLVER -1
                while  ((i = linea.indexOf(palabra)) != -1)  {
                    //! A LINEA SE LE DA EL VALOR DEL .substring(valor de i + longitud de la palabra + longitud de la linea)
                    linea = linea.substring(i + palabra.length(), linea.length());
                    //! SE AUMENTA EL CONTADOR YA QUE SERIA OTRA PALABRA IGUAL
                    this.cont++;
                }
            }

            br.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

    @Override
    public String toString(){
        return "La palabra " + this.palabra + " se repite: " + this.cont + " veces";
    }
}
