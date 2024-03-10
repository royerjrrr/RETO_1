/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import controller.schoolCtrl;
import model.GrandingSystem;
import vista.centralView;

public class Reto1 {
    


    public static void main(String[] args) {
  
        centralView view = new centralView();
        GrandingSystem reiw = new GrandingSystem();
        schoolCtrl ctr = new schoolCtrl(view, reiw);
        
        view.setVisible(true);
        view.setResizable(false);
    }
}


       