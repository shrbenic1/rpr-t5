package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
        ulaz.set(ulaz.get() + ".");
    }

    public void plus(ActionEvent actionEvent) {
        zbroj += Double.parseDouble(ulaz.get());
        operacija = "+";
        brisi = true;
    }

    public void jednako(ActionEvent actionEvent) {
        if (operacija.equals("+")) {
            ulaz.set(String.valueOf((Double.parseDouble(ulaz.get()) + zbroj)));
            operacija = "";
        }
    }
}
