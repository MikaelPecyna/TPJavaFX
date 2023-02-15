package tp4.ex3;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Platform;
 
public class BorderWithQuitLA extends BorderPane {
		
	public BorderWithQuitLA() {
		super();
		Button quit = new Button("quit");
		this.setBottom(quit);
		quit.setAlignment(Pos.BOTTOM_LEFT);
		
		quit.setOnAction( event -> {
			Platform.exit();
		});
			
	}


}
