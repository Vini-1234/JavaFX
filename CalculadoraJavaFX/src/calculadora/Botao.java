package calculadora;

import javafx.scene.control.Button;

public class Botao extends Button{

	
	
	public Botao(int num, Teclado teclado, String... classesCSS) {
		
		getStyleClass().add("button");
		
		for(String classeCSS: classesCSS) {
			getStyleClass().add(classeCSS);
		}
		
		this.setText(Integer.toString(num));
		
		this.setOnMouseClicked(e -> {
			if(teclado.GetDisplay().GetText() == "0") {
				teclado.GetDisplay().Clear();
				teclado.GetDisplay().CDisplay(Integer.toString(num));
			}
			else if(teclado.GetMode()=="=") {
				teclado.GetDisplay().Clear();
				teclado.SetMode("");
				teclado.GetDisplay().CDisplay(Integer.toString(num));
			}
			else {
				teclado.GetDisplay().AddDisplay(Integer.toString(num));
			}
		});
	}

	
	public Botao(String texto, Teclado teclado, String... classesCSS) {
		
		getStyleClass().add("button");
		
		for(String classeCSS: classesCSS) {
			getStyleClass().add(classeCSS);
		}
		
		
		this.setText(texto);
		
		switch (texto) {
			case "=":
				this.setOnMouseClicked(e -> {
					float var;
						switch(teclado.GetMode()) {
							case "+":
								var = (teclado.GetAux() + teclado.GetDisplay().GetFText());
								teclado.GetDisplay().CDisplay(Float.toString(var));
								teclado.SetMode("=");
								break;
							case "-":
								var = (teclado.GetAux() - teclado.GetDisplay().GetFText());
								teclado.GetDisplay().CDisplay(Float.toString(var));
								teclado.SetMode("=");
								break;
							case "x":
								var = (teclado.GetAux() * teclado.GetDisplay().GetFText());
								teclado.GetDisplay().CDisplay(Float.toString(var));
								teclado.SetMode("=");
								break;
							case "÷":
								var = (teclado.GetAux() / teclado.GetDisplay().GetFText());
								teclado.GetDisplay().CDisplay(Float.toString(var));
								teclado.SetMode("=");
								break;
							case "%":
								var = (teclado.GetAux() % teclado.GetDisplay().GetFText());
								teclado.GetDisplay().CDisplay(Float.toString(var));
								teclado.SetMode("=");
								break;
					}
						teclado.SetAux(teclado.GetDisplay().GetFText());
				});
				break;
			case "AC":
				this.setOnMouseClicked(e -> {
					teclado.Reset();					
				});
				break;
			case "<x":
				this.setOnMouseClicked(e -> {
					teclado.GetDisplay().ClearRight();				
				});
				break;
			case ".":
				this.setOnMouseClicked(e -> {
					teclado.GetDisplay().DecDot();				
				});
				break;
			case "+/-":
				this.setOnMouseClicked(e -> {
					teclado.GetDisplay().Invert();				
				});
				break;
			default:
				this.setOnMouseClicked(e -> {
					teclado.SetMode(texto);
					teclado.SetAux(teclado.GetDisplay().GetFText());
					teclado.GetDisplay().Clear();
				});
				break;
		}
	}
}
