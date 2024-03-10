package model;

public class students {
    protected String nameStudent;
    protected double id;

    public students(double idStudent) {
        this.id = idStudent;
    }

    public students() {
    }

    public students( String nameStudent) {
        this.nameStudent = nameStudent;
    }



    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "estudiante: " +
                id;
    }
}
