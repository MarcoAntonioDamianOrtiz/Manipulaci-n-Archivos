import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacionArchivos {

    public static void leerArchivos(String fileName) {
        File file; // Apunta a un archivo fisico en el disco duro
        FileReader reader; // llave con permisos de lectura
        BufferedReader bufer; // recuperar infotmacion de un archivo
        String line; // recuperar archivos de texto
        // try sirve para acceder
        try {
            // crear un apuntador al archivo fisico
            file = new File("C:\\Archivos\\" + fileName + ".txt");
            // abrir el archivo para lectura
            reader = new FileReader(file);
            // configurar el bufer para leer los datos del archivo
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine()) != null) {
                System.out.println("Linea leida: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("Lectura de archivos de texto:");
        System.out.println("Escribe el nombre del archivo:");
        fileName = bufer.readLine();
        leerArchivos(fileName);

    }
}
