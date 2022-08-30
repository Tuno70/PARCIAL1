package Archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Archivos {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        String nombreArchivo = "C:/prueba.txt";
       

        FileInputStream archivo; 
        InputStreamReader conversor; 
        BufferedReader filtro; 
        String lÃ­nea;
       


        try {
            archivo = new FileInputStream(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encuentra");
        }
        catch (IOException e){
            System.err.println("El programa fallo");
        }
        catch(Exception e){
            System.err.println("El programa fallo");
        } 
        finally {
            System.out.println("Finalizar programa");
        }
        archivo = new FileInputStream(nombreArchivo);
        conversor = new InputStreamReader(archivo);
        filtro = new BufferedReader(conversor);
        lÃ­nea = filtro.readLine();
        while (lÃ­nea != null) {
            System.out.println(lÃ­nea);
 
            lÃ­nea = filtro.readLine(); 
        }
        filtro.close();
    }
}

    


