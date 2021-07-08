public class Canino {
    private String aullar;
    private String formaDeAlimentacion;

    //Al ser privados debo crear los métodos para que se puedan ver

    //Asignar los valores a las variables creadas en esta clase
    public Canino(String aullar, String formaDeAlimentación){
        this.aullar = aullar;
        this.formaDeAlimentacion = formaDeAlimentación;

    }

    public String getAullar() {
        return aullar;
    }

    public void setAullar(String aullar) {
        this.aullar = aullar;
    }

    public String getFormaDeAlimentacion() {
        return formaDeAlimentacion;
    }

    public void setFormaDeAlimentacion(String formaDeAlimentacion) {
        this.formaDeAlimentacion = formaDeAlimentacion;
    }
    
}
