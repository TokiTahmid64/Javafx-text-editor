package sample;

import com.jfoenix.controls.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javafx.scene.text.FontPosture.*;

public class newcontroller implements Initializable {

    @FXML
    private MenuItem close;

    @FXML
    private ImageView image;

    @FXML
    private MenuItem encrypt;

    @FXML
    private MenuItem decrypt;
    @FXML
    private MenuItem initial_decrypt;

    @FXML
    private JFXTextArea A1;

    @FXML
    private Slider slider;

    @FXML
    private RadioButton cb2;
    @FXML
    private MenuItem analysis;

    @FXML
    private ToggleGroup text_serach;

    @FXML
    private RadioButton cb1;

    @FXML
    private Button meaning;


    @FXML
    private ToggleGroup radio;


    @FXML
    private JFXComboBox<String> font_combo;

    @FXML
    private JFXComboBox<String>size_combo;

    @FXML
    private JFXButton italic;

    JTextArea are;


    public int encryptstate=0;
    public int initial_decrypt_state=1;

    @FXML
    private JFXButton Regular;
    @FXML
    private HBox menubox1;
    @FXML
    private StackPane stackpane;
    @FXML
    private Button find_button;


    @FXML
    private TextField find;

    @FXML
    private TextField replace;

    @FXML
    private Button findreplace;
    private JTextComponent comp;


    ObservableList<String>list= FXCollections.observableArrayList();
    ObservableList<String>font_size_list=FXCollections.observableArrayList("8","9","10","11","12","14","16","18","20","22","24","26","28","36","48","72");

    Font a;
    String font_format="";

    Background_image bimg=new Background_image();

    double font_size=18;





    private static final double val=20;

    public newcontroller() throws IOException {
    }

    public void close (ActionEvent e)
    {
        System.exit(0);
    }
    public void open(ActionEvent e) throws IOException {
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter fileExtensions =
                new FileChooser.ExtensionFilter(
                        "Text", "*.txt", "*.docx");
       // FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)","Doc files(*docs)", "*.txt","*.docs");

        fileChooser.getExtensionFilters().add(fileExtensions);

        //Show save file dialog
        File file = fileChooser.showOpenDialog(null);
        if(file != null){
           A1.setText(readFile(file));
        }




    }


        private String readFile(File file){
            StringBuilder stringBuffer = new StringBuilder();
            BufferedReader bufferedReader = null;

            try {

                bufferedReader = new BufferedReader(new FileReader(file));

                String text;
                while ((text = bufferedReader.readLine()) != null) {
                    stringBuffer.append(text);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(newcontroller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(newcontroller.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    Logger.getLogger(newcontroller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            return stringBuffer.toString();
        }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        slider.setValue(val);



        javafx.scene.text.Font f= javafx.scene.text.Font.font("arial",font_size);
        A1.setFont(f);

        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i=0;i<fonts.length;i++)
        {
            list.add(i,fonts[i]);

        }
        font_combo.setItems(list);
        size_combo.setItems(font_size_list);

        menubox1.setStyle("-fx-background-color: palegreen");
        stackpane.setStyle("-fx-background-color: lightgoldenrodyellow");

        A1.setStyle("-fx-background-color: white");
        int position=A1.getCaretPosition();
        System.out.println(position);




    }
    public void onSliderChanged() {
        int sliderValue = (int) slider.getValue();
        font_size=sliderValue;
        System.out.println(sliderValue + " ");
        javafx.scene.text.Font f= javafx.scene.text.Font.font(font_format,font_size);
        A1.setFont(f);
      //  txtOut.setText(escritoresQuant.getValue()+" ");


    }
    public void fontchange(ActionEvent e)
    {


        font_format=font_combo.getValue();


        javafx.scene.text.Font f= javafx.scene.text.Font.font(font_format,font_size);
        A1.setFont(f);



    }
    public void font_size_change(ActionEvent e)
    {
        font_size= Double.parseDouble(size_combo.getValue());
        javafx.scene.text.Font f= javafx.scene.text.Font.font(font_format,font_size);
        A1.setFont(f);

    }

    public void regular(ActionEvent e)
    {
        javafx.scene.text.Font f= javafx.scene.text.Font.font(font_format, REGULAR, font_size);
        A1.setFont(f);
    }
    public void italic(ActionEvent e)
    {
        javafx.scene.text.Font f= javafx.scene.text.Font.font(font_format, ITALIC, font_size);
        A1.setFont(f);

    }

    public void saveaspdf(ActionEvent e) throws IOException {
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TXT files (*.text)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        //Show save file dialog
        File file = fileChooser.showSaveDialog(null);

        if(file != null){
            FileWriter fileWriter;

            fileWriter = new FileWriter(file);
            fileWriter.write(A1.getText());
            fileWriter.close();
        }
    }
    public void setbackground(ActionEvent e) throws IOException {
        int ans;
        ans=Background_image.display();
        //System.out.println(ans);
        if(ans==1)
        {
            A1.setStyle("-fx-background-color: lightgoldenrodyellow");
        }
        else if(ans==2)
        {
            A1.setStyle("-fx-background-color: white");
        }
        else if(ans==3)
        {
            A1.setStyle("-fx-background-color: darksalmon");
        }
        else if(ans==4)
        {
            A1.setStyle("-fx-background-color: lightpink");
        }

    }
    public void findandreplace(ActionEvent e)
    {


        String s1=find.getText();
        String s2=replace.getText();
        String s=A1.getText();
        if(cb1.isSelected()) {
            char ch=' ';
            s1=ch+s1+ch;
            String d = s.replaceAll(s1, s2);
            A1.setText(d);
        }
        else
        {
            String d = s.replaceAll(s1, s2);
            A1.setText(d);
        }


    }

    int from=0,to;
    String findtext="";
    public void find(ActionEvent e)
    {

        String text=A1.getText();
        String findtext2=find.getText();
        if(!findtext2.equals(findtext)) {
            from=0;
            findtext=findtext2;

        }

        int text_ln=A1.getText().length();
        int word_ln=find.getText().length();
        for(int i= from ;i<text_ln-word_ln;i++)
        {
            String sub=text.substring(i,i+word_ln);
            if(sub.equals(findtext2))
            {
                 from=i;
                 to=from+word_ln;
                 A1.selectRange(from,to);
                 from=from+word_ln;
                 break;

            }
        }

    }

    public void encrypt(ActionEvent e)
    {
        if(encryptstate==0) {
            encryptstate = 1;
            String str = A1.getText();
            char[] ch = new char[str.length()];

            // Copy character by character into array
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ')
                    ch[i] = '*';
              //  else if(str.charAt(i)=='\n')
                //    ch[i]= '^';
                ch[i] = str.charAt(i);
            }
            for (int i = 0; i < str.length(); i++) {

                ch[i] = (char) (ch[i] + 2);
            }
            String s = new String(ch);
            A1.setText(s);
        }



    }
    public void decrypt(ActionEvent e)
    {
        if(encryptstate==1){

            encryptstate=0;
        String str=A1.getText();
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            ch[i] = (char) (ch[i]-2);
            if(ch[i]=='*')
                ch[i]=' ';
          //  else if(ch[i]=='^')
            //    ch[i]='\n';
        }
        String s=new String(ch);
       // s=s.replaceAll("\n","\r\n");
        A1.setText(s);}



    }

    public void initialdecrypt(ActionEvent e) throws IOException {

        boolean ans=false;

        ans=notun.display();
        if(ans)
        {
            initial_decrypt_state=0;
            String str=A1.getText();
            char[] ch = new char[str.length()];

            // Copy character by character into array
            for (int i = 0; i < str.length(); i++) {
                ch[i] = str.charAt(i);
            }
            for (int i = 0; i < str.length(); i++) {
                ch[i] = (char) (ch[i]-2);
                if(ch[i]=='*')
                    ch[i]=' ';
            }
            String s=new String(ch);
            A1.setText(s);
        }
    }
    public void Analysis(ActionEvent e)
    {
        String t=A1.getText();
        quality q=new quality(t);
        q.count();

    }
    public void get_meaning(ActionEvent e) throws IOException {
        //test t=new test();
        //int r=t.display();
        //System.out.println(r);
        int position = A1.getCaretPosition();
        String get = A1.getText();
        char c;
        int i;
        for (i = position; ; i++) {
            c = get.charAt(i);
            if (c == ' ' || c == ',' || c == '.') {
                break;
            }

        }
        String sub = get.substring(position, i);

        char[] ch = new char[sub.length()];

        // Copy character by character into array
        for (i = 0; i < sub.length(); i++) {
            ch[i] = sub.charAt(i);
        }
        if (ch[0] >= 'a' && ch[0] <= 'z')
            ch[0] = (char) (ch[0] + 'A' - 'a');
        String s1 = new String(ch);

        String res = dictionary.dic(s1);


        // System.out.println(res);
        if (res != null) {
       /*meaning_ m=new meaning_(res,s1);
       m.show();}*/


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("meaning.fxml"));
            loader.load();
            meaning_ dis = loader.getController();
            dis.settext(res,s1);
            Parent p = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(p));
            stage.showAndWait();


        }
    }





}
