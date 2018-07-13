
package lista_estudiante;


public class Estudiante_1 {
    private String nombre, apellidos, residencia, trabaja;
    int carnet, identificacion, tipoident;

    public Estudiante_1(){}
    
    Estudiante_1(String nombre, String apellidos, String residencia, String trabaja, int carnet, int identificacion,  int tipoident){
        setNombre(nombre);
        setApellidos(apellidos);
        setResidencia(residencia);
        setTrabaja(trabaja);
        setIdentificacion(identificacion);
        setCarnet(carnet);
        setTipoident(tipoident);
}
    public String toString() {
        return "nombre=" + getNombre() + " apellidos=" + getApellidos() + " residencia=" + getResidencia() + " trabaja=" + getTrabaja() + " carnet=" + getCarnet() + " identificacion=" + getIdentificacion() + " tipoident=" + getTipoident();
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getResidencia() {
        return residencia;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public int getCarnet() {
        return carnet;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getTipoident() {
        return tipoident;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setTipoident(int tipoident) {
        this.tipoident = tipoident;
    }

}
