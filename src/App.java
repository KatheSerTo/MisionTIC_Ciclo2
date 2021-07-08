import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Utilizando la clase Perro (La clase es como un tipo de variable)
        //en la sgte línea llamamos a la clase perro
        //DADO QUE "persigueCola" quedó como constante, no es necesario entrarel datos
        perro perro1 = new perro("Pepe",4,"Alza la pata");
        perro perro2 = new perro("Sasha",3,"Sentada");
        //internamente el métodod setNombre le asigna a la variable el string que está entrando
        //perro1.setNombre("Pepe");
        //imprime el nombre asignado a la variable pepe con el método get
        System.out.println(perro1.getNombre());
        System.out.println(perro2.getNombre());
        
        //Función para mostrar mensajes emergentes
        //El mensaje  mostrado en la posición 1 será el mensaje principal mostrado, el de la 2da posición será el título del mensaje emergente. 
        //JOptionPane.showMessageDialog(null,"Ya es hora de la Clase", "Quiero que sea el descanso", JOptionPane.ERROR_MESSAGE); //WARNING MESSAGE (pone signo de ?)
        
        


    }
}
