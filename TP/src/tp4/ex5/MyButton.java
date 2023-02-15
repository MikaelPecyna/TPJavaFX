package tp4.ex5;

import javafx.scene.control.Button;

public class MyButton extends Button {
	private int line ;
	private int column;
	
	public MyButton(int line, int column) {
		super(); 
		this.column = column;
		this.line = line; 
		this.setText("(" + this.line + ";" + this.column + ")");
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
		

}
