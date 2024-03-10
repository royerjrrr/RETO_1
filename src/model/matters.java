package model;

public class matters {
    protected String nameMatter;
    protected double id;

    public matters() {
    }

    public matters(String nameMatter) {
        this.nameMatter = nameMatter;
    }



    public matters(double idMatter) {
        this.id = idMatter;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNameMatter() {
        return nameMatter;
    }

    public void setNameMatter(String nameMatter) {
        this.nameMatter = nameMatter;
    }

    @Override
    public String toString() {
        return "materia; " + id;
    }
}
