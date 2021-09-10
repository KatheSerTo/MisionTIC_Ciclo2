package co.edu.utp.misiontic2022.Retos.Reto_2;

public class App {
    public static void main(String[] args) {
     /*   // Caso de Prueba 1
         Zapatos zapatos[]=new Zapatos[5];
         zapatos[0]=new Zapatos("Arturo", "Cuero", 5000);
         zapatos[1]=new ZapatosNacional("Valle");
         zapatos[2]=new ZapatosArtesanal(42);
         zapatos[3]=new Zapatos();
         zapatos[4]=new ZapatosNacional("Cundinamarca");
         Factura4 solucion = new Factura4(zapatos);
         solucion.mostrarTotales(); }  
};*/

    Zapatos zapatos[]=new Zapatos[5];
zapatos[0]=new Zapatos("Maria", "Sintetico", 7500);
zapatos[1]=new ZapatosNacional("Antioquia");
zapatos[2]=new ZapatosArtesanal(30);
zapatos[3]=new Zapatos();
zapatos[4]=new ZapatosNacional("Valle");
Factura4 solucion = new Factura4(zapatos);
solucion.mostrarTotales(); }
};

