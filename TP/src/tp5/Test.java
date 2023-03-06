package tp5;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
    	SliderBetter X = new SliderBetter("X", 0, 100, 50);
    	SliderBetter Y = new SliderBetter("Y", 0, 100, 50);
    	
    	SliderBetter XY = new SliderBetter("X*Y", 0, 10000, 50);
    	
    	
    	XY.valueProperty().bind(X.valueProperty().multiply(Y.valueProperty()).add(50));
    	
    	
        
 
        
    	
    	VBox root = new VBox(); 
        
    	root.getChildren().addAll(X, Y, XY);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }

	
}