package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.input.*;



public class Animation extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        GridPane p1 = new GridPane();
        p1.setStyle("-fx-background-color: #CC2AFE;");

        GridPane p = new GridPane();
        TextField outputfield = new TextField("0");
        p.add(outputfield, 0, 0, 1, 1);
        p.setHgap(10);
        p.setVgap(10);

        Circle c = new Circle();
        c.setRadius(30);
        c.setFill(Color.CYAN);

        c.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
            c.setFill(Color.RED);
        }
        });


        GridPane gri = new GridPane();
        gri.setHgap(10);
        gri.add(c, 0, 0, 1, 1);
        p1.setStyle("-fx-background-color: #CC2AFE;");

        p1.add(p, 0, 0, 1, 1);
        p1.add(gri, 0, 1, 1, 1);
        Scene scene = new Scene(p1);
        stage.setScene(scene);
        stage.setMinHeight(300);
        stage.setMinWidth(400);
        stage.setTitle("Animation");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

