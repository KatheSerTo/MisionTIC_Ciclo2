
//UNA CLASE NO PUEDE HEREDAR DE DOS CLASES A LA VEZ (HERENCIA MULTIPLE). Es decir que Perro no puede tener 2 clases sup como Animal y Canino
//Java es un lenguaje de herencia simple
public class Animal {
    private String formaReproducción;
    private String temperaturaSangre;

    public String getFormaReproducción() {
        return formaReproducción;
    }
    
    public void setFormaReproducción(String formaReproducción) {
        this.formaReproducción = formaReproducción;
    }
    public String getTemperaturaSangre() {
        return temperaturaSangre;
    }
    public void setTemperaturaSangre(String temperaturaSangre) {
        this.temperaturaSangre = temperaturaSangre;
    }
}


