package tp1;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class TestHBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
    	
    	Button btn1 = new Button("Un");
        Button btn2 = new Button("Deux");
        Button btn3 = new Button("Trois");
        Button btn4 = new Button("Quatre");
        Button btn5 = new Button("Cinq");
        Button btn6 = new Button("Six");
        
        
        
        
        
        
        
        HBox root = new HBox();
        
        root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
        root.setAlignment(Pos.CENTER);
        
        HBox.setMargin(btn1, new Insets(0, 50, 0, 0 ));
        HBox.setMargin(btn2, new Insets(0, 0, 20, 0));
        HBox.setMargin(btn3, new Insets(0, 0, 40, 0));
        HBox.setMargin(btn4, new Insets(0, 0, 60, 0));
        HBox.setMargin(btn5, new Insets(0, 0, 80, 0));
        HBox.setMargin(btn6, new Insets(0, 0, 0, 50 ));
        
        
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}
