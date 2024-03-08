
package reto.pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class SchoolGrandingSystem extends GrandingSystem {
    private double nota;
    private String nombre, genero, materia;


;


    public SchoolGrandingSystem(String nombre,String genero, String materia, double nota ) {
        super();
        this.nombre = nombre;
        this.materia = materia;
        this.genero = genero;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getMateria() {
        return materia;
    }

    public String getGenero() {
        return genero;
    }


    public String getNombre() {
        return nombre;
    }



    @Override
    public double stack1() {
    int alamnoData = alumno.size();
    int conDesempeño = 0;
    for (SchoolGrandingSystem exam : alumno){
    if (exam.getNota() >= 6.0){
        conDesempeño++;
    }
    }
        return (double) conDesempeño/ alamnoData * 100;
    }

    @Override
    public int stack2() {
        int conRegular = 0;
        for (SchoolGrandingSystem data : alumno){
        if (data.getNota() >= 60.0 && data.getNota() <= 80){
            conRegular++;
        }
        }
        return conRegular;
    }

    @Override
    public String stack3() {
        Map<String, Double> materiaFemenino = new HashMap<>();
    for (SchoolGrandingSystem exam : alumno) {
        if (exam.getGenero().equals("f")) {
            String objectFem = exam.getMateria();
            double promedioActual = materiaFemenino.getOrDefault(objectFem, 0.0);
            materiaFemenino.put(objectFem, (promedioActual + exam.getNota())/2);
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

    @Override
    public String stack4() {
       String mejorEstudiante = "";
       double notaAltaBiologia = -1;
       for (SchoolGrandingSystem exam : alumno){
           if (exam.getMateria().equals("Biologia")){
               mejorEstudiante = exam.getNombre();
               notaAltaBiologia = exam.getNota();
           }
       }
        return mejorEstudiante;
    }
}
