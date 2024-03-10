/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class mattersDAO {
    private matters nameMatter;
    private int opc;
    
      public String choiceAttributp(double idMatter) {
        opc = (int) idMatter;

        switch (opc) {
            case 1 ->
                nameMatter = new matters("Biologia");
            case 2 ->
                nameMatter = new matters("Geografia");
                case 3 -> 
                nameMatter = new matters("Matematicas");
            default -> {
            }
        }
        return nameMatter.getNameMatter();
    }
}
