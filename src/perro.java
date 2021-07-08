//ESTO ES UNA CLASE. LA CLASE LLAMADA PERRO

//Agregar "extends" se hace para que la clase perro herede lo que está en la clase Canino. Pues en este ejemplo, el perro hace parte de los caninos (Herencia)

public class perro extends Canino{
    //Las clases en Java tienen 3 componentes:
    //Atributos: caracteristicas de un objeto
    //Tipos de visibilidad: publico (todo el mundo), privada(solo yo), protegido(solo conocidos) 
    //los atributos en Orientado a objetos suele ser privados
    private final boolean PERSEGUIR_COLA = true; //al ponerle final la variable se convierte en una constante
    private String orinar;
    private String nombre;
    private int edad;

    //Constructor 
    //Java hace por defecto el constructor
    //En la ste línea haremos el constructor pra no usar el que da por defecto Java
      
      // al tener perseguirCola como constante (final), entonces no ingresa ocmo variable
    public perro(String nombre, int edad, String orinar){ //siendo perro el mismo nombre de la clase
       
       //Para referirme a la clase superior o que va a dejar herencia
       super("awww", "Omnivoros");      
       //aquí adentro asigno los valores a cada ariable. Los valores son los que se ingresarían en "perro()"
       this.nombre = nombre;
       this.edad = edad;
       this.orinar = orinar;
    } 
    // En Python  def__init__(): Es el constructor de una clase  
    //Metodos
    public String getNombre() {
        return nombre;
    }
    //set es un método publico. Que returna void, es decir que no retorna nada
    //set es asignar 
    public void setNombre(String nombre) {
        // this = este. Se debe poner para asignar algo a la variable con el metodo
        this.nombre = nombre;
    }
    public String getOrinar() {
        return orinar;
    }
    public void setOrinar(String orinar) {
        this.orinar = orinar;
    }
    //en los boleanos no se usa get, se usa is
    // ya que en boleanos se toma como "es perseguir cola? (V o F) "
    public boolean isPerseguirCola() {
        return PERSEGUIR_COLA;
    }




    
}
