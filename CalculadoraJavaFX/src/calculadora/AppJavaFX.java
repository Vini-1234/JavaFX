package calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AppJavaFX extends Application{
	
	private double posX;
	private double posY;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		String styleCSS = getClass().getResource("/calculadora/Styles.css").toExternalForm();
		
		Display display = new Display();
		
		CalculadoraFX calculadora = new CalculadoraFX(display,new Teclado(display),new TitleBar());
		
		
		Scene calcScene = new Scene(calculadora,230,330);
		calcScene.setFill(Color.TRANSPARENT);
		calcScene.getStylesheets().add(styleCSS);
	

		calcScene.setOnMousePressed(event -> {
			posX = primaryStage.getX() - event.getScreenX();
			posY = primaryStage.getY() - event.getScreenY();
		});

		calcScene.setOnMouseDragged(e -> {
			primaryStage.setX(e.getScreenX() + posX);
			primaryStage.setY(e.getScreenY() + posY);
		});

		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.setScene(calcScene);
		primaryStage.setTitle("Calculadora");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
