package tp5;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.Binding;
import javafx.beans.property.DoubleProperty;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.util.converter.NumberStringConverter;

public class SliderBetter extends HBox{
	private String sLabel;
	private double min;
	private double max;
	private double value ;
	private Slider sl;
	private TextField tfValue; 

	public SliderBetter(String sLabel, double min, double max, double value ) {
		super(); 
		
		this.sLabel = sLabel; 
		this.min = min; 
		this.max = max; 
		this.value = value; 
		
		
		Label l = new Label(sLabel); 
		this.tfValue = new TextField();
		 
		this.sl = new Slider(this.min, this.max, this.value); 
		
		Bindings.bindBidirectional(this.tfValue.textProperty(), this.sl.valueProperty(), new NumberStringConverter());
		
		
		
		
		this.getChildren().addAll(l, tfValue, sl);
		
	}
	
	public DoubleProperty valueProperty(){
		return this.sl.valueProperty(); 
	}
	
	
	public String getsLabel() {
		return sLabel;
	}


	public void setsLabel(String sLabel) {
		this.sLabel = sLabel;
	}


	public double getMin() {
		return min;
	}


	public void setMin(double min) {
		this.min = min;
	}


	public double getMax() {
		return max;
	}


	public void setMax(double max) {
		this.max = max;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


}
