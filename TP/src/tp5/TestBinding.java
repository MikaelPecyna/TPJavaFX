package tp5;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestBinding extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
    	
    	
    	Button resE = new Button("Reset E");
    	Button DtoE = new Button("D -> E"); 
    	 
    	TextField A = new TextField();
    	TextField B = new TextField();
    	TextField C = new TextField();
    	TextField D = new TextField(" D chef ou futur chef");
    	TextField E = new TextField("c'est E ici");
    	
    	B.textProperty().bindBidirectional(A.textProperty());
    	C.textProperty().bindBidirectional(B.textProperty());
    	    	
    	
    	
    	DtoE.setOnAction(e -> {
    		E.textProperty().bind(D.textProperty());
    	});
        
    	resE.setOnAction( e -> {
    		E.setText("ici c'est E");
    	});
        
        VBox root = new VBox();
        root.getChildren().addAll(A, B, C, D, E, resE, DtoE); 
        primaryStage.setScene(new Scene(root, 600, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}
