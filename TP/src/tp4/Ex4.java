package tp4;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import tp4.ex3.BorderWithQuitLA;
 
public class Ex4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
    	HBox box = new HBox(); 
    	
    	Button plus5 = new Button("+5");
    	Button moins5 = new Button("-5");
    	Label lab = new Label("10"); 
    	box.getChildren().addAll(plus5, moins5, lab);
    	
    	Circle cercle = new Circle(); 
    	cercle.setRadius(10);
    	cercle.setLayoutX(200);
    	cercle.setLayoutY(200);
 
    	
    	Pane pc = new Pane();
    	pc.getChildren().add(cercle);
    	
    	
    	
    	plus5.setOnAction(e -> {
    		cercle.setRadius(cercle.getRadius() + 5 );
    	});
    	
    	moins5.setOnAction(e -> {
    		cercle.setRadius(cercle.getRadius() - 5 );
    	});
    	
    	
    	pc.setOnMouseDragged(e -> {
    		cercle.setLayoutX(e.getX());
    		cercle.setLayoutY(e.getY());
    	});
    	
    	
    	
    	
    	
    	
    	
    	
        
        BorderWithQuitLA root = new BorderWithQuitLA(); 
        root.setTop(box);
        root.setCenter(pc);
        
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}