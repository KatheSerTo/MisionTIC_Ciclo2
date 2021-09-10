package co.edu.utp.misiontic2022.Retos.Reto_2;

public class Factura4 {

  // Atributos

  /*es privado porque solo se utilziaran en esta clase*/
  private double totalZapatos;
  private double totalZapatosNacional;
  private double totalZapatosArtesanal;

  /*Lista de precios de Zapatos*/
  /*Es un arreglo de tipo "Zapatos". Es decir como de la clase mayor*/
  private Zapatos listaZapatos[];

  // Constructores

  // El constructor sirve para inicializar las variables en cero. 
  //* 1. constructor de cuando solo ingresan la lista*/
  public Factura4(Zapatos listaZapatos[]){
  /*al no darle parámetros se inicializa, según el enunciado, en cero por defecto*/
    this.totalZapatos=0;
    this.totalZapatosNacional=0;
    this.totalZapatosArtesanal=0;
        this.listaZapatos = listaZapatos;
  }
  //* 2. constructor de cuando no ingresan datos*/
  public Factura4(){
    this.totalZapatos=0;
    this.totalZapatosNacional=0;
    this.totalZapatosArtesanal=0;

  }
  
  // Metodos

      public void mostrarTotales(){
        /*Debemos hacer las instancias. Una instancia se puede entender como un objeto*/
        /*Debemos recorrer cada atributo de la lista para verificar si está instanciado para llamar el método de "Calcular precio" en cada clase*/
           /*(tipo del arreglo realizado, nombre de la variable con la que se accede a cada atributo de la lista, lista)*/
        for (Zapatos x: listaZapatos ){
          /*función instanceof que sirve para verficar si el atributo está instanciado*/
          /*So, si x está instanceado en Zapatos, hace: */
          if (x instanceof Zapatos){
            /*se va sumando porque se va a pasar un arreglo de datos, que está en la clase app*/
            totalZapatos += x.calcularPrecio();

          }
          if (x instanceof ZapatosNacional){
            totalZapatosNacional += x.calcularPrecio();

          }
          if (x instanceof ZapatosArtesanal){
            totalZapatosArtesanal += x.calcularPrecio();

          }
          /*Para cada una de nuestras variables (totalzapatos,totalzapatosNacional,totalzapatosArtesanal) 
          tendremos una especio de "contenedor" de Calcularprecio para CADA UNA de las clase
          Así, cada vez que instanciemos al ingresar datos, se irá sumando a totalZapatos*/

        }

        /*se imprime la info requerida*/

        System.out.println("El precio total de los zapatos es de " + totalZapatos);
        System.out.println("La suma del precio de los ZapatosNacional es de " + totalZapatosNacional);
        System.out.print("La suma del precio de los Zapatos Artesanales es de " + totalZapatosArtesanal);
     }
         
};
