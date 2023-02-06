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

        try {
            BufferedReader br = new BufferedReader(new FileReader(orig1));

            String linea = "";
            int i = 0;

            while((linea = br.readLine()) != null){
                while ((i = linea.indexOf(palabra)) != -1) {
                    linea = linea.substring(i + palabra.length(), linea.length());
                    cont++;
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
