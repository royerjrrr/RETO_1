/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.pkg1;

/**
 *
 * @author Royer
 */
public class estudiante extends materia{
    protected  String genero, nombre;
    protected float nota;

    public estudiante() {
    }



    public estudiante(String nombre,  String materia, String genero, float nota) {
        super(materia);
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String getMateria() {
        return materia;
    }







    @Override
    public String porcentaje() {
        if (getNota() > 0 && getNota() < 30 ){
            return "Deficiente";
        } else if (getNota() >= 30 && getNota() <= 60 ) {
            return "Insuficiente";
        } else if (getNota() >= 60 && getNota() <= 80 ) {
            return "Regular";
        } else if (getNota() >= 80 && getNota() <= 90 ) {
            return "Sobresaliente";
        } else if (getNota() >= 90 && getNota() <= 100 ) {
            return "Excelente";
        }
        return null;
    }

    @Override
    public void calificacion () {

    }

    @Override
    public void desempeño () {

    }

    @Override
    public void mejorEstudiante() {

    }

    @Override
    public String toString() {
        return nombre + "" + materia + "" + genero +"" + nota;
    }










}
