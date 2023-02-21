package tp4.ex8;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {
	
	private float scrol = 0; 
	
	private boolean color = true; 
	private boolean labcolor = true; 
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
  
    	Label compteur = new Label(Float.toString(this.scrol));
        Pane root = new Pane();
        
        root.getChildren().add(compteur);
        
        root.setOnScroll(e ->{
        	if(e.isAltDown()) {
        		this.scrol += e.getDeltaY() * 10;
            	compteur.setText(Float.toString(this.scrol));
        	}
        	else {
        		this.scrol += e.getDeltaY();
            	compteur.setText(Float.toString(this.scrol));
        	}
        	
  
        	});
        
        
        
//        root.getChildren().add(lab);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}