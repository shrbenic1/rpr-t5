package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;

import javafx.event.ActionEvent;

public class Controller {

    private SimpleStringProperty ulaz;

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
}
