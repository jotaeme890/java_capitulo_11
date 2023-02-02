package Ejemplos;
/**
* Paso de argumentos en la línea de comandos
*
* @author Juan A. García
*/
class Ejemplo8 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i < args.length; i++) {
            suma += Integer.parseInt(args[i]);
        }
        System.out.println(suma);
    }
}