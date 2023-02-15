package tp4.ex3;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        BorderWithQuitLA root = new BorderWithQuitLA();
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}