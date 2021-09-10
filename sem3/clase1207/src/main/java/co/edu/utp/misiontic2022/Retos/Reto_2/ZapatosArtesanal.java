package co.edu.utp.misiontic2022.Retos.Reto_2;

public class ZapatosArtesanal extends Zapatos{

// Constantes
 private final static int TAMAÑO = 40;

// Atributos
 private int tamaño;

// Constructores
/*1. Donde no se reciben ningún dato. So se iniciliza con las constantes*/
public ZapatosArtesanal(){
    this.marca = MARCA;
    this.tipo_material = TIPO_MATERIAL;
    this.precioBase = PRECIO_BASE;
    this.tamaño = TAMAÑO;
}

/*2. Donde se reciben dos datos. So solo se inicializa 1 de las variables con la constantes respectiva*/
public ZapatosArtesanal(String marca,Double precioBase){
    super(marca, precioBase);
    this.tipo_material = TIPO_MATERIAL;
    this.tamaño = TAMAÑO;
}

/*3. Donde se reciben todos los datos*/
public ZapatosArtesanal(String marca,String tipo_material,Double precioBase, int tamaño){
    /*super se usa para "traer" atributos de la clase mayor*/
    super(marca,tipo_material,precioBase);
    this.tamaño = tamaño;
}


public ZapatosArtesanal(int tamaño) {
    this.tamaño = tamaño;

}

// Metodos
 public double calcularPrecio(){
     
    double precioFinal = super.calcularPrecio();

// Calculos
if (tamaño < 40 ){
    precioFinal += 10000;   
}else{
    precioFinal += 4500;
}

 return precioFinal;
 }

 
};
