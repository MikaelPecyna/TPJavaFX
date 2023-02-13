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
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
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
        
        
        btn2.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(btn2,Priority.ALWAYS);
        
        Region ressort = new Region();
        HBox.setHgrow(ressort,Priority.ALWAYS);
        
        
        
        
        
        
        HBox root = new HBox();
        
        root.getChildren().addAll(btn1, ressort, btn2, btn3);
        root.setAlignment(Pos.TOP_CENTER);
        
//        HBox.setMargin(btn1, new Insets(0, 50, 0, 0 ));
//        HBox.setMargin(btn2, new Insets(0, 0, 20, 0));
        
        
        
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}
