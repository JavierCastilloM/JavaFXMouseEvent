/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxmouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author JavierCastilloM
 */
public class JavaFXMouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        

        
        
        BorderPane borderPane = new BorderPane();
        
        
        
        Scene scene = new Scene(borderPane, 300, 200);
        
        
        Text text = new Text(scene.getWidth()/4, scene.getHeight()/2,"Programming is fun");
        
        borderPane.getChildren().add(text);
        text.setOnMouseDragged(event -> {
            text.setX(event.getX());
            text.setY(event.getY());
        });
        
        
        
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
