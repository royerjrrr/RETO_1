/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.pkg1;


public abstract class materia {

    protected  String materia;

    public materia() {
    }

    public materia(String materia) {

        this.materia = materia;
    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public abstract String porcentaje();

    public abstract void calificacion();
    public abstract void desempeño();
    public abstract void mejorEstudiante();
    
    
}
