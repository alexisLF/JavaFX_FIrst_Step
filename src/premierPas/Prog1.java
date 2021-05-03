package premierPas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prog1 extends Application {
	public static void main(String[] args) {
	    Application.launch(args);
	}
	public void start(Stage fenetre) {
        Group contenu = new Group();
        Scene scene = new Scene(contenu, 300, 200);
        fenetre.setScene(scene);
        fenetre.setTitle("Une première fenêtre en javaFX");
	    fenetre.show();
	}
}
