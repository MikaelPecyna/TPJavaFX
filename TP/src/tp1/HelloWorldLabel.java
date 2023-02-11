package tp1;
 


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.control.Label;



 
public class HelloWorldLabel extends Application {	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
    	Button btn = new Button("OeuilGauche");
    	btn.setLayoutX(50);
    	btn.setLayoutY(20);
    	
    	
    	
    	Label lab = new Label("OeuilDroit");
    	lab.setLayoutX(180);
    	lab.setLayoutY(20);
    	lab.setStyle("-fx-border-witdh:10 ; -fx-border-color:black");
    	lab.setPadding(new Insets(10,20,30,50));
    	
    	Circle cercle = new Circle(); 
    	cercle.setFill(Color.RED);
    	cercle.setCenterX(100);
    	cercle.setCenterY(150);
    	cercle.setRadius(40);
    	
    	Line ligne = new Line();
    	ligne.setStartX(70);
    	ligne.setStartY(210);
    	ligne.setEndX(170);
    	ligne.setEndY(210);
    	
    	btn.setOnAction(e -> {
    		ligne.setLayoutY(ligne.getLayoutY()+5);
    	});
    	
    	
    	
    	
    	
    	
        primaryStage.setTitle("Hello World!");
        Pane root = new Pane();
        
        root.getChildren().addAll(lab, btn, cercle, ligne);
        primaryStage.setScene(new Scene(root, 300,250));
        primaryStage.show();
    }
}