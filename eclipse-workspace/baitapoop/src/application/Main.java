package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Draw.fxml"))));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
