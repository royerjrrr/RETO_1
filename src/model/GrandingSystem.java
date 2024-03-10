package model;

import java.util.ArrayList;

public class GrandingSystem {

    private double approval = 0;
    private double total = 0;
    private int regular = 0;
    private String resultSM = "";
    private String resultSS = "";
    private double bioSum = 0;
    private double geoSum = 0;
    private double matSum = 0;

    public double stack1(ArrayList<SchoolGrandingSystem> list) {
            total = list.size();
        for (SchoolGrandingSystem ob : list) {
            if (ob.getNote() >= 60.0) {
                approval++;
            }
        }

        return approval / total;
    }

    public int stack2(ArrayList<SchoolGrandingSystem> list) {
        regular = 0;
        for (SchoolGrandingSystem ob : list) {
            if (ob.getNote() >= 60.0 && ob.getNote() <= 80.0) {
                regular++;
            }
        }
        
        return regular;
    }

    public String stack3(ArrayList<SchoolGrandingSystem> list) {

        mattersDAO snk = new mattersDAO();

        double countbio = 0;
        double countgeo = 0;
        double countmat = 0;

        for (SchoolGrandingSystem student : list) {

            if (student.getMatter().getId()== 1.0) {
                bioSum += student.getNote();
                countbio++;
            } else if (student.getMatter().getId() == 2.0) {
                geoSum += student.getNote();
                countgeo++;
            } else if (student.getMatter().getId() == 3.0) {
                matSum += student.getNote();
                countmat++;
            }
        }
        double prombio = bioSum / countbio;
        double promgeo = geoSum / countgeo;
        double prommat = matSum / countmat;

        if (prombio > promgeo && prombio > prommat) {
            resultSM = snk.choiceAttributp(1.0);
        } else if (promgeo > prombio && promgeo > prommat) {
            resultSM = snk.choiceAttributp(2.0);
        } else if (prommat > prombio && prommat > promgeo) {
            resultSM = snk.choiceAttributp(3.0);
        }

        return resultSM;
    }

    public String stack4(ArrayList<SchoolGrandingSystem> list) {

        double highestNote = 0;
        studentsDAO db = new studentsDAO();

        for (SchoolGrandingSystem student : list) {
            if (student.getMatter().getId() == 1.0 && student.getNote() > highestNote) {
                highestNote = student.getNote();
                double code = student.getStudent().getId();
                resultSS = db.choiceAttributp(code);
            }
        }
        return resultSS;
    }
}
