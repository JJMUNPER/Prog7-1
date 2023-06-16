package Org.LosRemedios.Programacion.T7.Actividades.Act1.Act7;

import java.io.*;

public class Act7 {

    public static void main(String[] args) {
        try {
            // Crear un archivo de prueba
            File archivo = new File("C:/test.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            writer.write("Línea 1\n");
            writer.write("Línea 2\n");
            writer.write("Línea 3\n");
            writer.close();

            // Leer el archivo y utilizar mark y reset
            BufferedReader reader = new BufferedReader(new FileReader(archivo));

            // Leer las primeras dos líneas
            String linea1 = reader.readLine();
            System.out.println("Línea 1: " + linea1);
            String linea2 = reader.readLine();
            System.out.println("Línea 2: " + linea2);

            // Marcar la posición actual en el lector
            reader.mark(100);

            // Leer la siguiente línea
            String linea3 = reader.readLine();
            System.out.println("Línea 3: " + linea3);

            // Resetear el lector a la posición marcada anteriormente
            reader.reset();

            // Leer desde la posición marcada
            String linea4 = reader.readLine();
            System.out.println("Línea 4: " + linea4);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Explicacion Mark y Reset
         *
         *     Leen las primeras dos líneas del archivo normalmente utilizando readLine(). Estas líneas se imprimen en la consola.
         *     Utiliza el método mark() en el lector para marcar la posición actual. Se especifica un tamaño de marcado (100 en este caso), lo que significa que se pueden leer hasta 100 caracteres después de la posición marcada.
         *     Lee la tercera línea del archivo y se imprime en la consola.
         *     Utiliza el método reset() en el lector para volver a la posición marcada anteriormente.
         *     Lee desde la posición marcada y se obtiene la cuarta línea del archivo, que se imprime en la consola.
         *
         *     La función del método mark() es marcar la posición actual en el flujo de datos, lo que permite volver a esa posición posteriormente utilizando el método reset()
         */
    }
}
