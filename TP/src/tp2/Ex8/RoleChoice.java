package tp2.Ex8;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class RoleChoice extends VBox {
	private String[] roles;
	private ToggleGroup tg = new ToggleGroup();;
	private RadioButton[] btnList;
	
	public RoleChoice(String roles[]) {
		super();
		this.roles = roles;
		this.tg = new ToggleGroup();
		this.btnList = new RadioButton[this.roles.length+1];
		
		
		
		
		
		
	}
	
	public void setRole(int i) {
		
		
		
		btnList[i] = new RadioButton(this.roles[i]);
		btnList[i].setToggleGroup(this.tg);
		this.getChildren().add(btnList[i]);
		
	}
	
	public String[] getRoles() {
		return roles;
	}
	
    
}