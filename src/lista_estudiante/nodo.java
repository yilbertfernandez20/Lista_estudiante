package lista_estudiante;

public class nodo {
    private nodo siguiente;
    Estudiante_1 estudiante=new Estudiante_1();
    
    public nodo(Estudiante_1 estudiante){
        this.estudiante=estudiante;
        this.siguiente=null;
    }

    public Estudiante_1 getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante_1 estudiante) {
        this.estudiante = estudiante;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
