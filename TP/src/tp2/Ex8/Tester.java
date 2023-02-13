package tp2.Ex8;
 
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
 
public class Tester extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
    	String[] roles = new String[3];
    	
    	roles[0]="JCVD";
    	roles[1]="KEANUREEVES";
    	roles[2]="DIEU";
    	
        
        RoleChoice root = new RoleChoice(roles);
        
        root.setRole(0);
        root.setRole(1);
        root.setRole(2);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}