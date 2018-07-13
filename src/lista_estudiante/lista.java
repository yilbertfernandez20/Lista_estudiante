package lista_estudiante;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class lista {
    private nodo inicio, fin;
    Estudiante_1 estudiante=new Estudiante_1();
    private int tamaño;
    
    public lista(){
        inicio=null;
        fin=null;
    }
    public boolean vacia(){
        return inicio==null;
    }
    public int gettamaño(){
        return tamaño;
    }
    public void menu(){
        int opcion, opc;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Lista Simple Estudiante\n1-INSERTAR\n2-MOSTRAR\n3-GUARDAR EN ARCHIVO\n6-SALIR"));
            switch (opcion) {
                case 1: {
                    opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1-Insertar al inicio \n2-Insertar al final"));
                    switch(opc){
                        case 1:{
                            agregarinicio();
                        break;}
                        case 2:{
                            agregarfinal();
                        break;}
                        default:{
                            JOptionPane.showMessageDialog(null, "Opciono invalida");
                        break;}
                    }
                    break;}
                case 2:{
                    mostrar();
                break;}
                case 3:{
                    archivo();
                break;}
                case 6:{
                    System.exit(0);
                break;}
                default:{
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
                break;}
            }
            mostrar();
        
        }while(opcion!=6);
    }
    public void agregarfinal(){
        nodo actual=new nodo(crearestudiante());
        if(vacia()){
            inicio=actual; 
            fin=actual;
            
        }else{
            nodo aux=inicio;
            
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            
            aux.setSiguiente(actual);
        }
        tamaño++;
    }
    public void agregarinicio(){
        nodo actual = new nodo(crearestudiante());
        actual.setEstudiante(estudiante);
        if(vacia()){
            inicio=actual;
        }else{
            actual.setSiguiente(inicio);
            inicio=actual;
        }
    }
    public void mostrar(){
        if(!vacia()){
            String salida="";
            nodo temporal=inicio;
            
            int i=0;
            
            while(temporal!=null){
                salida +=i+"="+temporal.getEstudiante().toString()+"\n\n";
                
                System.out.println(i+" "+temporal.getEstudiante().toString());
                JOptionPane.showMessageDialog(null,temporal.getEstudiante().toString());
                temporal=temporal.getSiguiente();
                i++;
            }
            JOptionPane.showMessageDialog(null,salida);
        }
            JOptionPane.showMessageDialog(null,"La lista no contiene datos");
    }
    public Estudiante_1 crearestudiante() {
        
        String[] tipoidenti = {"Nacional", "Residencia"};

        String nombre = JOptionPane.showInputDialog( "Ingresa el nombre del estudiante");
        String apellidos = JOptionPane.showInputDialog( "Ingresa los apellidos del estudiante");
        String residencia = JOptionPane.showInputDialog( "Ingresa la direccion de residencia del estudiante");
        int nacimiento = Integer.parseInt(JOptionPane.showInputDialog( "Ingresa la fecha de nacimiento"));
        Icon icon = null;
        int identificacion = JOptionPane.showOptionDialog( null,"Tipo de identificacion", "Identificacion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, tipoidenti, tipoidenti[0]);
        if (identificacion == 0) {
            int carnet = Integer.parseInt(JOptionPane.showInputDialog( "Ingresa el numero de cedula"));
        } else if (identificacion == 1) {
            int carnet = Integer.parseInt(JOptionPane.showInputDialog( "Ingresa el numero de residencia"));
        }
        String trabaja = JOptionPane.showInputDialog( "El estudiante tiene trabajo");
        
        Estudiante_1 est1=new Estudiante_1();
        
        est1.setNombre(nombre);
        est1.setApellidos(apellidos);
        est1.setResidencia(residencia);
        est1.setTrabaja(trabaja);
        est1.setIdentificacion(identificacion);
        est1.setCarnet(tamaño);
        est1.setTipoident(nacimiento);
        
        
        return est1;

    }
    public Estudiante_1 getEstudiante(int posicion) throws Exception{
        if(posicion>= 0 && posicion<tamaño){
            if(posicion==0){
                return inicio.getEstudiante();
            }else{
                nodo aux=inicio;
                
                for(int i=0; i<posicion; i++){
                    aux=aux.getSiguiente();
                }
                return aux.getEstudiante();
            }
        }else{
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
    public void archivo(){
        if(!vacia()){
            String salida="";
            nodo temporal=inicio;
            
            int i=0;
            
            while(temporal!=null){
                
                try {
                    salida +=i+"="+temporal.getEstudiante().toString()+"\n\n";
                    
                    String nombre=JOptionPane.showInputDialog(null,"Ingresa el nombre del archivo:");
                    String nombrearchivo=nombre+".txt";
                    File archivo=new File(nombrearchivo);
                    if((new File(nombrearchivo)).exists()){
                        if(archivo.delete()){
                            JOptionPane.showMessageDialog(null,"El archivo "+nombrearchivo+" ya existe, sera reemplazado");
                        }else{
                            JOptionPane.showMessageDialog(null,"El archivo "+nombrearchivo+" se creo correctamente");
                        }
                    }
                    
                    FileWriter es = new FileWriter(archivo,true);
                    es.write(salida);
//                    System.out.println(i+" "+temporal.getEstudiante().toString());
//                    JOptionPane.showMessageDialog(null,temporal.getEstudiante().toString());
                    temporal=temporal.getSiguiente();
                    i++;
                    
                    es.close();
                } catch (IOException ex) {
                    Logger.getLogger(lista.class.getName()).log(Level.SEVERE, null, ex);
                }  
            }
            JOptionPane.showMessageDialog(null,salida);
        
        }
        
    }
   
}
