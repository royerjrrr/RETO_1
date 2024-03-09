package modelo;

public class estudiante {
    protected String nombre;
    protected double idEstudiante;

    public estudiante() {
    }

    public estudiante(double idEstudiante, String nombre ) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(double idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
}
