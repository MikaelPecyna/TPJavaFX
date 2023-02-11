package tp1;
 
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
 
public class TestBorderPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        
        Button btn1 = new Button("Haut");
        Button btn2 = new Button("Bas");
        Button btn3 = new Button("Gauche");
        Button btn4 = new Button("Droite");
        Button btn5 = new Button("Centre");
        
        
               
        
        BorderPane root = new BorderPane();
        root.setTop(btn1);
        root.setBottom(btn2);
        root.setLeft(btn3);
        root.setRight(btn4);
        root.setCenter(btn5);
        
        BorderPane.setAlignment(btn1, Pos.CENTER);
        BorderPane.setAlignment(btn3, Pos.BOTTOM_CENTER);
        BorderPane.setAlignment(btn4, Pos.TOP_CENTER);        
        BorderPane.setAlignment(btn2, Pos.CENTER_LEFT); 
        BorderPane.setAlignment(btn5, Pos.TOP_LEFT); 
        
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
}