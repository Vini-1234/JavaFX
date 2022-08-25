package calculadora;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Display extends HBox{
	
	private Label label= new Label("0");
	
	public Display() {
		this.getChildren().add(label);
		this.getStyleClass().add("display");
		label.getStyleClass().add("letter");
		setAlignment(Pos.BOTTOM_RIGHT);
	}
	
	
	
	
	public void DecDot() {
		label.setText(label.getText() + ".");
	}
	
	public void Invert() {
	  float var = Float.parseFloat(label.getText());
	  var = -var;
	  label.setText(Float.toString(var));
	}
	
	public void ClearRight() {
		if(!label.getText().isEmpty())label.setText(label.getText().substring(0, (label.getText().length()-1)));
		
		if(label.getFont().getSize()<44) {
			Text text = new Text(label.getText());
			double size = label.getFont().getSize() ;
			size++;
			text.setFont(new Font(label.getFont().getName(), size));
			label.setStyle("-fx-font-size:" + size + "px;");			
		}
	}
	
	public String GetText() {
		return label.getText();
	}
	
	public Float GetFText() {
		return Float.parseFloat(label.getText());
	}
	
	public void AddDisplay(String texto) {
		label.setText(label.getText() + texto);
		changeFont();
	}
	
	public void CDisplay(String texto) {
		label.setText(texto);
	}

	public void Clear() {
		label.setText("0");
	}
	
	private void changeFont() {
		final int SIZE_FONT = 44;
		int size = SIZE_FONT;
		
		Text text = new Text(label.getText());
		
		if(label.getFont().getSize()>20) {
			do {
				text.setFont(new Font(label.getFont().getName(), size));
				label.setStyle("-fx-font-size:" + size + "px;");			
				size--;	
			}while(text.getBoundsInLocal().getWidth() > 200);
		}
	}

}
