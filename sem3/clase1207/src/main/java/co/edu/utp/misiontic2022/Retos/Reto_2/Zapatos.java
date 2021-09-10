package co.edu.utp.misiontic2022.Retos.Reto_2;

public class Zapatos {

///////////////////////////////////////////////Constantes/////////////////////////////////////////////////////////////////
/*Se usa protected final static ya que se entiende que es una herencia. Esta es la clase "Papá", la que hereda. Si se fuera a usar en otra clase, entonces sería private*/
protected final static String MARCA="Arturo";
protected final static String TIPO_MATERIAL ="Cuero";
protected final static double PRECIO_BASE=10000;


///////////////////////////////////////////////Atribtutos/////////////////////////////////////////////////////////////////
protected String marca;
protected String tipo_material;
protected Double precioBase;

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/


///////////////////////////////////////////////Constructores/////////////////////////////////////////////////////////////////

//*Se realizan 3 constructores: 2 donde no se reciban datos, so se debe inicializar con las constantes por defecto. 1 donde se reciben todod los datos*/
/*1. Donde no se reciben ningún dato. So se iniciliza con las constantes*/
public Zapatos(){
    this.marca = MARCA;
    this.tipo_material = TIPO_MATERIAL;
    this.precioBase = PRECIO_BASE;
}

/*2. Donde se reciben dos datos. So solo se inicializa 1 de las variables con la constantes respectiva*/
public Zapatos(String marca,Double precioBase){
    this.marca = marca;
    this.precioBase = precioBase;
    this.tipo_material = TIPO_MATERIAL;
}

/*3. Donde se reciben todos los datos*/
public Zapatos(String marca,String tipo_material,Double precioBase){
    this.marca = marca;
    this.precioBase = precioBase;
    this.precioBase = precioBase;
    this.tipo_material = tipo_material;
}

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

///////////////////////////////////////////////Métodos/////////////////////////////////////////////////////////////////
/*para comprobar el dato que está entrando, de lo contrario queda con el valor por defecto*/
/* public  tipoDatometodo1(){
    // En caso de ser necesarios metodos adicionales
    }*/

public Zapatos(String marca, String tipo_material, int precioBase) {
    this.marca = marca;
    this.tipo_material = tipo_material;
    this.precioBase = (double) precioBase;
}

public double calcularPrecio(){
    double precioFinal=0;
    // Calculos

    if (marca == "Arturo"){
        precioFinal += (precioBase*0.75);
    }if (marca != "Arturo") {
        precioFinal += (precioBase*0.20);
    /*Dado que el tipo de material afecta el valor final, por eso pong el +=*/
    }if (tipo_material == "Cuero") {
        /*Dado que dice que si el valor del zapato es menor a 5000, pues no se hace descuento. So si es menor, según mi condicional, no restaria ningún descuento. Sumaria cero al valor que ya tre*/
        if (precioBase < 5000){
            precioFinal += 0;
        }else{
            precioFinal += (precioBase - 5000);
        }
    }if (tipo_material != "Cuero") {
        if (precioBase < 500){
            precioFinal += 0;
        }else{
            precioFinal += (precioBase - 500);
        }
    }

    return precioFinal;
    };
    // getters/setters de ser necesarios
};



