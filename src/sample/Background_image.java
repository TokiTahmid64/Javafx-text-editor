package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.utils.JFXHighlighter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;



import javax.swing.*;
import java.io.IOException;
import java.net.Socket;

public class Background_image {

    private static int res;
   // public int res=0;

    public static int display()
    {


        JFXButton b1,b2,b3,b4;
        Label l1,l2,l3,l4;


        b1=new JFXButton("light golden");
        b2=new JFXButton("White");
        b3=new JFXButton("Dark salmon");
        b4=new JFXButton("Light pink");

        l1=new Label();
        l2=new Label();
        l3=new Label();
        l4=new Label();

      //  javafx.scene.control.Button login = new javafx.scene.control.Button("Login");
        b1.setLayoutX(100);
        b1.setLayoutY(200);
        b2.setLayoutX(400);
        b2.setLayoutY(200);
        b3.setLayoutX(100);
        b3.setLayoutY(500);
        b4.setLayoutX(400);
        b4.setLayoutY(500);

        l1.setLayoutX(70);
        l1.setLayoutY(50);
        l2.setLayoutX(350);
        l2.setLayoutY(50);
        l3.setLayoutX(70);
        l3.setLayoutY(350);
        l4.setLayoutX(370);
        l4.setLayoutY(350);

        Image image1 = new Image("sample/gold.png");
        Image image2 = new Image("sample/white.png");
        Image image3 = new Image("sample/darksalmon.png");
        Image image4 = new Image("sample/pink.jpg");

      //  Label label1 = new Label("Search");
        ImageView imageView1=new ImageView();
        imageView1.setFitHeight(150);
        imageView1.setFitWidth(150);
        imageView1.setImage(image1);
        l1.setGraphic(imageView1);

        ImageView imageView2=new ImageView();
        imageView2.setFitHeight(150);
        imageView2.setFitWidth(150);
        imageView2.setImage(image2);
        l2.setGraphic(imageView2);

        ImageView imageView3=new ImageView();
        imageView3.setFitHeight(150);
        imageView3.setFitWidth(150);
        imageView3.setImage(image3);
        l3.setGraphic(imageView3);

        ImageView imageView4=new ImageView();
        imageView4.setFitHeight(150);
        imageView4.setFitWidth(150);
        imageView4.setImage(image4);
        l4.setGraphic(imageView4);


        Pane root=new Pane();
        root.getChildren().addAll(b1,b2,b3,b4,l1,l2,l3,l4);
        Scene scene = new Scene(root, 600, 600);
        Stage window = new Stage();


        b1.setOnAction(e->
        {
            res=1;
            window.close();

        });
        b2.setOnAction(e->
        {
            res=2;
            window.close();
        });
        b3.setOnAction(e->
        {
            res=3;
            window.close();;
        });
        b4.setOnAction(e->
        {
            res=4;
            window.close();
        });

        window.initModality(Modality.APPLICATION_MODAL);
        window.setScene(scene);
        window.setTitle("Choose Background Color");
        window.showAndWait();








        return res;
    }


























}
