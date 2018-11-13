package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;

import javax.swing.*;

public class Controller {

    private SimpleStringProperty ulaz;
    private double zbroj = 0;
    private double razlika = 0;
    private double umnozak = 1;
    private double kolicnik = 1;
    private String operacija = "";
    private boolean brisi = false;

    public Controller() {
        ulaz = new SimpleStringProperty("0");
    }

    public SimpleStringProperty ulazProperty() {
        return ulaz;
    }

    public String getUlaz() {
        return ulaz.get();
    }

    public void broj(ActionEvent actionEvent) {
        if (ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set(((Button)actionEvent.getSource()).getText());
        } else if (!operacija.equals("") && brisi) {
            ulaz.set(((Button)actionEvent.getSource()).getText());
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            ulaz.set(ulaz.get() + ((Button)actionEvent.getSource()).getText());
        } else {
            ulaz.set(ulaz.get() + ((Button)actionEvent.getSource()).getText());
        }
    }

    public void zarez(ActionEvent actionEvent) {
        if(ulaz.get().contains("."));
        else {
            ulaz.set(ulaz.get() + ".");
        }
    }

    public void plus(ActionEvent actionEvent) {
        zbroj += Double.parseDouble(ulaz.get());
        operacija = "+";
        brisi = true;
    }

    public void minus(ActionEvent actionEvent) {
        razlika += Double.parseDouble(ulaz.get());
        operacija = "-";
        brisi = true;
    }

    public void puta(ActionEvent actionEvent) {
        umnozak *= Double.parseDouble(ulaz.get());
        operacija = "*";
        brisi = true;
    }

    public void dijeljenje(ActionEvent actionEvent) {
        kolicnik = Double.parseDouble(ulaz.get()) / kolicnik;
        operacija = "/";
        brisi = true;
    }

    public void posto(ActionEvent actionEvent) {
        operacija="%";
        brisi = true;
    }

    public void jednako(ActionEvent actionEvent) {
        if (operacija.equals("+")) {
            ulaz.set(String.valueOf((Double.parseDouble(ulaz.get()) + zbroj)));
            operacija = "";
            zbroj = 0;
        }
        else if (operacija.equals("-")) {
            if(razlika - Double.parseDouble(ulaz.get()) - (int) (razlika - Double.parseDouble(ulaz.get())) == 0)
            ulaz.set(String.valueOf((razlika - Integer.parseInt(ulaz.get()))));
            else ulaz.set(String.valueOf((razlika - Double.parseDouble(ulaz.get()))));
            operacija = "";
            razlika = 0;
        }
        else if (operacija.equals("*")) {
            ulaz.set(String.valueOf((Double.parseDouble(ulaz.get()) * umnozak)));
            operacija = "";
            umnozak = 1;
        }
        else if (operacija.equals("/")) {
            ulaz.set(String.valueOf((kolicnik / Double.parseDouble(ulaz.get()))));
            operacija = "";
            kolicnik = 1;
        }
        else if (operacija.equals("%")) {
            ulaz.set(String.valueOf(Double.parseDouble(ulaz.get()) * 0.01));
            operacija = "";
        }

    }
}
