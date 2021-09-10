package co.edu.utp.misiontic2022.Retos.Reto_2;

public class ZapatosNacional extends Zapatos {
// Constantes
/*es privada, ya que al ser una clase "hija" solo se utilizara en esta clase. De modo que no es necesario el protected*/
 private final static String REGION="Cundinamarca";
 
// Atributos
 private String region;
 
// Constructores
/*Dado que esta clase es una herencia de la clase mayor "Zapatos", también deben ir los constructores de esa clase aquí*/
/*Y se deben agregar los atributos de ZapatosNazional*/

/*1. Donde no se reciben ningún dato. So se iniciliza con las constantes*/
public ZapatosNacional(){
    this.marca = MARCA;
    this.precioBase = PRECIO_BASE;
    this.tipo_material = TIPO_MATERIAL;
    this.region = REGION;
}

/*2. Donde se reciben dos datos. So solo se inicializa 1 de las variables con la constantes respectiva*/
public ZapatosNacional(String marca,Double precioBase){
    super(marca, precioBase);
    this.tipo_material = TIPO_MATERIAL;
    this.region = REGION;
}

/*3. Donde se reciben todos los datos*/
public ZapatosNacional(String marca,String tipo_material,Double precioBase,String region){
    /*super se usa para "traer" atributos de la clase mayor*/
    super(marca, tipo_material,precioBase);
    this.region = region;
}

// Metodos
 public ZapatosNacional(String region) {
     this.region = region;
}

public double calcularPrecio(){
     /*Por el ejercicio ya se tiene un valor base del precio final, que fue calculado en la clase "Zapatos", entonces 
     para poder continuar con ese valor obtenido allá y calcular de acuerdo a la región, se usa el método "supe" seguido de un punto, 
     seguido del método usado en la calse mayor, es decir: calcularprecio()*/
     double precioFinal = super.calcularPrecio();
 // Calculos

 if (region == "Cundinamarca"){
        precioFinal += 10000;   
    }else{
        precioFinal += 0;
    }
    return precioFinal;
}

};

