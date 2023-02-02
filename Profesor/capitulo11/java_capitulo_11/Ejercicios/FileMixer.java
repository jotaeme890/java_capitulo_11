package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileMixer {
    private String orig1;
    private String orig2;
    private String dest;
    public boolean initialized = false;
    ArrayList<String> mixture = new ArrayList<String>();

    public FileMixer(String orig1, String orig2, String dest) throws Exception{
        try {
            this.init(orig1, orig2, dest);    
            this.initialized = true;
        } catch (Exception e) {
            throw e;
        }
    }
    //! PARA LEER DE 2 LADOS
    private void init(String o1, String o2, String d) throws Exception{
        this.orig1 = o1;
        this.orig2 = o2;
        this.dest = d;
        try {

            BufferedReader br1 = new BufferedReader(new FileReader(this.orig1));

            BufferedReader br2 = new BufferedReader(new FileReader(this.orig2));   

            String linea1 = br1.readLine();

            String linea2 = br2.readLine();

            while((linea1!=null) || (linea2!=null)){
                if(linea1!=null){
                    mixture.add(linea1);
                    linea1 = br1.readLine();
                }
                if(linea2!=null){
                    mixture.add(linea2);
                    linea2=br2.readLine();
                }
            }
            br1.close();
            br2.close();
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
                
                for(String linea:mixture){
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
