package Org.LosRemedios.Programacion.T7.Actividades.Act1.Act7;

import java.io.PrintWriter;

public class Act7 {

    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Operación Completada");
        writer.flush();
        writer.close();

        PrintWriter writer1 = null;
        writer1 = new PrintWriter("C:/testPrintWriter");
        writer1.write("Test del fichero");
        writer1.flush();
        writer1.close();
    }
}
