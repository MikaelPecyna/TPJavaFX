package tp4.ex5;

import javafx.scene.layout.GridPane;

public class MyPannel extends GridPane{
	
	private int column; 
	private int line; 
	private MyButton[][] btnList;
	
	public MyPannel(int line, int column) {
		this.line = line;
		this.column = column; 
		btnList = new MyButton[this.line][this.column];
		
		
		for (int y = 0; y< line; y++) {
			for(int x = 0; x<column; x++) {
				MyButton mb = new MyButton(x, y);
				this.add(mb, x, y);
				btnList[y][x] = mb; 
				
			}
		}
		
		
	}

	public MyButton getBtnList(int x, int y) {
		return btnList[y][x];
	}

	

}
