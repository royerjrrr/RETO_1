package modelo;

public class genero {
    protected String tipoGenero;
    protected double idGenero;


    public genero(double idGenero, String tipoGenero) {
        this.idGenero = idGenero;
        this.tipoGenero = tipoGenero;
    }

    public genero(double idGenero) {
        this.idGenero = idGenero;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public double getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(double idGenero) {
        this.idGenero = idGenero;
    }
}
