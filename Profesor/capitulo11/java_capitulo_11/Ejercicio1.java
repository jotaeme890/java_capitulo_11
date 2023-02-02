
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Ejercicios.Primos;

public class Ejercicio1 {
    public static void main(String [] args){
        if(args.length!=2){
            System.out.println("El número de argumentos tiene que ser dos");
            return;
        }
        //! LOS ARGUMENTOS SON EL MINIMO Y EL MAXIMO PARA LOS PRIMOS
        int minValue = 0;
        int maxValue = 0;
        try {
            minValue = Integer.parseInt(args[0]);
            maxValue = Integer.parseInt(args[1]);
        } catch (Exception e) {
            System.out.println("Debe pasar dos argumentos de tipo entero");
            return;
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("primos.dat"));
            //! SE PONE EL MINIMO YA QUE PARA SABER TODOS HAY QUE EMPEZAR POR EL PRIMERO
            int primo = minValue;

            do {
                primo = Primos.siguientePrimo(primo);
                if(primo <= maxValue){
                    bw.write(String.format("%d\n",primo));
                }
            } while (primo <=maxValue);
            
            if(bw!=null)
                bw.close(); 

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }      
    }
}   
