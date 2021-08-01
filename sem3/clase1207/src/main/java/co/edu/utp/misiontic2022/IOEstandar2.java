package co.edu.utp.misiontic2022;

import java.io.IOException;

/*2da versión para leer sin scanner*/
/*1 byte son 8 bits.  Permite guardar números desde -128 a 128*/

public class IOEstandar2 {

public static void main(String args[]){
    byte[] buffer = new byte[255]; /*permite guardar hasta 255 números*/
    /*Ingresa el texto*/
    System.out.println("\nEscribe el texto");
    try{ 
    /*Aquí, lee letra por letra y la guarda en buffer   */
        System.in.read(buffer,0,255);
    
    } catch (IOException e) {
        System.err.println(e);

    } /* cuando termina y da "enter" saca: */
        System.out.println("\nLa línea escrita es: ");
     /*convierte  el buffer a un string primer caracter concatenado con los demas*/
        /*System.out.println(new String(buffer));*/
        /*Dado que estamos trabajando con Byte, el valor que me debería retornar debería ser el de los byte
        en este caso, al pedirle que retorne el valor en la posición "0" de lo guardado en buffer, no me dará  la 1era letra de la palabra;
        sino, que me dará como resultado el # que representa a esa letra en el código SCII*/
        /*System.out.println(buffer[0]);*/
        /*Guardo el buffer como format ASCII, pero lo saco, imprimo com String*/ 
        System.out.println(new String (buffer);


}
    
}
