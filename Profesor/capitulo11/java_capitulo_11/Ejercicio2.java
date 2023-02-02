

import Ejercicios.Primos;

public class Ejercicio2 {
    public static void main(String[] args){
        //! PARA INICIALIZAR LA CLASE LE TENEMOS QUE PASAR COMO PARAMETRO EL ARCHIVO DEL QUE QUEREMOS SACAR LOS DATOS 
        Primos primos = new Primos("primos.dat");
        //! AÑADIMOS UN NUMERO MAS AL ARRAY DE PRIMOS 
        primos.add(501);
        //! LO ESCRIBIMOS CON EL METODO toString DE LA CLASE
        System.out.println(primos);

        primos.writeToFile();

        String str1 = "juan "+ null;

        System.out.println(str1);
    }
}
