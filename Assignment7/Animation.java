

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

        //creating menubar for adding menus
        MenuBar menubar = new MenuBar();

        //creating menus for transition
        Menu rotatemenu = new Menu("Rotate");
        Menu scalemenu = new Menu("Scale");
        Menu seqmenu = new Menu("Sequential");
        Menu fademenu = new Menu("Fade");
        //attaching menus to menubar
        menubar.getMenus().add(rotatemenu);
        menubar.getMenus().add(scalemenu);
        menubar.getMenus().add(seqmenu);
        menubar.getMenus().add(fademenu);

        //creating submenus for rotatemenu
        MenuItem boxrotate = new MenuItem("Rotate box");
        MenuItem sphereRotate = new MenuItem("Rotate sphere");
        MenuItem cylinderRotate = new MenuItem("Rotate cylinder");
        MenuItem polygonRotate = new MenuItem("Rotate polygon");


        //attaching submenus to the rotatemenu
        rotatemenu.getItems().add(boxrotate);
        rotatemenu.getItems().add(sphereRotate);
        rotatemenu.getItems().add(cylinderRotate);
        rotatemenu.getItems().add(polygonRotate);


        //creating submenus for scalemenu
        MenuItem boxScale = new MenuItem("Scale box");
        MenuItem sphereScale = new MenuItem("Scale sphere");
        MenuItem cylinderScale = new MenuItem("Scale cylinder");
        MenuItem polygonScale = new MenuItem("Scale polygon");
        //attaching submenus to the Scalemenu
        scalemenu.getItems().add(boxScale);
        scalemenu.getItems().add(sphereScale);
        scalemenu.getItems().add(cylinderScale);
        scalemenu.getItems().add(polygonScale);

        //creating submenus for seqmenu
        MenuItem boxSeq = new MenuItem("Sequential transition for box");
        MenuItem sphereSeq = new MenuItem("Sequential transition for sphere");
        MenuItem cylinderSeq = new MenuItem("Sequential transition for cylinder");
        MenuItem polygonSeq = new MenuItem("Sequential transition for polygon");
        //attaching submenus to the Seqmenu
        seqmenu.getItems().add(boxSeq);
        seqmenu.getItems().add(sphereSeq);
        seqmenu.getItems().add(cylinderSeq);
        seqmenu.getItems().add(polygonSeq);

        //creating submenus for fademenu
        MenuItem polyfade= new MenuItem("Fade transition for polygon");
        //attaching submenus to the fademenu
        fademenu.getItems().add(polyfade);

        
        GridPane button = new GridPane();
        button.setHgap(10);
        button.setVgap(10);
        button.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));


        //attaching menubar to button grid
        button.add(menubar, 0, 0, 1, 1);


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
               // b.setRotate(30);
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


        //adding event handlers for rotating shapes
        boxrotate.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.CYAN);
                b.setMaterial(ph);
                b.setRotate(50);
            }
        });

        //adding event handlers for rotating shapes
        sphereRotate.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.CYAN);
                s.setMaterial(ph);
                s.setRotate(50);
            }
        });

        //adding event handlers for rotating shapes
        polygonRotate.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                poly.setRotate(50);
            }
        });

        //adding event handlers for rotating shapes
        cylinderRotate.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.CYAN);
                c.setMaterial(ph);
                c.setRotate(50);
            }
        });


        //adding event handlers for scaling shapes
        boxScale.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.CYAN);
                b.setMaterial(ph);
                b.setScaleX(2);
                b.setScaleY(2);
                b.setScaleZ(2);
            }
        });

        //adding event handlers for scaling shapes
        sphereScale.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.RED);
                s.setMaterial(ph);
                s.setScaleX(2);
                s.setScaleY(2);
                s.setScaleZ(2);
            }
        });

        //adding event handlers for scaling shapes
        polygonScale.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                poly.setFill(Color.DEEPPINK);
                poly.setScaleX(2);
                poly.setScaleY(2);
                poly.setScaleZ(2);
            }
        });

        //adding event handlers for scaling shapes
        cylinderScale.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.YELLOWGREEN);
                c.setMaterial(ph);
                c.setScaleX(2);
                c.setScaleY(2);
                c.setScaleZ(2);
            }
        });

        //adding event handlers for sequential transition for shapes
        cylinderSeq.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                PhongMaterial ph = new PhongMaterial();
                ph.setDiffuseColor(Color.YELLOWGREEN);
                c.setMaterial(ph);
                
            }
        });





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
