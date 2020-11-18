package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.event.*;

public class Calculator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane p1 = new GridPane();
        p1.setStyle("-fx-background-color: #CC2AFE;");

        GridPane p = new GridPane();
        TextField outputfield = new TextField("0");
        outputfield.setPrefWidth(380);
        outputfield.setPrefHeight(50);
        p.add(outputfield, 0, 0, 1, 1);
        p.setHgap(10);
        p.setVgap(10);

        GridPane gri = new GridPane();
        gri.setHgap(10);
        gri.setVgap(10);




        //for image 1
        javafx.scene.image.Image image1 = new javafx.scene.image.Image(getClass().getResource("one.jpg").toExternalForm());
        ImageView iv1 = new ImageView(image1);
        iv1.setFitWidth(50);
        iv1.setFitHeight(40);
        //for image 2
        javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource("two.jpg").toExternalForm());
        ImageView iv = new ImageView(image);
        iv.setFitWidth(50);
        iv.setFitHeight(40);

        //for image 3
        javafx.scene.image.Image image3 = new javafx.scene.image.Image(getClass().getResource("three.jpg").toExternalForm());
        ImageView iv3 = new ImageView(image3);
        iv3.setFitWidth(50);
        iv3.setFitHeight(40);
        //for image 4
        javafx.scene.image.Image image4 = new javafx.scene.image.Image(getClass().getResource("four.jpg").toExternalForm());
        ImageView iv4 = new ImageView(image4);
        iv4.setFitWidth(50);
        iv4.setFitHeight(40);
        //for image 5
        javafx.scene.image.Image image5 = new javafx.scene.image.Image(getClass().getResource("five.jpg").toExternalForm());
        ImageView iv5 = new ImageView(image5);
        iv5.setFitWidth(50);
        iv5.setFitHeight(40);
        //for image 6
        javafx.scene.image.Image image6 = new javafx.scene.image.Image(getClass().getResource("six.jpg").toExternalForm());
        ImageView iv6 = new ImageView(image6);
        iv6.setFitWidth(50);
        iv6.setFitHeight(40);

        //for image 7
        javafx.scene.image.Image image7 = new javafx.scene.image.Image(getClass().getResource("seven.jpg").toExternalForm());
        ImageView iv7 = new ImageView(image7);
        iv7.setFitWidth(50);
        iv7.setFitHeight(40);
        //for image 8
        javafx.scene.image.Image image8 = new javafx.scene.image.Image(getClass().getResource("eight.jpg").toExternalForm());
        ImageView iv8 = new ImageView(image8);
        iv8.setFitWidth(50);
        iv8.setFitHeight(40);
        //for image 9
        javafx.scene.image.Image image9 = new javafx.scene.image.Image(getClass().getResource("nine.jpg").toExternalForm());
        ImageView iv9 = new ImageView(image9);
        iv9.setFitWidth(50);
        iv9.setFitHeight(40);
        //for image 0
        javafx.scene.image.Image image0 = new javafx.scene.image.Image(getClass().getResource("zero.jpg").toExternalForm());
        ImageView iv0 = new ImageView(image0);
        iv0.setFitWidth(50);
        iv0.setFitHeight(40);
        //for image point
        javafx.scene.image.Image image10 = new javafx.scene.image.Image(getClass().getResource("point.jpg").toExternalForm());
        ImageView iv10 = new ImageView(image10);
        iv10.setFitWidth(50);
        iv10.setFitHeight(40);
        //for image plus
        javafx.scene.image.Image image11 = new javafx.scene.image.Image(getClass().getResource("plus.png").toExternalForm());
        ImageView iv11 = new ImageView(image11);
        iv11.setFitWidth(50);
        iv11.setFitHeight(40);
        //for image minus
        javafx.scene.image.Image image12 = new javafx.scene.image.Image(getClass().getResource("minus.jpeg").toExternalForm());
        ImageView iv12 = new ImageView(image12);
        iv12.setFitWidth(50);
        iv12.setFitHeight(40);
        //for image multiply
        javafx.scene.image.Image image13 = new javafx.scene.image.Image(getClass().getResource("multiply.jpg").toExternalForm());
        ImageView iv13 = new ImageView(image13);
        iv13.setFitWidth(50);
        iv13.setFitHeight(40);
        //for image divide
        javafx.scene.image.Image image14 = new javafx.scene.image.Image(getClass().getResource("divide.jpg").toExternalForm());
        ImageView iv14 = new ImageView(image14);
        iv14.setFitWidth(50);
        iv14.setFitHeight(40);
        //for image equals
        javafx.scene.image.Image image15 = new javafx.scene.image.Image(getClass().getResource("equals.png").toExternalForm());
        ImageView iv15 = new ImageView(image15);
        iv15.setFitWidth(50);
        iv15.setFitHeight(40);
        //for image clear
        javafx.scene.image.Image image16 = new javafx.scene.image.Image(getClass().getResource("clear.jpg").toExternalForm());
        ImageView iv16 = new ImageView(image16);
        iv16.setFitWidth(50);
        iv16.setFitHeight(40);



        //creating buttons
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
        Button b11 = new Button("+");
        Button b12 = new Button("-");
        Button b13 = new Button("*");
        Button b14 = new Button("/");
        Button b15 = new Button("=");

        //setting images to button
        b0.setGraphic(iv0);
        b1.setGraphic(iv1);
        b2.setGraphic(iv);
        b3.setGraphic(iv3);
        b4.setGraphic(iv4);
        b5.setGraphic(iv5);
        b6.setGraphic(iv6);
        b7.setGraphic(iv7);
        b8.setGraphic(iv8);
        b9.setGraphic(iv9);
        point.setGraphic(iv10);
        b11.setGraphic(iv11);
        b12.setGraphic(iv12);
        b13.setGraphic(iv13);
        b14.setGraphic(iv14);
        b15.setGraphic(iv15);
        ac.setGraphic(iv16);



        gri.add(b0, 0, 0, 1, 1);
        gri.add(b1, 1, 0, 1, 1);
        gri.add(b2, 2, 0, 1, 1);
        gri.add(b3, 3, 0, 1, 1);
        gri.add(b4, 0, 1, 1, 1);
        gri.add(b5, 1, 1, 1, 1);
        gri.add(b6, 2, 1, 1, 1);
        gri.add(b7, 3, 1, 1, 1);
        gri.add(b8, 0, 2, 1, 1);
        gri.add(b9, 1, 2, 1, 1);
        gri.add(ac, 2, 2, 1, 1);
        gri.add(point, 3, 2, 1, 1);
        gri.add(b11, 0, 3, 1, 1);
        gri.add(b12, 1, 3, 1, 1);
        gri.add(b13, 2, 3, 1, 1);
        gri.add(b14, 3, 3, 1, 1);
        gri.add(b15, 0, 4, 1, 1);


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


        p1.add(p, 0, 0, 1, 1);
        p1.add(gri, 0, 1, 1, 1);
        Scene scene = new Scene(p1);
        stage.setScene(scene);
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

