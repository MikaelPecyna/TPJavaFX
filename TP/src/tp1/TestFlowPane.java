package tp1;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class TestFlowPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        
        Button btn1 = new Button("Un");
        Button btn2 = new Button("Deux");
        Button btn3 = new Button("Trois");
        Button btn4 = new Button("Quatre");
        Button btn5 = new Button("Cinq");
        Button btn6 = new Button("Six");
        
        
        
        
        
        FlowPane root = new FlowPane();
        root.setOrientation(Orientation.VERTICAL);
        root.setHgap(30); // Met des bordures a chaque item 
        root.setVgap(5); // Met des bordures a chaque item 
        root.setAlignment(Pos.CENTER);
        
        root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
}