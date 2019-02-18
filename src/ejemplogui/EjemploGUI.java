/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class EjemploGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        FileInputStream input =
                new FileInputStream("Icons/icon.png");
        Image imagen = new Image(input);
        Button btn = new Button("Button Number 1");
        Button btn3 = new Button("Button Number 3", new ImageView(imagen));
        Button btn4 = new Button("Button Number 4", new ImageView(imagen));
        VBox vbox = new VBox();
        TableView table = new TableView();
        table.setEditable(true);
        TableColumn firstNameCol = new TableColumn("First Name");   
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");
        table.getColumns().addAll(firstNameCol, lastNameCol,
        emailCol);
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(1);
        pane.setVgap(1);
        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        
        GridPane gridpane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(20);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(30);
        gridpane.getColumnConstraints().addAll(col1,col2,col2,col1);
        Label text = new Label("Direccion: ");
        gridpane.add(text, 0, 0, 4, 1); 
        GridPane.setHalignment(text, HPos.CENTER);
        Label direccion = new Label("Direccion");
        gridpane.add(direccion, 0, 1, 1, 1); // (Columna 0, Fila 1) and colspan1
        
        GridPane.setHalignment(direccion, HPos.RIGHT);
        TextField txtDireccion = new TextField();
        gridpane.add(txtDireccion, 1, 1, 20, 1); // (Columna 0, Fila 1)Colspan 4
        
        Label direccion2 = new Label("Direccion");
        TextField txtDireccion2 = new TextField();
        gridpane.add(direccion2, 0, 2, 1, 2); // (Columna 0, Fila 1)
        
        gridpane.add(txtDireccion2, 1, 2, 4, 2); // (Columna 0, Fila 1)
        

        
        HBox hbox = new HBox();
        hbox.getChildren().add(btn3);
        hbox.getChildren().add(btn4);
        
        vbox.getChildren().add(pane);
        vbox.getChildren().add(gridpane);
        vbox.getChildren().add(btn);
        vbox.getChildren().add(hbox);
        vbox.getChildren().add(table);
        Scene scene = new Scene(vbox, 200, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
