package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;

import javafx.event.ActionEvent;

public class Controller {

    private SimpleStringProperty ulaz;
    private Integer zbroj = 0;
    private Integer razlika = 0;
    private Integer umnzoak = 1;
    private Integer kolicnik = 1;

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
        if(ulaz.get().equals("0")) {
            ulaz.set("1");
        } else {
            ulaz.set(ulaz.get() + "1");
        }
    }

    public void dva(ActionEvent actionEvent) {
        if(ulaz.get().equals("0")) {
            ulaz.set("2");
        } else {
            ulaz.set(ulaz.get() + "2");
        }
    }

    public void tri(ActionEvent actionEvent) {
        if(ulaz.get().equals("0")) {
            ulaz.set("3");
        } else {
            ulaz.set(ulaz.get() + "3");
        }
    }

    public void cetiri(ActionEvent actionEvent) {
        if(ulaz.get().equals("0")) {
            ulaz.set("4");
        } else {
            ulaz.set(ulaz.get() + "4");
        }
    }

    public void pet(ActionEvent actionEvent) {
        if(ulaz.get().equals("0")) {
            ulaz.set("5");
        } else {
            ulaz.set(ulaz.get() + "5");
        }
    }

    public void sest(ActionEvent actionEvent) {
        if(ulaz.get().equals("0")) {
            ulaz.set("6");
        } else {
            ulaz.set(ulaz.get() + "6");
        }
    }

    public void sedam(ActionEvent actionEvent) {
        if(ulaz.get().equals("0")) {
            ulaz.set("7");
        } else {
            ulaz.set(ulaz.get() + "7");
        }
    }

    public void osam(ActionEvent actionEvent) {
        if(ulaz.get().equals("0")) {
            ulaz.set("8");
        } else {
            ulaz.set(ulaz.get() + "8");
        }
    }

    public void devet(ActionEvent actionEvent) {
        if(ulaz.get().equals("0")) {
            ulaz.set("9");
        } else {
            ulaz.set(ulaz.get() + "9");
        }
    }

    public void zarez(ActionEvent actionEvent) {
        ulaz.set(ulaz.get() + ".");
    }

    public void plus(ActionEvent actionEvent) {
        zbroj+=Integer.parseInt(ulaz.get());
    }
}
