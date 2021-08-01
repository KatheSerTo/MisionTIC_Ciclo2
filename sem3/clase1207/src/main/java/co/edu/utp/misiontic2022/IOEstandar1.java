package co.edu.utp.misiontic2022;

import java.io.*;

/*usando el tema de Bytes*/
/*FORMA DE MÁS BAJO NIVEL PARA LEER POR CONSOLA SIN SCNER LEYENDO CHAR POR CHAR*/ 
public class IOEstandar1 {

    public static void main(String args[]) {
        int numBytes = 0;
        /*Char es 1 caracter cualquiera */
        char caracter;
        System.out.println("Escribe un texto:");
        try {
            do { /*do es para hacer por 1era vez*/
            /*in.read es para leer, es como un sacenner"*/  
            caracter = (char)System.in.read();  /*empieza a leer caracter por caracter de la palabra ingresada*/
            System.out.print(caracter);
            /*Cuenta la cant de bytes (caracteres)*/
            numBytes++;

            } while (caracter != '\n'); /*aquí saltaria el mensaje sobre el # de bytes, pues se termina el "ciclo" */
                System.err.printf("%d bytes leidos %n", numBytes);
        } catch (IOException e) {
              System.err.println(e);
          }
    } /*El resultado da 6 bytes pues son 4 letras y toma en cuenta el salto de linea que son 2 caracteres*/
    
};
