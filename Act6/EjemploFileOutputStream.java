package Org.LosRemedios.Programacion.T7.Actividades.Act1.Act6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploFileOutputStream {

    public static void main(String[] args) throws IOException {
        java.io.FileOutputStream fileOutputStream = null;
        try {

            fileOutputStream = new java.io.FileOutputStream("FlujoFicheroBinario.bin");
            fileOutputStream.write("Hola".getBytes());

        } catch (FileNotFoundException e) {

            System.out.println("El fichero no existe");
            e.printStackTrace();

        } finally {

            fileOutputStream.close();
        }
    }
}
