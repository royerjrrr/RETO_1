/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class studentsDAO {
    private students name;
    private int opc;
    
        public String choiceAttributp(double idStudents) {
        opc = (int) idStudents;

        switch (opc) {
            case 1 ->
                name = new students("Armando");
            case 2 ->
                name = new students("Nicolas");
            case 3 -> 
                name = new students("Daniel");
            case 4 -> 
                name = new students("Maria");
            case 5 -> 
                name = new students("Marcela");
            case 6 -> 
                name = new students("Alexandra");
            default -> {
            }
        }
        return name.getNameStudent();
    }
    
}
