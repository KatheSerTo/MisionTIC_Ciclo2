import java.util.Scanner;

public class clase29_c {
    public static void main(String[] args){
        //parámetro-objeto scanner. Objetos son tipos de datos que uno crea
        //sacaner es la variable. 
        //Scanner scaner = new Scanner(System.in); //dentro del parentesis va el valor que se espera tener
        //system.in es el input del sistema
        //creo una variable string y será igual a variable.nextline(), que permite ingresar datos. 
        //System.out.println("Ingresa una palabra");        
        //String entrada = scaner.nextLine();
        //System.out.println("El mensaje fue " + entrada);
        /*
        if (5<3){
            System.out.println(":)");
        }else if (3>2){
            System.out.println("T.T");
        }else{
            System.out.println(":(");
        }*/
        //Usando Switch
        //para comparar 2 strings se usa .equals, no == que está reservado a enteros
        Scanner scaner = new Scanner(System.in); //dentro del parentesis va el valor que se espera tener
        System.out.println("Ingresa un animal:");
        String animal = scaner.nextLine();
        /*if (animal.equals ("Perro")){
            System.out.println("Wof");
        }else if (animal.equals("Gato")){
            System.out.println("Miau");
        }else{
            System.out.println("No encuentro el animal");
        }*/
        //como funciona switch. En switch uno tiene casos de igualdad
        switch (animal){
            case "Perro": //caso 1 del switch
                System.out.println("Woff");
                break;              
            case "Gato":
                System.out.println("Miau");
                break;
            case "Loro":
                System.out.println("Quiere cacao");
                break;
            default:
            System.out.println("No se encuentra el animla");

        }
    }
}
