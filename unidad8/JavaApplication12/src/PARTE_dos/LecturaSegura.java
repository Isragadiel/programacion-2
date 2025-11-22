package PARTE_dos;

import java.io.*;

public class LecturaSegura {
    public static void leer(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo con try-with-resources.");
        }
    }
}
