package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.input.*;
//sphere, cylinder, box, polygon
//RotateTransition, ScaleTransition, SequentialTransition
//FadeTransition for polygon shape

public class Animation extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        GridPane p1 = new GridPane();
        p1.setStyle("-fx-background-color: #CC2AFE;");

        GridPane button = new GridPane();
        button.setHgap(10);
        button.setVgap(10);
        button.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));

        Button rotate = new Button("Rotate");
        Button scale = new Button("Scale");
        Button fade = new Button("Fade");
        Button seq = new Button("Sequential");
        button.add(rotate, 0, 0, 1, 1);
        button.add(scale, 0, 1, 1, 1);
        button.add(fade, 0, 2, 1, 1);
        button.add(seq, 0, 3, 1, 1);

        Box b = new Box();
        b.setWidth(80);
        b.setHeight(80);
        PhongMaterial ph2 = new PhongMaterial();
        ph2.setDiffuseColor(Color.ORANGE);
        b.setMaterial(ph2);

        b.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.CYAN);
                b.setMaterial(ph);
                b.setRotate(30);
            }
        });

        Cylinder c = new Cylinder();
        c.setHeight(80);
        c.setRadius(80);
        PhongMaterial ph1 = new PhongMaterial();
        ph1.setDiffuseColor(Color.ORANGE);
        c.setMaterial(ph1);

        c.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.CYAN);
                c.setMaterial(ph);
        }
        });

        GridPane p = new GridPane();
        GridPane bgrid = new GridPane();
        GridPane cgrid = new GridPane();

       // bgrid.setBorder(new Border(new BorderStroke(Color.YELLOW, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
       // cgrid.setBorder(new Border(new BorderStroke(Color.YELLOW, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));

        bgrid.add(b, 0, 0, 1, 1);
        cgrid.add(c, 0, 1, 1, 1);
        p.setHgap(10);
        p.setVgap(10);

        p.add(bgrid, 0, 0, 1, 1);
        p.add(cgrid, 1, 0, 1, 1);



        Sphere s = new Sphere();
        s.setRadius(80);
        PhongMaterial ph = new PhongMaterial();
        ph.setDiffuseColor(Color.ORANGE);
        s.setMaterial(ph);

        s.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.RED);
                s.setMaterial(ph);
            }
        });

        Polygon poly = new Polygon();
        poly.setFill(Color.CYAN);
        poly.getPoints().addAll(new Double[]{
                0.0, 0.0,
                20.0, 30.0,
                50.0, 40.0,
                20.0, 100.0,
                10.0, 60.0});

        poly.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
                poly.setFill(Color.RED);
            }
        });


        GridPane gri = new GridPane();
        gri.setHgap(10);
        gri.add(s, 0, 0, 1, 1);
        gri.add(poly, 1, 0, 1, 1);

        //adding border to p and gri
        p.setBorder(new Border(new BorderStroke(Color.YELLOW, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        gri.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));

        p1.setStyle("-fx-background-color: #CC2AFE;");
        p1.add(p, 0, 0, 1, 1);
        p1.add(gri, 0, 1, 1, 1);
        p1.add(button, 1, 0, 1, 1);
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

