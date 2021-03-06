package views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.PlayerChar;

public class DragonPopups {

	public static void attackMessage(PlayerChar pChar) {
		Stage prompt = new Stage();
		prompt.setTitle("You're being attack!");
		prompt.initModality(Modality.APPLICATION_MODAL);
		
		Text label = new Text();
		label.setText("You were attack by Drago and couldn't escape!");
		Button button = new Button("Darn");
		button.setOnAction(e -> prompt.close());
		
		VBox layout = new VBox();
		layout.getChildren().addAll(label, button);
		Scene scene = new Scene(layout, 300, 100);
		prompt.setScene(scene);
		prompt.show();
	}
}
