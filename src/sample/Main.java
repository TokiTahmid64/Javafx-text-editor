package sample;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.utils.JFXHighlighter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextArea;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static javafx.fxml.FXMLLoader.load;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

       /* FXMLLoader loader1=new FXMLLoader(getClass().getResource("/sample/sample.fxml"));
        Parent lay1=loader1.load();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("/sample/meaning.fxml"));
        Parent lay2=loader1.load();*/

        Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        Scene scene=new Scene(root,1000,800);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
