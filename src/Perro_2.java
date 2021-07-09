//para que el perro herede lo de "canino_2" recuerda usar extends
//Una clase que hereda algo de otra clase que tiene type abstract, es obligatorio que la clase heredante OBLIGATORIAMENTE debe implementarlo
public class Perro_2 extends Canino2{

    private String nombre;
    private int edad; 

public int getEdad() {
        return edad;
    }
public void setEdad(int edad){

    this.edad = edad;

}
//Obigatoriamente debo implementar los métodos de la clase abstracta que da su herencia
//lo sgte se obtuvo dando en "quick fix" en la palbara Perro_2 cuando mostraba el error por no tener el método de la clase abstracta
@Override
public void cazar() {
    // TODO Auto-generated method stub

//Override = sobreescribir. Cuando haya un @ en Java significa "anotación", es decir, anotación informativa. Al ponerlo arriba del método, no tiene ningún impacto
//el override me da a entender que ese método viene de otra clase superior
    
}


}





