package Ejercicios.Ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Listar {
    ArrayList<String> n = new ArrayList<>();
    private boolean initialized;
    private String orig1;
    private String dest;
    
    public Listar(String orig1,String dest) throws Exception{
        try {
            this.init(orig1,dest);    
            this.initialized = true;
        } catch (Exception e) {
            throw e;
        }
    }

    public void init(String orig1,String dest) throws Exception{
        this.orig1 = orig1;
        this.dest = dest;

        try {

            BufferedReader br1 = new BufferedReader(new FileReader(this.orig1)); 

            String linea1 = br1.readLine();

            while((linea1!=null)){
                if(linea1!=null){
                    n.add(linea1);
                    linea1 = br1.readLine();
                }
            }
            br1.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean writeToFile(){
        //!POR ESO INICIALIZAMOS EN EL CONSTRUCTOR A TRUE
        if(this.initialized){
            try {
                //! LO PASAMOS A UN FILE PARA VER SI EXISTE, PARA PODER BORRARLO
                File file = new File(this.dest);
                if(file.exists())
                    file.delete();
                //! CREAMOS EL BUFFERED
                BufferedWriter bw = new BufferedWriter(new FileWriter(this.dest));   
                
                Collections.sort(n);

                for(String linea:n){
                    bw.write(String.format("%s\n",linea));
                }

                bw.close() ;
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
}
