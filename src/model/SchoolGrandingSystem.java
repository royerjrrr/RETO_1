
package model;

public  class SchoolGrandingSystem  {
    protected double note;
    protected students student;
    protected gender genus;
    protected matters matter;

    public SchoolGrandingSystem() {
    }

    public SchoolGrandingSystem(double student, double genus, double matter, double note) {
    this.matter = new matters(matter);
    this.student = new students(student);
    this.genus = new gender(genus);
    this.note = note;
    }



    public students getStudent() {
        return student;
    }

    public void setStudent(students student) {
        this.student = student;
    }

    public matters getMatter() {
        return matter;
    }

    public void setMatter(matters matter) {
        this.matter = matter;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public gender getGenus() {
        return genus;
    }

    public void setGenus(gender genus) {
        this.genus = genus;
    }


    @Override
    public String toString() {
        return "Materia " + student + " Genero " + genus + " Materia "  + matter + " Notas " + note;
    }
}

