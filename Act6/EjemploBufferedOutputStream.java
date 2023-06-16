package Org.LosRemedios.Programacion.T7.Actividades.Act1.Act6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploBufferedOutputStream {

    public static void main(String[] args) {

        byte JK = 7;
        byte FD = 9;

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("EscrituraFlujoBufferBinario.bin");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write((byte)'H');
            bufferedOutputStream.write((byte)'o');
            bufferedOutputStream.write((byte)'l');
            bufferedOutputStream.write((byte)'a');
            bufferedOutputStream.write(JK);
            bufferedOutputStream.write(FD);
            bufferedOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
