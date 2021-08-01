//Grupo ID "co.edu.utp" queda ubicado en la carpeta donde guardé la configuración de Maven (ciclo 2 - sem3)
//al entrar a la carpeta se ha creado 1 carpeta "co", otra "edu", otra "utp
// Maven es un Gestionador de dependencias 
package co.edu.utp.misiontic2022;

import java.util.ArrayList;
 
//import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //se debe poner el tipo de datos que entrará a la lista dentro del simbolo <>
        ArrayList <Integer> lista = new ArrayList();
        //métodos
        //AÑADIR DATOS
        lista.add(17);
        lista.add(2);
        lista.add(100);
        //obtener valor de la posición requerida. En este caso en la posición 2
        System.out.print(lista.get(2));

    
    }

}
