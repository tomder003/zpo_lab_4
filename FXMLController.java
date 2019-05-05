package com.mycompany.lab4b;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class FXMLController implements Initializable {

    @FXML
    public TextField poleTekstowe;
    public ListView lista;

    @FXML
    private void handleButtonAction(ActionEvent event) throws InstantiationException, ClassNotFoundException, IllegalAccessException {
        try {
            String nazwaKlasy = poleTekstowe.getText();
            Class c = Class.forName("com.mycompany.lab4b." + nazwaKlasy);
            Object t = c.newInstance();
            ObservableList<String> listaInfo = FXCollections.observableArrayList();
            listaInfo.add("Metody:");
            for (Method i : c.getDeclaredMethods()) {
                //System.out.println(i.toString());
                listaInfo.add(i.toString());
            }
            listaInfo.add("Pola:");
            for (Field i : c.getDeclaredFields()) {
                //System.out.println(i.toString());
                listaInfo.add(i.toString());
            }
            lista.setItems(listaInfo);

//            String d="";
            
            Class[] o = c.getClasses();
            System.out.println("Rozmiar: "+o.length);
            for (Class cl : o) {
                System.out.println(cl.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }
}
