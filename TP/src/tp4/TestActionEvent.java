package tp4;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
 
public class TestActionEvent extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
    	
    	class Ecouteur implements EventHandler{
    		String message;
    		public Ecouteur(String message) {
    			super();
    			this.message = message;
    		}
			@Override
			public void handle(Event e) {
				System.out.println(this.message);
				System.out.println("EventType : " + e.getEventType());
				System.out.println("Source : " + e.getSource());
				System.out.println("Target : " + e.getTarget());
				
				
			}
    		
    	}
        
    	Circle cercle = new Circle(); 
    	cercle.setRadius(50);
    	cercle.setLayoutX(150);
    	cercle.setLayoutY(100);
    	
    	Button b1 = new Button("b1");
    	Button b2 = new Button("b2");
    	b2.setLayoutX(250);
    	
    	b1.addEventHandler(ActionEvent.ACTION, new Ecouteur("Je suis le boutton"));
    	
    	
    	Label lab = new Label("Label");
    	lab.setLayoutX(140);
    	lab.setLayoutY(225);
    	
    	
    	
    	
    	
    	
        
        
        Pane root = new Pane();     
        root.getChildren().addAll(cercle, b1, b2, lab);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}