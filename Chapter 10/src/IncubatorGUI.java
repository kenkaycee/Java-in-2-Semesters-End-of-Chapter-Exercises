import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 6. Look back at the final version of the Incubator class that you wrote in
programming Exercise 5 of Chap. 8. Now you can create a graphical user
interface for it, instead of a text menu.
 * @author kezen
 *
 */

public class IncubatorGUI extends Application{
	// create an object of incubator as an attribute 
	Incubator testIncubator = new Incubator(); // temperature set to 5
	
	
	@Override
	public void start(Stage stage) {
		
		// create and configure non-editable text area to display the output 
		TextArea incubatorTextArea = new TextArea();
		incubatorTextArea.setEditable(false);
		incubatorTextArea.setMaxWidth(1000);
		incubatorTextArea.setMaxHeight(200);
		incubatorTextArea.setFont(Font.font("Verdana", 14));
		
		// create and configure the buttons that will increase the temperature
		Button increaseButton = new Button();
		increaseButton.setText("Increase");
		
		// create and configure the button that will decrease the temperature
		Button decreaseButton = new Button();
		decreaseButton.setText("Decrease");
		
		// create and configure the button that will display the temperature
		Button displayButton = new Button();
		displayButton.setText("Display Temperature");
		
		// create and configure the help button
		Button helpButton = new Button();
		helpButton.setText("Help");
		
		// create an HBox to hold the buttons 
		HBox buttonBox = new HBox();
		buttonBox.setSpacing(10);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(increaseButton, decreaseButton, displayButton, helpButton);
		
		// write the code for the buttons 
		increaseButton.setOnAction(e -> 
		{
			boolean ok = testIncubator.increaseTemp();
			if(ok)
			{
				incubatorTextArea.setText("The current temperature of the incubator is " + testIncubator.getTemperature());
			}
			else
			{
				incubatorTextArea.setText("The current temperature of the incubator is " + testIncubator.getTemperature() +
						"\n\t\t\t\t***ALARM***");

			}
		});
		
		decreaseButton.setOnAction(e -> 
		{
			boolean ok = testIncubator.decreaseTemp();
			if(ok)
			{
				incubatorTextArea.setText("The current temperature of the incubator is " + testIncubator.getTemperature());
			}
			else
			{
				incubatorTextArea.setText("The current temperature of the incubator is " + testIncubator.getTemperature() +
						"\n\t\t\t\t***ALARM***");

			}
		});
		
		displayButton.setOnAction(e -> incubatorTextArea.setText("The current temperature of the incubator is " + testIncubator.getTemperature()));
		
		helpButton.setOnAction(e -> 
		incubatorTextArea.setText("The increase button increases the temperature by 1" + 
		
						"\nThe decrease button decreases the temperature by 1 " +
						"\nHowever, the temperature is not allowed to rise above a maximum value of 10 nor fall below a minimum value of −10. " +
						"\nIf an attempt is made to increase or decrease the temperature so it falls outside this range, an alarm is raised\""));
		
		// create and configure a VBox to hold all the components 
		VBox root = new VBox();
		root.setSpacing(30);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(buttonBox, incubatorTextArea);
		
		// create a new scene and add it to the stage 
		Scene scene = new Scene(root, 800, 500);
		stage.setScene(scene);
		stage.setTitle("Incubator");
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
