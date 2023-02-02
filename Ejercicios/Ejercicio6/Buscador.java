package Ejercicios.Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Buscador {
    ArrayList<String> n = new ArrayList<>();
    private int cont;
    private String orig1;
    private String palabra;

    public Buscador(String orig1, String palabra) throws Exception{
        try {
            this.init(orig1,palabra);
        } catch (Exception e) {
            throw e;
        }
    }

    public void init(String orig1,String palabra){
        this.orig1 = orig1;
        this.palabra = palabra;

        try {
            BufferedReader br = new BufferedReader(new FileReader(orig1));

            String linea = "";

            while (linea != null) {
                if(n.contains(palabra)){
                    
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
