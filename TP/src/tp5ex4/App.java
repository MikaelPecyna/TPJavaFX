package tp5ex4;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tp5.SliderBetter;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
    	SliderBetter X = new SliderBetter("tailleFont", 0, 50, 40);
//    	X.valueProperty();
    	
    	Label lab = new Label("Le Texte");
    	
    	lab.styleProperty().bind(new StyleStringBinding(X.valueProperty()));
    	
    	
    	
    	
    	
    	
    	
        
 
        
    	
    	BorderPane root = new BorderPane(); 
        
    	root.setCenter(lab);
    	root.setBottom(X);
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }

	
}