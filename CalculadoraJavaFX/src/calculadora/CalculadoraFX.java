package calculadora;


import javafx.scene.layout.*;

public class CalculadoraFX extends VBox {
	
	public CalculadoraFX(Display display,Teclado teclado,TitleBar titulo) {
		
		getChildren().add(titulo);
		getChildren().add(display);
		getChildren().add(teclado);
		
		this.getStyleClass().add("calculadora");
	}

}
