/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import modelo.SchoolGrandingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GrandingSystem {
    public List<SchoolGrandingSystem> alumno = new ArrayList<>();



    public GrandingSystem() {
        this.alumno = alumno;
    }

    public abstract double stack1( );
    public abstract int stack2( );
    public abstract String stack3( );
    public abstract String stack4( );
    protected void loadData(double[] data) {
        // Implementar la lógica para leer la información de entrada
    }





}
