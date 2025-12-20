package Logica;
import IGU.Pantalla;

public class CopiadoraDeTexto {
 
    public static void main(String[] args) {
        //Nos instanciamos a la Clase Pantalla.
        Pantalla pant = new Pantalla();
        
        //Modificamos al Objeto con los Setters
        pant.setTitle("Copiadora de texto!");
        pant.setLocationRelativeTo(null); //Ubicamos en la posición en el medio. (no funciona del bien)
        pant.setVisible(true); //Hacemos visible
        
    }

}
