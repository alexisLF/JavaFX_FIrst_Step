package premierPas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Prog4_2_2 extends Application {
	public static void main(String[] args) {
	    Application.launch(args);
	}
	public void start(Stage stage) {
		Canvas canvas = new Canvas(600, 400);
		canvas.setOnMouseDragged((MouseEvent event) -> {
	        GraphicsContext gc2D = canvas.getGraphicsContext2D();
	        gc2D.strokeText(".", event.getX(), event.getY());
		});
        Group contenu = new Group(canvas);
        Scene scene = new Scene(contenu);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.setTitle("Une fenêtre avec gestion d'évènement");
        stage.setResizable(false);
        stage.show();
	}
}
