package tp4.ex7;
 
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
	private boolean color = true; 
	private boolean labcolor = true; 
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
//         Label lab = new Label("Text de fond !"); 
//         
//        lab.setStyle("-fx-text-fill: red; -fx-background-color: orange;");
//        
//         
    	
        Pane root = new Pane();
        root.setStyle("-fx-background-color:blue;");
        
        root.setOnMousePressed(e -> {
        	if(this.color) {
        		root.setStyle("-fx-background-color:red;");
        	}else {
        		root.setStyle("-fx-background-color:blue;");
        	}
        	this.color = !this.color; 
        });
        
        Label lab = new Label("Text de fond !"); 
        
        lab.setStyle("-fx-text-fill: green; -fx-background-color: orange;");
        
        lab.setOnMousePressed(e -> {
        	if(this.labcolor) {
        		System.out.println("Lab click");
        		lab.setStyle("-fx-text-fill: orange; -fx-background-color: green;");
        	}else {
        		lab.setStyle("-fx-text-fill: green; -fx-background-color: orange;");
        	}
        	this.labcolor = !this.labcolor; 
        });
        
        
        root.getChildren().add(lab);
        
//        root.getChildren().add(lab);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}