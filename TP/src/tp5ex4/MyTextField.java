package tp5ex4;

import javafx.beans.property.StringProperty;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class MyTextField extends HBox {

	private TextField tf; 
	public MyTextField(String name) {
		super(); 
		
		Label lab = new Label(name);
		this.tf = new TextField(); 
		
		this.getChildren().addAll(lab, tf);
		
	}
	
	public StringProperty valueProperty() {
		return this.tf.textProperty();
	}

}
