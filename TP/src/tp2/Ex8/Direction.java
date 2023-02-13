package tp2.Ex8;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class Direction extends GridPane {
	
	public Direction() {
		super();
		Button haut = new Button("▲");
		Button droite = new Button("→");
		Button bas = new Button("▼");
		Button gauche= new Button("←");
		
		this.setVgap(3);
		this.setHgap(3);
		
		this.add(haut, 1, 0 );
		this.add(droite, 2, 1 );
		this.add(bas, 1, 2 );
		this.add(gauche, 0, 1 );
	}
	
	
    
}