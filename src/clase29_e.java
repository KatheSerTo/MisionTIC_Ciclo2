import java.util.Scanner;

public class clase29_e {
    public static void main(String args []){
        //Vamos a pedir números enteros. 
        //Ejercicio para saber cuantas unidades tiene un número
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = contadorDigito(numero);
        System.out.println("el número " + numero + " tiene " + resultado + " unidades");
    }
    
    //El número que se guarda en la variable "numero" lo vamos a pasar a una función aux

    public static int contadorDigito(int numero){
        //1990 tiene 4 digitos
        //estrategia a utilizar sería didvidi por 10
        int cifras = 0; //inicia en cero
        while(numero!=0){  //cuando sea diferente de cero entra al ciclo
            numero /= 10;
            cifras++;   //los dos ++ significan que me suma "1" a la variable. 
        }
        return cifras;   
            //LOGICA: 
                 //Entra el número 1999 y se divide entre 10, así que queda 199
                 // pero el 199.0 en entero es 199, sigue rotando y suma 1 a "cifras", así que continua entrando al while
                 // luego 199 dividido 10 da 19.9, que sería 19 en entero. Suma 1 más a "cifras" ya va 2 en cifras
                 // luego divide 19 entre 10 y da 1.9, que en entero sería 1. Suma 1 más a "cifras", quedando así en 3 las cifras
                 //Finalmente el 1 dividido entre 10 es: 0.1, que en entero sería 0, por lo que aumenta en cifras signigicativas 1, quedando 4 en cifras. 
                 //Al quedar la variable numero = 0, ya no entra en el while, así quue para el proceso. Cifras queda con el número 4. 
                 

        
    }
}
