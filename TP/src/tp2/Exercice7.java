package tp2;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class Exercice7 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
    	// Il aurait fallu place tout les label dans une box pour avoir les bordures comme sur la figure !! 
    	Label north = new Label("NORTH");
    	Label center = new Label("CENTER");
    	Label south = new Label("SOUTH");
    	
    	
    	
    	
    	VBox west = new VBox();
    	west.setAlignment(Pos.CENTER);
    	
    	for (char l : "WEST".toCharArray()) {
    		Label lab = new Label();
    		lab.setText(Character.toString(l));
    		west.getChildren().add(lab);
    		lab.setStyle("-fx-border-color: black;");
    		
    	}
    	
    	VBox east = new VBox();
    	east.setAlignment(Pos.CENTER);
    	
    	for (char l : "EAST".toCharArray()) {
    		Label lab = new Label();
    		lab.setText(Character.toString(l));
    		east.getChildren().add(lab);
    		lab.setStyle("-fx-border-color: black;");
    		
    	}
   
        
        BorderPane root = new BorderPane();
        
        north.setStyle("-fx-border-color: black;");
        center.setStyle("-fx-border-color: black;");
        south.setStyle("-fx-border-color: black;");
        west.setStyle("-fx-border-color: black;");
        east.setStyle("-fx-border-color: black;");
        
        root.setTop(north);
        root.setCenter(center);
        root.setBottom(south);
        root.setLeft(west);
        root.setRight(east);
        
        BorderPane.setAlignment(north, Pos.CENTER);
        BorderPane.setAlignment(center, Pos.CENTER);
        BorderPane.setAlignment(south, Pos.CENTER);
        BorderPane.setAlignment(west, Pos.CENTER);
        BorderPane.setAlignment(east, Pos.CENTER);
        
        
        
        
        
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}