

import Ejercicios.FileMixer;

public class Ejercicio3 {
    public static void main(String[] args){
        if(args.length!=3){
            System.out.println("Número incorecto de argumentos");
            return;
        }
        
        try {
            FileMixer fm = new FileMixer(args[0], args[1], args[2]);    
            fm.writeToFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
