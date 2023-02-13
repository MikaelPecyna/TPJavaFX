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
 
public class Board extends GridPane {
    private int size; 
	
	public Board(int size) {
		super();
		this.size = size; 
		this.setHgap(5);
		this.setVgap(5);
		
		
		for(int x = 0 ; x <= this.size; x++) {
			this.setCell((char) (x+65) , x+1, 0, "-fx-background-color: white;");
			for(int y = 0 ; y <= this.size; y++) {
				this.setCell( (char) (y+48) , 0, y+1, "-fx-background-color: white;");
				this.setCell(' ', x+1, y+1, "-fx-background-color: red;");
			}
		}
		
		this.resetCell(2,2);
	}
	
	public void setCell(char v, int x, int y, String numberColor) {
		Label cell = new Label(Character.toString(v));
		cell.setStyle(numberColor);
		cell.setMinWidth(20);
		cell.setMinHeight(20);
		this.add(cell, x, y);
	}
	
	public void resetCell(int x, int y) {
		// TODO
		
	}
	
	
    
}