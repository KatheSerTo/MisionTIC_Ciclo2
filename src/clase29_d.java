import java.util.Scanner;

public class clase29_d {

    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
        //Opción 1 "Fácil"
        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();
        //System.out.println("Hola k" + nombre);
        //Usando la función saludar 
        System.out.println(saludar(nombre));        

    } 

     //Para crear función en Java OPCIÓN #2. Donde va String debe ir el tipo de variable que retornará la función. 
     //En este caso retornaría un texto, por eso tipo String
     //Opción 2: Función Saludar
     public static String saludar(String nombre){
         return "Hola " + nombre;
     }

}