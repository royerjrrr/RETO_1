/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto.pkg1;

import modelo.GrandingSystem;
import modelo.SchoolGrandingSystem;

import  java.util.Locale;
import java.util.Scanner;

public class Reto1 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int cantidad = 18;
        SchoolGrandingSystem[] listaEstudiante = new SchoolGrandingSystem[cantidad];

        for (int i = 0; i < 18; i++) {
            double idEstudiante = sc.nextDouble();
            double idGenero = sc.nextDouble();
            double idMateria = sc.nextDouble();
            double nota = sc.nextDouble();
            listaEstudiante[i] = new SchoolGrandingSystem(idEstudiante, idGenero, idMateria, nota);
        }
        for (SchoolGrandingSystem d : listaEstudiante){
            System.out.println(d);
        }

        SchoolGrandingSystem metodos = new SchoolGrandingSystem();
        //Arreglar las preguntas
        //Intete pasarlo a un metodo pero parecer no sirve
        System.out.println("Primera pregunta " + String.format("%.2f", metodos.stack1() ));
        System.out.println("Segunda " + metodos.stack2());
        System.out.println("Segunda " + metodos.stack3());
        System.out.println("Segunda " + metodos.stack4());

    }
}


        /*
        List<SchoolGrandingSystem> exams = new ArrayList<>();
        exams.add(new SchoolGrandingSystem("Royer", "m", "Biologia", 90.0));
        exams.add(new SchoolGrandingSystem("oas", "f", "Matemaicas", 50.4));
        exams.add(new SchoolGrandingSystem("gema", "f", "Biologia", 40.3));
        exams.add(new SchoolGrandingSystem("juan", "f", "Biologia", 20.4));

        SchoolGrandingSystem analizar = new SchoolGrandingSystem(exams);



        System.out.println("Mejor porcentaje " + analizar.stack1() + "%");
        System.out.println("Examenes regulares " + analizar.stack2());
        System.out.println("Mejor materia femenino " + analizar.stack3());
        System.out.println("Mejor estudiante biologia " + analizar.stack4());


    }
*/
   /*
    private static HashMap<Integer, SchoolGrandingSystem> elegirEst() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Reto 1");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Salir");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuantos estudiante vas a ingresar? ");
                    int est = sc.nextInt();
                    for (int i = 0; i < est; i++) {
                        String nombre = "";
                        System.out.println("Elije el nombre del estudiante");
                        System.out.println("1. armando");
                        System.out.println("2. nicolas");
                        System.out.println("3. daniel");
                        System.out.println("4. maria");
                        System.out.println("5. marcela");
                        System.out.println("6. alexandra");
                        int opcE = sc.nextInt();
                        switch (opcE) {
                            case 1:
                                nombre = "armando";
                                alumno.setNombre(nombre);
                            case 2:
                                nombre = "nicolas";
                                alumno.setNombre(nombre);
                            case 3:
                                nombre = "daniel";
                                alumno.setNombre(nombre);
                            case 4:
                                nombre = "maria";
                                alumno.setNombre(nombre);
                            case 5:
                                nombre = "marcela";
                                alumno.setNombre(nombre);
                            case 6:
                                nombre = "alexandra";
                                alumno.setNombre(nombre);
                        }
                        System.out.println("Elije el genero: ");
                        String genero = "";
                        System.out.println("0. Masculino");
                        System.out.println("1. Femenino");
                        int opcF = sc.nextInt();
                        switch (opcF){
                            case 0:
                                genero = "m";
                                alumno.setGenero(genero);
                            case 1:
                                genero = "f";
                                alumno.setGenero(genero);
                        }
                        System.out.println("Cual es tu materia: ");
                        String materia = "";
                        System.out.println("1. biologia");
                        System.out.println("2. geografia");
                        System.out.println("3. matematicas");
                        System.out.println("4. ingles");
                        int opcM = sc.nextInt();
                        switch (opcM){
                            case 1:
                                materia = "biologia";
                                alumno.setMateria(materia);
                            case 2:
                                materia = "geografia";
                                alumno.setMateria(materia);
                            case 3:
                                materia = "matematicas";
                                alumno.setMateria(materia);
                            case 4:
                                materia = "ingles";
                                alumno.setMateria(materia);
                        }
                        System.out.println("Cual es tu nota: ");
                        float nota = sc.nextFloat();
                        alumno.setNota(nota);
                        break;
                    }
                    listaEstudiante.put(1,alumno);
                case 2:
                    imprimirHashmap();
                    break;
            }
            }
        return listaEstudiante;
    }


   private static void imprimirHashmap(){
        for (SchoolGrandingSystem alumno: listaEstudiante.values()){
            System.out.println(alumno);
        }
   }

    */


