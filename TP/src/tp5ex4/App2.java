package tp5ex4;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tp5.SliderBetter;

public class App2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
    	MyTextField size = new MyTextField("Size");
    	MyTextField color = new MyTextField("Color");
//    	X.valueProperty();
    	
    	Label lab = new Label("Le Texte");
    	
    	lab.styleProperty().bind(new StyleWithColorProperty(color.valueProperty(), size.valueProperty()));
    	
    	
    	VBox botBox = new VBox(); 
    	botBox.getChildren().addAll(size, color); 
    	
    	
    	
    	
        
 
        
    	
    	BorderPane root = new BorderPane(); 
        
    	root.setCenter(lab);
    	root.setBottom(botBox);
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }

	
}