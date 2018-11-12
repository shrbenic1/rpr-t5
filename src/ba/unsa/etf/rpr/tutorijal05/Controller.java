package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    private SimpleStringProperty ulaz;
    private double zbroj = 0;
    private double razlika = 0;
    private double umnzoak = 1;
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

    public void jedan(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("1");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("1");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "1");
        } else {
            ulaz.set(ulaz.get() + "1");
        }
    }

    public void dva(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("2");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("2");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "2");
        } else {
            ulaz.set(ulaz.get() + "2");
        }
    }

    public void tri(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("3");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("3");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "3");
        } else {
            ulaz.set(ulaz.get() + "3");
        }
    }

    public void cetiri(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("4");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("4");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "4");
        } else {
            ulaz.set(ulaz.get() + "4");
        }
    }

    public void pet (ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("5");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("5");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "5");
        } else {
            ulaz.set(ulaz.get() + "5");
        }
    }

    public void sest(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("6");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("6");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "6");
        } else {
            ulaz.set(ulaz.get() + "6");
        }
    }

    public void sedam(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("7");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("7");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "7");
        } else {
            ulaz.set(ulaz.get() + "7");
        }
    }

    public void osam(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("8");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("8");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "8");
        } else {
            ulaz.set(ulaz.get() + "8");
        }
    }

    public void devet(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("9");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("9");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "9");
        } else {
            ulaz.set(ulaz.get() + "9");
        }
    }

    public void nula(ActionEvent actionEvent) {
        if(ulaz.get().equals("0") && operacija.equals("")) {
            ulaz.set("0");
        } else if(!operacija.equals("") && brisi){
            ulaz.set("0");
            brisi=!brisi;
        } else if(!operacija.equals("")) {
            ulaz.set(ulaz.get() + "0");
        } else {
            ulaz.set(ulaz.get() + "0");
        }
    }

    public void zarez(ActionEvent actionEvent) {
        ulaz.set(ulaz.get() + ".");
    }

    public void plus(ActionEvent actionEvent) {
        zbroj+=Double.parseDouble(ulaz.get());
        operacija = "+";
        brisi = true;
    }

    public void jednako(ActionEvent actionEvent) {
        if(operacija.equals("+")) {
            ulaz.set(String.valueOf((Double.parseDouble(ulaz.get())+ zbroj)));
            operacija = "";
        }
    }
}
