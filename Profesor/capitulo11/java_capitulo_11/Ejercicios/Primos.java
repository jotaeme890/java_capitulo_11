package Ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Primos {
    //! EN ESE EJEMPLO DEL PROFESOR, LOS PRIMOS LOS METE EN UN ARRAYLIST
    ArrayList<Integer> primos = new ArrayList<Integer>();
    String archivo;

    public Primos(String archivo){
        this.archivo = archivo;
        //! DESDE EL CONSTRUCTOR LLAMAMOS AL INICILIZADOR
        this.init();
    }

    private void init(){

        try {
            //! CREA EL BUFFERED CON EL NOMBRE DEL ARCHIVO QUE LE HEMOS PASADO COMO PARAMETRO
            BufferedReader br = new BufferedReader(new FileReader(this.archivo));

            String linea = br.readLine();

            while(linea !=null){
                //! COMO EL ARCHIVO VA A SER DE NUMEROS LE HACEMOS UN Integer.parseInt A CADA LINEA PARA QUE SE LEA COMO TAL
                int primo = Integer.parseInt(linea);
                //! LO PODEMOS AÑADIR CON EL METODO .add QUE HEMOS CREADO
                primos.add(primo);
                linea = br.readLine();
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }

    //! PARA METER EL NUMERO EN EL ARRAYLIST DESDE EL MAIN
    public void add(int primo){
        this.primos.add(primo);
    }

    public void writeToFile(){
        try {
            //! LE PASAMOS EL MISMO NOMBRE Y RUTA A UN TIPO File 
            File file = new File(this.archivo);
            //! EN EL CASO DE QUE EXISTA, LO BORRAMOS PARA PODER HACER CUALQUIER POSIBLE CAMBIO (AÑADIR UN NUMERO MAS, ESTA EN EL MAIN)
            if(file.exists())
                file.delete();
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivo));

            for(int primo:primos){
                bw.write(String.format("%d\n",primo));
            }

            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString(){
        String result = "";
        //! FOREACH PARA EL ARRAYLIST
        for(int primo:primos){
            result+=String.format("%d\n",primo);
        }
        return result;
    }

    /** siguientePrimo
     * Devuelve el siguiente primo a un número dado
     * @param valor
     * @return valor entero conteniendo el siguiente primo al valor dado
     */
    public static int siguientePrimo(int valor){
        int sig = valor;
        boolean esPrimo = true;
        do {
            sig++;
            esPrimo = true;     
            //! DESDE 2 HASTA QUE i SEA MENOR O IGUAL AL NUMERO/2 Y SEA PRIMO       
            for(int i = 2; i<=sig/2 && esPrimo; i++){
                if(sig%i==0)
                    esPrimo = false;
            }
        } while (!esPrimo);
        return sig;
    }
}
