package model;

public class gendersDAO {

    private gender name;
    private int opcion;

    public String associationame(double code) {
        
        opcion = (int) code;
        
        switch (opcion) {
            case 0 -> name = new gender("Masculino");
            case 1 -> name = new gender("Femenino");
            default -> {
            }
        }
        
        return name.getName();
    }
}
