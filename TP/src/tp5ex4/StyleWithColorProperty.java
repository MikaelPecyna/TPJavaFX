package tp5ex4;

import javafx.beans.binding.StringBinding;
import javafx.beans.property.StringProperty;

public class StyleWithColorProperty extends StringBinding {

	private StringProperty color; 
	private StringProperty size; 
	public StyleWithColorProperty(StringProperty color , StringProperty size) {
		super(); 
		this.size = size; 
		this.color = color ; 
		this.bind(this.color);
		this.bind(this.size);
		
	}

	@Override
	protected String computeValue() {
		// TODO Auto-generated method stub
		return "-fx-font-size: " + this.size.getValue() + "; -fx-background-color: " + this.color.getValue();
	}

}
