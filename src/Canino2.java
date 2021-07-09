

//Cuando quuero que una clase no se cree, es decir que no hayan constructores ni "news"
//se usa abstract class
public abstract class Canino2 {
    
    private String aullan;

    public String getAullan() {
        return aullan;
    }

    public void setAullan(String aullan) {
        this.aullan = aullan;
    }

    //nuevo método
    //utiliza abstract, no hay llave (es decir, que no hay cuerpo, ni instrucciones)
    public abstract void cazar();

}
