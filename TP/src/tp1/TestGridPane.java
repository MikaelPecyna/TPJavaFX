package tp1;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class TestGridPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
    	GridPane root = new GridPane();
    	root.setHgap(5);
    	root.setVgap(5);
    	
    	int maxX = 6; 
    	int maxY = 4; 
    	Button[][] btnMat = new Button[maxY+1][maxX+1]; 
    	
        
    	for(int  x= 0; x<=maxX; x++ ) {
    		for (int  y= 0; y<=maxY	; y++ ) {
    			String text = "(" + x + "," + y + ")";
    			Button btn = new Button(text);
    			btnMat[y][x] = btn;
    			
    			if(x==0 && y==2) {
    				btn.setMaxHeight(Double.MAX_VALUE);
    				btn.setMaxWidth(Double.MAX_VALUE);
    				btn.setText("Grand");
    				root.add(btn, x, y, 2 , 2);
    			}else if(x==0 && y==4){
    				btn.setMaxHeight(Double.MAX_VALUE);
    				btn.setMaxWidth(Double.MAX_VALUE);
    				
    				btn.setText("petit");
    				root.add(btn, x, y, 2 , 1);
    			}else if(x>=0 && y>=2 && x<=1 && y<= 4) {
    			}
    			
    			else {
    				root.add(btn, x, y);
    			}
    		}
    	}
    	
    	
        
        
        
        primaryStage.setScene(new Scene(root, 350, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}