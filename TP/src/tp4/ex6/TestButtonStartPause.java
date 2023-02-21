package tp4.ex6;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import tp4.ex3.BorderWithQuitCLA;
 
public class TestButtonStartPause extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        
        ButtonStartPause btn1 = new ButtonStartPause(40); 
        ButtonStartPause btn2 = new ButtonStartPause(100); 
        
        
        
        
        
        BorderPane bd_root = new BorderPane();
        bd_root.setBottom(btn1);
        bd_root.setCenter(btn2);
        
        BorderWithQuitCLA root = new BorderWithQuitCLA(); 
        
        root.setCenter(bd_root);
        
//        root.getChildren().addAll(btn1);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}