package calculadora;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class TitleBar extends HBox{

	public TitleBar() {
		
		Button close = new Button();
		
		getStyleClass().add("title");
		
		close.setOnAction(e -> System.exit(0));
		
		setOnMouseEntered(e -> close.setText("×"));
		setOnMouseExited(e -> close.setText(""));
		
		close.getStyleClass().add("tButton");
		getChildren().add(close);
	}
}
