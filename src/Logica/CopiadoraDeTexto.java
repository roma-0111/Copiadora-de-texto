package Logica;
import IGU.Pantalla;

public class CopiadoraDeTexto {
 
    public static void main(String[] args) {
        //Creamos el Objeto
        Pantalla pantalla = new Pantalla();
        
        //Modificamos al Objeto
        pantalla.setTitle("Copiadora de texto!");
        pantalla.setLocationRelativeTo(null); //Ubicamos en la posición en el medio. (no funciona del bien)
        pantalla.setVisible(true); //Hacemos visible
        
    }

}
