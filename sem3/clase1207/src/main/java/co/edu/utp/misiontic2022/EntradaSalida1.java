package co.edu.utp.misiontic2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EntradaSalida1 {
    
    public static void main(String arg[]){
        String linea=null;
        /*el input, lo que ingresa la persona, se lo paso a un flujo de entrada
        para eso es "InputStreamReader". 
        Para que sean trasnformados en Byte
        Lo recibe el "BufferedReader, que es el codificador*/
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                      /*String*/       /*binario*/        /*String*/                               
        PrintWriter salida = new PrintWriter(System.out, true);
        salida.println("\nEscribe el texto: ");
        try {
            linea = entrada.readLine();    
        } catch (Exception e) {
            System.err.println(e);
        }
    
    salida.println("\nLa línea escrita es:");
    salida.println(linea);
    }
}
