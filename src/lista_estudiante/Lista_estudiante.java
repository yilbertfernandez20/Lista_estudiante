package lista_estudiante;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Lista_estudiante {

    public static void main(String[] args) {
        lista l=new lista();
        
        l.menu();
        
        System.out.println(l.vacia());
        System.out.println(l.gettamaño());
        
        
    }
    
}
