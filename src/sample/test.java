package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class test {

    @FXML
    private Button check;
    int res;

    public int display() throws IOException {
        Stage primaryStage=new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("/sample/new.fxml"));




        Scene scene=new Scene(root,1000,800);
        primaryStage.setTitle("Hello World");


        primaryStage.setScene(scene);
        primaryStage.show();
        return res;

    }
    public void check(ActionEvent e)
    {
        res=100;
    }


}
