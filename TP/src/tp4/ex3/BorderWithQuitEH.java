package tp4.ex3;

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

public class BorderWithQuitEH implements  EventHandler{
	
	public BorderWithQuitEH() {
		super();
	}

	@Override
	public void handle(Event arg0) {
		Platform.exit();
		
	}

}
