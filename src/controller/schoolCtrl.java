package controller;
import model.SchoolGrandingSystem;
import model.GrandingSystem;
import vista.centralView;
import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class schoolCtrl {
private GrandingSystem reiw;
private centralView views;

        public schoolCtrl(centralView views, GrandingSystem reiw ) {
            this.reiw = reiw;
            this.views = views;
            this.views.btnCalcular.addActionListener(new CalculateArray());
        }



         class CalculateArray implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                String[] filas = views.txtDatos.getText().split("\\n");
                //SchoolGrandingSystem[] list = new SchoolGrandingSystem[filas.length];
                List<SchoolGrandingSystem> list = new ArrayList<>(filas.length);

                for (int i = 0; i < filas.length; i++) {
                    String[] datos = filas[i].split("\\s+"); 

                    double idStudent = Double.parseDouble(datos[0]);
                    double codegenre = Double.parseDouble(datos[1]);
                    double codematt = Double.parseDouble(datos[2]);
                    double notas = Double.parseDouble(datos[3]);
                    
                    list.add(new SchoolGrandingSystem(idStudent, codegenre, codematt, notas));
                }

                views.lblPorcentage.setText(String.format("%.2f", reiw.stack1((ArrayList<SchoolGrandingSystem>) list)));
                views.lblRegular.setText(Integer.toString(reiw.stack2((ArrayList<SchoolGrandingSystem>) list)));
                views.lblFemale.setText(reiw.stack3((ArrayList<SchoolGrandingSystem>) list));
                views.lblStudent.setText(reiw.stack4((ArrayList<SchoolGrandingSystem>) list));
    
            } catch (NumberFormatException ex) {
                   System.out.println("error");
               //views.displayErrorMessage("Por favor, ingresa un número válido para la dimensión de la lista.");
            }
        }
        
    }
}
