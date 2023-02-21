package tp4.ex6;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonStartPause extends Button {
	private boolean state = false; 

	public ButtonStartPause(int size){
		super(); 
		Image imgBtn1 = new Image(getClass().getResourceAsStream("play.png"));
        ImageView iconeBtn1 = new ImageView(imgBtn1);
        iconeBtn1.setFitHeight(size);
        iconeBtn1.setFitWidth(size);
        Image imgBtn2 = new Image(getClass().getResourceAsStream("pause.png"));
        ImageView iconeBtn2 = new ImageView(imgBtn2);
        iconeBtn2.setFitHeight(size);
        iconeBtn2.setFitWidth(size);
        
        
        this.setGraphic(iconeBtn1);
        
        
        this.setOnAction( e -> {
        	if(!this.state) {
        		state = true; 
        		this.setGraphic(iconeBtn2);
        	}else {
        		state = false; 
        		this.setGraphic(iconeBtn1);
        	}
        	
        });
        
		
	}

}
