
package modelo;
import java.util.HashMap;
import java.util.Map;

public  class SchoolGrandingSystem extends GrandingSystem  {
    protected double notas;
    protected estudiante name;
    protected genero sex;
    protected materia nameMateria;

    public SchoolGrandingSystem() {
    }

    public SchoolGrandingSystem(double idEstudiante, double idGenero, double idMateria, double notas) {
    this.nameMateria = new materia(idMateria, "");
    this.name = new estudiante(idEstudiante, "");
    this.sex = new genero(idGenero, "");
    this.notas = notas;
    }



    public estudiante getName() {
        return name;
    }

    public void setName(estudiante name) {
        this.name = name;
    }

    public materia getNameMateria() {
        return nameMateria;
    }

    public void setNameMateria(materia nameMateria) {
        this.nameMateria = nameMateria;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public genero getSex() {
        return sex;
    }

    public void setSex(genero sex) {
        this.sex = sex;
    }



    public double stack1() {
        int alamnoData = alumno.size();
        int conDesempeño = 0;
        for (SchoolGrandingSystem exam : alumno) {
            if (exam.getNotas() >= 60.0) {
                conDesempeño++;
            }
        }
        return (double) conDesempeño/ alamnoData * 100;
    }




    public int stack2() {
        int conRegular = 0;
        for (SchoolGrandingSystem data : alumno){
            if (data.getNotas() >= 60.0 && data.getNotas() <= 80){
                conRegular++;
            }
        }
        return conRegular;
    }


    public String stack3() {
        Map<String, Double> materiaFemenino = new HashMap<>();
        for (SchoolGrandingSystem exam : alumno) {
            if (exam.getSex().equals("f")) {
                String objectFem = String.valueOf(exam.getSex());
                double promedioActual = materiaFemenino.getOrDefault(objectFem, 0.0);
                materiaFemenino.put(objectFem, (promedioActual + exam.getNotas())/2);
            }
        }
        String mejorMateria = "";
        double promedioAlto= -1;
        for (Map.Entry<String, Double> entry : materiaFemenino.entrySet()){
            if (entry.getValue() > promedioAlto){
                mejorMateria = entry.getKey();
                promedioAlto = entry.getValue();
            }
        }
        return mejorMateria;
    }


    public String stack4() {
        String mejorEstudiante = "";
        double notaAltaBiologia = -1;
        for (SchoolGrandingSystem exam : alumno){
            if (exam.getNameMateria().equals("Biologia")){
                mejorEstudiante = String.valueOf(exam.getName());
                notaAltaBiologia = exam.getNotas();
            }
        }
        return mejorEstudiante;
    }
    @Override
    public String toString() {
        return "Materia " + name + " Genero " + sex+ " Materia "  + nameMateria + " Notas " + notas ;
    }
}

