package modelo;

public class materia {
    protected String nameMateria;
    protected double idMateria;

    public materia() {
    }



    public materia(double idMateria, String nameMateria) {
        this.nameMateria = nameMateria;
        this.idMateria = idMateria;
    }

    public double getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(double idMateria) {
        this.idMateria = idMateria;
    }

    public String getNameMateria() {
        return nameMateria;
    }

    public void setNameMateria(String nameMateria) {
        this.nameMateria = nameMateria;
    }
}
