package tp4.ex5;

import java.util.Scanner;


import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import tp4.ex3.BorderWithQuitLA;

public class MyButtonTest extends Scene{
	
	private MyButton bt;
	private Label lab;
	private BorderWithQuitLA bwq;
	
	public MyButtonTest(BorderWithQuitLA root , Label lab) {	
		super(root,300,300,Color.AQUA);
		
		this.lab = lab;
		
		Scanner sc = new Scanner( System.in);
		
		System.out.print(" column : ");
		int c = sc.nextInt();
		System.out.print(" line : ");
		int l = sc.nextInt();
		
 		this.bt = new MyButton(l,c);
 		
 		root.setCenter(bt);
 		
 		bt.setOnAction(e -> {
 			lab.setText("(" + bt.getLine() + "," + bt.getColumn() + ")");
 		});
 		
 		
 	
	}
	
	
}