package Ejercicios.Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        if(args.length != 2){
            System.out.println("Tiene que ser 2 argumentos");
        }

        try {
            Buscador b = new Buscador(args[0],args[1]);
            System.out.println(b);
        } catch (Exception e) {
        }
    }
}
