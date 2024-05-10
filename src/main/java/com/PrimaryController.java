package com;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class PrimaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton btndeportes;

    @FXML
    private MenuButton btnhombre;

    @FXML
    private ImageView btniniciar;

    @FXML
    private MenuButton btninicio;

    @FXML
    private MenuButton btnmujer;

    @FXML
    private MenuButton btnninyo;

    @FXML
    void deportes(MouseEvent event) {

    }

    @FXML
    void hombre(MouseEvent event) {

    }

    @FXML
    void iniciarsesion(MouseEvent event) {

    }

    @FXML
    void inicio(MouseEvent event) {

    }

    @FXML
    void mujer(MouseEvent event) {

    }

    @FXML
    void ninyo(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert btndeportes != null : "fx:id=\"btndeportes\" was not injected: check your FXML file 'inicio.fxml'.";
        assert btnhombre != null : "fx:id=\"btnhombre\" was not injected: check your FXML file 'inicio.fxml'.";
        assert btniniciar != null : "fx:id=\"btniniciar\" was not injected: check your FXML file 'inicio.fxml'.";
        assert btninicio != null : "fx:id=\"btninicio\" was not injected: check your FXML file 'inicio.fxml'.";
        assert btnmujer != null : "fx:id=\"btnmujer\" was not injected: check your FXML file 'inicio.fxml'.";
        assert btnninyo != null : "fx:id=\"btnninyo\" was not injected: check your FXML file 'inicio.fxml'.";

    }

}
