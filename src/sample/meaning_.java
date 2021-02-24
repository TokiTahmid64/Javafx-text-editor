package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class meaning_{
   // Label l;
   @FXML
   private TextArea mt;
    @FXML
    private TextArea word;
    @FXML
    private AnchorPane meaningpane;

  /* String s,s2;
   meaning_(String t,String p)
   {
       s=t;
       s2=p;
   }*/


   // public void show() throws IOException {
       /* TextArea te=new TextArea();
        TextArea word=new TextArea();
        te.setEditable(false);
        word.setEditable(false);

        Label l=new Label("Definition Of The word you searched");

        Pane root=new Pane();

        te.setLayoutX(100);
        te.setLayoutY(150);
        word.setLayoutX(100);
        word.setLayoutY(100);
        l.setLayoutX(100);
        l.setLayoutY(20);
        javafx.scene.text.Font f= javafx.scene.text.Font.font("arial", REGULAR, 20);
        l.setFont(f);

        root.getChildren().addAll(te,l,word);
        te.setMaxSize(300,150);
        word.setMaxSize(300,20);
        word.setWrapText(true);
        word.setFont(new Font("arial",15));
        te.setWrapText(true);
        te.setFont(new Font("arial",15));


        te.setText(s);
        word.setText(s2);

        Scene scene = new Scene(root, 500, 350);
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setScene(scene);
        window.setTitle("Meaning");
        window.showAndWait();*/
        /* Parent root = FXMLLoader.load(getClass().getResource("/sample/meaning.fxml"));



        Stage primaryStage=new Stage();


        Scene scene=new Scene(root,1000,800);
        primaryStage.setTitle("Hello World");


        primaryStage.setScene(scene);
        primaryStage.show();
        mt.setText(s);*/

    //}

    public void settext(String t,String p) throws IOException {
        mt.setText(t);
        word.setText(p);

    }
}
