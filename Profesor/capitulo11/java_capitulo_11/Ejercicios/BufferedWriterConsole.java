package Ejercicios;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
public class BufferedWriterConsole extends BufferedWriter{

    //! ESTA CLASE NOS SIRVE PARA SABER QUE ESTAMOS ESCRIBIENDO EN EL ARHCIVO YA QUE PODEMOS CAMBIAR EL BUFFERED Y LO IMPRIMIRA POR CONSOLA
    public BufferedWriterConsole(Writer out) {
        super(out);
    }
    
    @Override
    public void write(String text) throws IOException{
        try {
            System.out.print(text);
        } catch (Exception e) {
            throw e;
        }
        
    }
}
