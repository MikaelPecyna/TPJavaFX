package tp5ex4;

import javafx.beans.binding.StringBinding;
import javafx.beans.property.DoubleProperty;

public class StyleStringBinding extends StringBinding {

	private DoubleProperty size ; 
	
	public StyleStringBinding(DoubleProperty size) {
		super();
		
		this.size = size; 
		this.bind(this.size);
		
	}

	@Override
	protected String computeValue() {
		// TODO Auto-generated method stub
		return "-fx-font-size: " + this.size.getValue();
	}

}
