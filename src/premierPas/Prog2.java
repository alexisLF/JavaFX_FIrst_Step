package premierPas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Prog2 extends Application {
	public static void main(String[] args) {
	    Application.launch(args);
	}
	public void start(Stage fenetre) {
        Text texte = new Text(10, 40, "Hello World!");
        texte.setFont(new Font(40));
        Group contenu = new Group(texte);
        Scene scene = new Scene(contenu);
        fenetre.setScene(scene);
        fenetre.setTitle("Une fenêtre à contenu");
	    fenetre.show();
	}
}
