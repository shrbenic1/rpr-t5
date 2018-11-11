package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleBooleanProperty;
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

}
