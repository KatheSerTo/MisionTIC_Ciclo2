public class App3 {

    public static void main(String[] args) {
        Perro_2 perrito = new Perro_2();
        //en la ste línea se llama el método set de perrito, que a su vez es de la clase "Perro_2", que a su vez heredó el "aullan" de su clase superior: Caninos_2        
        perrito.setAullan("woff");
        System.out.println(perrito.getAullan());
        //si quiero crear un nuevo canino en Canino_2
        //me va a dar el error "No quick fixes available", dado que es una variable abstracta (explicado en (Canino2)
        //ERROR Canino2 c1 = new Canino2();
            
    }
    
}
