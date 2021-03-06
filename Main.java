package sample;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.*;

import java.awt.*;
import java.util.ArrayList;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gp = new GridPane();

        GridPane p = new GridPane();
        Button b11 = new Button("+");
        Button b12 = new Button("-");
        Button b13 = new Button("*");
        Button b14 = new Button("/");
        Button b15 = new Button("=");
        b11.setPrefSize(70, 10);
        b12.setPrefSize(70, 10);
        b13.setPrefSize(70, 10);
        b14.setPrefSize(70, 10);
        b15.setPrefSize(70, 10);


        p.add(b11, 0, 0, 1, 1);
        p.add(b12, 0, 1, 1, 1);
        p.add(b14, 0, 2, 1, 1);
        p.add(b15, 0, 3, 1, 1);

        p.setMinSize(400, 300);

        GridPane gri = new GridPane();
        gri.setHgap(10);
        gri.setVgap(10);
        gri.setStyle("-fx-background-color: #CC2AFE;");

        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button ac = new Button("AC");
        Button point = new Button(".");

       /* Button b11 = new Button("+");
        Button b12 = new Button("-");
        Button b13 = new Button("*");
        Button b14 = new Button("/");
        Button b15 = new Button("=");
        Button ac = new Button("AC");
        Button point = new Button(".");*/

        //gri.add(outputfield, 4, 0, 1, 1);
        gri.add(b0, 0, 0, 1, 1);
        gri.add(b1, 1, 0, 1, 1);
        gri.add(b2, 2, 0, 1, 1);
        gri.add(b3, 0, 1, 1, 1);
        gri.add(b4, 1, 1, 1, 1);
        gri.add(b5, 2, 1, 1, 1);
        gri.add(b6, 0, 2, 1, 1);
        gri.add(b7, 1, 2, 1, 1);
        gri.add(b8, 2, 2, 1, 1);
        gri.add(b9, 0, 3, 1, 1);
        gri.add(ac, 1, 3, 1, 1);
        gri.add(point, 2, 3, 1, 1);
      /*  gri.add(b11, 2, 2, 1, 1);
        gri.add(b12, 3, 2, 1, 1);
        gri.add(b13, 0, 3, 1, 1);
        gri.add(b14, 1, 3, 1, 1);
        gri.add(b15, 2, 3, 1, 1);
        gri.add(ac, 3, 3, 1, 1);
        gri.add(point, 0, 4, 1, 1);
        gri.setMinSize(400, 300);*/

        TextField outputfield = new TextField("0");
        gp.add(outputfield, 0, 0, 1, 1);
        gp.add(gri, 0, 1, 1, 1);
        gp.add(p, 1, 1, 1, 1);
        gp.setStyle("-fx-background-color: #CC2AFE;");
      /*  VBox root = new VBox();

        root.setSpacing(10);
        root.setPadding(new Insets(15, 10, 12, 15));
        root.setStyle("-fx-background-color: #CC2AFE;");
        ObservableList<Button> list = FXCollections.observableArrayList();
        root.getChildren().add(outputfield);
        root.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8, b9, b0);


        HBox hbox = new HBox();

        VBox vBox = new VBox();
        vBox.getChildren().addAll(b11, b12, b13, b14, b15, ac, point);
        hbox.getChildren().addAll(vBox, root);*/


        EventHandler<MouseEvent> mouse = new EventHandler<MouseEvent>() {
            String output = "";

            public void handle(MouseEvent event) {
                Object source = (Object) event.getSource();
                if ((Button) source == b1) {
                    output += "1";
                } else if ((Button) source == b0) {
                    output += "0";
                } else if ((Button) source == b2) {
                    output += "2";
                } else if ((Button) source == b2) {
                    output += "2";
                } else if ((Button) source == b3) {
                    output += "3";
                } else if ((Button) source == b4) {
                    output += "4";
                } else if ((Button) source == b5) {
                    output += "5";
                } else if ((Button) source == b6) {
                    output += "6";
                } else if ((Button) source == b7) {
                    output += "7";
                } else if ((Button) source == b8) {
                    output += "8";
                } else if ((Button) source == b9) {
                    output += "9";
                } else if ((Button) source == b11) {
                    output += "+";
                } else if ((Button) source == b12) {
                    output += "-";
                } else if ((Button) source == b13) {
                    output += "*";
                } else if ((Button) source == b14) {
                    output += "/";
                } else if ((Button) source == b15) {
                    String o = cal(output);
                    output = o;
                }
                else if ((Button) source == ac) {
                    output = "";
                }else if ((Button) source == point) {
                    output += ".";
                }
                outputfield.setText(output);
            }
        };
        point.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        ac.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b0.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b3.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b4.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b5.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b6.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b7.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b8.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b9.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b11.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b12.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b13.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b14.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);
        b15.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse);


       // Scene scene = new Scene(hbox);
        Scene scene = new Scene(gp);
        stage.setScene(scene);
        stage.setX(200);
        stage.setY(300);
        stage.setMinHeight(500);
        stage.setMinWidth(300);
        stage.setTitle("Calculator");
        stage.show();

    }

    public static String cal(String c){
        String res = "";
        if(c.contains("+")){
            res = sum(c);
        }
        else if(c.contains("-")){
            res = minus(c);
        }
        if(c.contains("*")){
            res = multiply(c);
        }
        if(c.contains("/")){
            res = divide(c);
        }
        return res;
    }

    public static String sum(String c) {
        int secondi = 0;
        String first = "";
        String second = "";
        for (int i = 0; i < c.length(); i++) {
            int value = c.charAt(i);
            if (value == 43) {
                break;
            }
            first += c.charAt(i);
            secondi = i;

        }
        second = c.substring((secondi+2),c.length() );
        System.out.println(first + " " + second);
        double f1 = Double.parseDouble(first);
        double f2 = Double.parseDouble(second);
        double res = f1 + f2;
        return res+"";

    }

    public static String minus(String c) {
        int secondi = 0;
        String first = "";
        String second = "";
        for (int i = 0; i < c.length(); i++) {
            int value = c.charAt(i);
            if (value == 45) {
                break;
            }
            first += c.charAt(i);
            secondi = i;

        }
        second = c.substring((secondi+2),c.length() );
        double f1 = Double.parseDouble(first);
        double f2 = Double.parseDouble(second);
        double res = f1 - f2;
        return res+"";

    }
    public static String multiply(String c) {
        int secondi = 0;
        String first = "";
        String second = "";
        for (int i = 0; i < c.length(); i++) {
            int value = c.charAt(i);
            if (value == 42) {
                break;
            }
            first += c.charAt(i);
            secondi = i;

        }
        second = c.substring((secondi+2),c.length() );
        double f1 = Double.parseDouble(first);
        double f2 = Double.parseDouble(second);
        double res = f1 * f2;
        return res+"";

    }

    public static String divide(String c) {
        int secondi = 0;
        String first = "";
        String second = "";
        for (int i = 0; i < c.length(); i++) {
            int value = c.charAt(i);
            if (value == 47) {
                break;
            }
            first += c.charAt(i);
            secondi = i;

        }
        second = c.substring((secondi+2),c.length() );
        double f1 = Double.parseDouble(first);
        double f2 = Double.parseDouble(second);
        if(f2 == 0){
            return "NaN";
        }
        double res = f1 / f2;
        return res+"";

    }



    public static void main(String[] args) {
        launch(args);


    }
}

