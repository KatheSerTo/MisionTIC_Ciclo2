package utp.misiontic2022.c2.mundo;
/**
* Clase que representa un Proyecto.
*/
public class ProyeccionPublica {

    /*Datos entrada*/

    public static void main(String[] args){
        System.out.println(inversion(11,2005000,4));
    }

    /*Método calcular*/
    public static String inversion (int pTiempo, double pCapital, double pInteres)
    {


      /*definimos el tiepo de variable que es*/ 
      double calcularInteresCompuesto = 0;
      double calcularInteresSimple = 0;
      String resp_final;

    
       /*Cálculos*/
      calcularInteresSimple = pCapital * pInteres * pTiempo;
      calcularInteresCompuesto = pCapital *((Math.pow(1+pInteres, pTiempo))-1);
      
      /*todas las vriabls locales en js deben llevar el tipo*/
 
      double respuesta =  calcularInteresCompuesto - calcularInteresSimple;
        
      /*Respuesta en String*/
    
    if (respuesta != 0){
        resp_final = ("La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta);
    }else{
        resp_final = ("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto");
    }
    return resp_final;

    };

};