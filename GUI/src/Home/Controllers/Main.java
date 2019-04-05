package Home.Controllers;

import java.awt.*;
import com.jfoenix.controls.JFXButton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;


public class Main implements Initializable {
    @FXML
    private Pane pnl_all,pnl_Account,pnl_EditAccount,pnl_ViewCF;

    @FXML
    private JFXButton  label;


    @FXML
    private void handleButtonAction(ActionEvent event){
        System.out.println("Ypu Clikkkked");
        label.setText("Hello World");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){


    }

}

