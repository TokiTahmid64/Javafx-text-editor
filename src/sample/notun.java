package sample;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;


public class notun {

    static boolean ans;
   // JFrame f;

    public static boolean display() {


       //  Label l=new Label("hi");
       //Button Closebutton=new Button("close");
       // Closebutton.setOnAction(e->window.close());
       //Parent root = FXMLLoader.load(notun.java.getResource("/sample/new.fxml"));
       // root.getChildren().addAll(l,Closebutton);


       TextField user = new TextField("Username");
       PasswordField pass = new PasswordField();
       Button login = new Button("Login");
       Pane root = new Pane();
       user.setLayoutX(100);
       user.setLayoutY(50);
       pass.setLayoutX(100);
       pass.setLayoutY(100);
       login.setLayoutX(150);
       login.setLayoutY(150);

       root.getChildren().addAll(user, pass, login);
       Scene scene = new Scene(root, 300, 200);
       Stage window = new Stage();
       login.setOnAction(e ->
       {
           String s = user.getText();
           String p = pass.getText();
           if (s.equals("toki") && p.equals("1234")) {
               ans = true;
               window.close();

               //return true;

           }
           else
           {
               JFrame f = new JFrame();
               JOptionPane.showMessageDialog(f,"Non valid");
               ans=false;
           }
       });



       window.initModality(Modality.APPLICATION_MODAL);
       window.setScene(scene);
       window.setTitle("Please login to decrypt");
       window.showAndWait();
       return ans;

   }


}
