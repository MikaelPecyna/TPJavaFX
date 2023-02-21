package tp4.ex6;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import tp4.ex3.BorderWithQuitCLA;
 
public class Q1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }	
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Button btn1 = new Button();
        Button btn2 = new Button();
        
        Image imgBtn1 = new Image(getClass().getResourceAsStream("play.png"));
        ImageView iconeBtn1 = new ImageView(imgBtn1);
        btn1.setGraphic(iconeBtn1);
        
        Image imgBtn2 = new Image(getClass().getResourceAsStream("pause.png"));
        ImageView iconeBtn2 = new ImageView(imgBtn2);
        btn2.setGraphic(iconeBtn2);
        
        FlowPane root = new FlowPane();
        
        root.setHgap(30); // Met des bordures a chaque item 
        root.setVgap(5); // Met des bordures a chaque item 
        root.setAlignment(Pos.CENTER);
        
        root.getChildren().addAll(btn1, btn2);
        
        
        BorderWithQuitCLA real_root = new BorderWithQuitCLA();
        
        real_root.setTop(root);
//        real_root.add(root);
        primaryStage.setScene(new Scene(real_root, 300, 200));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}