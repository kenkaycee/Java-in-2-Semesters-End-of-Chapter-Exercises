import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*4. Below you see an application called ColourChanger which produces the
following graphic in which two buttons can be used to change the background
colour:*/

public class ColourChanger extends Application{
	@Override
	public void start(Stage stage) {
		// create and configure red and blue buttons 
		Button blueButton = new Button();
		blueButton.setText("Set background to blue");
		Button redButton = new Button();
		redButton.setText("Set background to red");
		
		// create and configure an HBox to hold the two buttons  
		HBox buttonBox = new HBox(10);
		buttonBox.setAlignment(Pos.TOP_CENTER);
		buttonBox.setPadding(new Insets(20, 0,0,0));
		buttonBox.getChildren().addAll(blueButton, redButton);
		
		// configure the buttons to display background color when clicked
		redButton.setOnAction(e-> buttonBox.setBackground(new Background(new BackgroundFill(Color.RED, null, null))));
		blueButton.setOnAction(e-> buttonBox.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null))));

		Scene scene = new Scene(buttonBox, 300, 150);
		stage.setScene(scene);
		stage.setTitle("Colour Changer");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
