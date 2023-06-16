package Org.LosRemedios.Programacion.T7.Actividades.Act1.Act6;

public class EjemploPrintStream {

    public static void main(String[] args) {

        String data = "Texto que se introducira en el archivo";

        try {
            java.io.PrintStream output = new java.io.PrintStream("printStream.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
