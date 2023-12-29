/**
 * At the end of Chap. 8 you were asked to develop a time table application. You
later enhanced this application by making use of exceptions at the end of
Chap. 14. Now develop a JavaFX GUI for this application, with the timetable
displayed as a grid. 
 */
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TimeTableGUI extends Application{
	// attributes 
	private final int noOfDays = 5;
	private final int noOfPeriods = 7;
	private TimeTable list;
	// visual components 
	private Label nameLabel = new Label("Name");
	private TextField nameField = new TextField();
	private Button bookRoomButton = new Button("Book Room");
	private Button cancelBookButton = new Button("Cancel Booking");
	private Button button11 = new Button("1,1");
	private Button button12 = new Button("1,2");
	private Button button13 = new Button("1,3");
	private Button button14 = new Button("1,4");
	private Button button15 = new Button("1,5");
	private Button button16 = new Button("1,6");
	private Button button17 = new Button("1,7");
	private Button button21 = new Button("2,1");
	private Button button22 = new Button("2,2");
	private Button button23 = new Button("2,3");
	private Button button24 = new Button("2,4");
	private Button button25 = new Button("2,5");
	private Button button26 = new Button("2,6");
	private Button button27 = new Button("2,7");
	private Button button31 = new Button("3,1");
	private Button button32 = new Button("3,2");
	private Button button33 = new Button("3,3");
	private Button button34 = new Button("3,4");
	private Button button35 = new Button("3,5");
	private Button button36 = new Button("3,6");
	private Button button37 = new Button("3,7");
	private Button button41 = new Button("4,1");
	private Button button42 = new Button("4,2");
	private Button button43 = new Button("4,3");
	private Button button44 = new Button("4,4");
	private Button button45 = new Button("4,5");
	private Button button46 = new Button("4,6");
	private Button button47 = new Button("4,7");
	private Button button51 = new Button("5,1");
	private Button button52 = new Button("5,2");
	private Button button53 = new Button("5,3");
	private Button button54 = new Button("5,4");
	private Button button55 = new Button("5,5");
	private Button button56 = new Button("5,6");
	private Button button57 = new Button("5,7");
	private TextArea tArea11 = new TextArea();
	private TextArea tArea12 = new TextArea();
	private TextArea tArea13 = new TextArea();
	private TextArea tArea14 = new TextArea();
	private TextArea tArea15 = new TextArea();
	private TextArea tArea16 = new TextArea();
	private TextArea tArea17 = new TextArea();
	private TextArea tArea21 = new TextArea();
	private TextArea tArea22 = new TextArea();
	private TextArea tArea23 = new TextArea();
	private TextArea tArea24 = new TextArea();
	private TextArea tArea25 = new TextArea();
	private TextArea tArea26 = new TextArea();
	private TextArea tArea27 = new TextArea();
	private TextArea tArea31 = new TextArea();
	private TextArea tArea32 = new TextArea();
	private TextArea tArea33 = new TextArea();
	private TextArea tArea34 = new TextArea();
	private TextArea tArea35 = new TextArea();
	private TextArea tArea36 = new TextArea();
	private TextArea tArea37 = new TextArea();
	private TextArea tArea41 = new TextArea();
	private TextArea tArea42 = new TextArea();
	private TextArea tArea43 = new TextArea();
	private TextArea tArea44 = new TextArea();
	private TextArea tArea45 = new TextArea();
	private TextArea tArea46 = new TextArea();
	private TextArea tArea47 = new TextArea();
	private TextArea tArea51 = new TextArea();
	private TextArea tArea52 = new TextArea();
	private TextArea tArea53 = new TextArea();
	private TextArea tArea54 = new TextArea();
	private TextArea tArea55 = new TextArea();
	private TextArea tArea56 = new TextArea();
	private TextArea tArea57 = new TextArea();
	private GridPane pane = new GridPane();
	private ComboBox<String> dayBox = new ComboBox<String>();
	private ComboBox<String> periodBox = new ComboBox<String>();
	private ComboBox<String> roomBox = new ComboBox<String>();

	@Override
	public void start(Stage primaryStage) throws Exception {
		list = new TimeTable(noOfDays, noOfPeriods); // initialise the timetable list

		// set label alignment 
		nameLabel.setAlignment(Pos.CENTER);
		
		// add choices to the combo boxes
		dayBox.getItems().addAll("1", "2", "3", "4", "5");
		periodBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7");
		roomBox.getItems().addAll("COM101", "COM106", "ECO207", "ECO809", "PHY908", "PHY298", "BIO508", "BIO901", "MAT201", "MATH404");
		
		// set initial text for the combo boxes
		dayBox.setValue("Choose Day");
		periodBox.setValue("Choose Period");
		roomBox.setValue("Choose Room");
		
        // configure the ComboBox events 
		roomBox.setOnAction(e-> roomBox.getValue());
		dayBox.setOnAction(e -> dayBox.getValue());
		periodBox.setOnAction(e -> periodBox.getValue());
		
		// create and configure HBoxes to hold the components 
		HBox box1 = new HBox(10);
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().addAll(nameLabel, nameField,roomBox, dayBox, periodBox);
		HBox box2 = new HBox(10);
		box2.setAlignment(Pos.CENTER);
		box2.getChildren().addAll(bookRoomButton, cancelBookButton);
		
		// configure the pane and add buttons and text area
		pane.setPadding(new Insets(15));
		pane.setHgap(0);
		pane.setVgap(0);
		pane.add(button11, 0, 0);
		pane.add(button12, 1, 0);
		pane.add(button13, 2, 0);
		pane.add(button14, 3, 0);
		pane.add(button15, 4, 0);
		pane.add(button16, 5, 0);
		pane.add(button17, 6, 0);
		pane.add(tArea11, 0, 1);
		pane.add(tArea12, 1, 1);
		pane.add(tArea13, 2, 1);
		pane.add(tArea14, 3, 1);
		pane.add(tArea15, 4, 1);
		pane.add(tArea16, 5, 1);
		pane.add(tArea17, 6, 1);
		pane.add(button21, 0, 2);
		pane.add(button22, 1, 2);
		pane.add(button23, 2, 2);
		pane.add(button24, 3, 2);
		pane.add(button25, 4, 2);
		pane.add(button26, 5, 2);
		pane.add(button27, 6, 2);
		pane.add(tArea21, 0, 3);
		pane.add(tArea22, 1, 3);
		pane.add(tArea23, 2, 3);
		pane.add(tArea24, 3, 3);
		pane.add(tArea25, 4, 3);
		pane.add(tArea26, 5, 3);
		pane.add(tArea27, 6, 3);
		pane.add(button31, 0, 4);
		pane.add(button32, 1, 4);
		pane.add(button33, 2, 4);
		pane.add(button34, 3, 4);
		pane.add(button35, 4, 4);
		pane.add(button36, 5, 4);
		pane.add(button37, 6, 4);
		pane.add(tArea31, 0, 5);
		pane.add(tArea32, 1, 5);
		pane.add(tArea33, 2, 5);
		pane.add(tArea34, 3, 5);
		pane.add(tArea35, 4, 5);
		pane.add(tArea36, 5, 5);
		pane.add(tArea37, 6, 5);
		pane.add(button41, 0, 6);
		pane.add(button42, 1, 6);
		pane.add(button43, 2, 6);
		pane.add(button44, 3, 6);
		pane.add(button45, 4, 6);
		pane.add(button46, 5, 6);
		pane.add(button47, 6, 6);
		pane.add(tArea41, 0, 7);
		pane.add(tArea42, 1, 7);
		pane.add(tArea43, 2, 7);
		pane.add(tArea44, 3, 7);
		pane.add(tArea45, 4, 7);
		pane.add(tArea46, 5, 7);
		pane.add(tArea47, 6, 7);
		pane.add(button51, 0, 8);
		pane.add(button52, 1, 8);
		pane.add(button53, 2, 8);
		pane.add(button54, 3, 8);
		pane.add(button55, 4, 8);
		pane.add(button56, 5, 8);
		pane.add(button57, 6, 8);
		pane.add(tArea51, 0, 9);
		pane.add(tArea52, 1, 9);
		pane.add(tArea53, 2, 9);
		pane.add(tArea54, 3, 9);
		pane.add(tArea55, 4, 9);
		pane.add(tArea56, 5, 9);
		pane.add(tArea57, 6, 9);
		
		// create and configure the VBox to hold all the components 
		VBox root = new VBox(10);
		root.getChildren().addAll(box1, box2, pane);
		
		// call private methods for button event handler
		bookRoomButton.setOnAction(e -> 
		{
			bookRoomHandler();
		});
		cancelBookButton.setOnAction(e -> 
		{
			cancelBookingHandler();
			
		});		
		// create and configure the scene
		Scene scene = new Scene(root);
		scene.getStylesheets().add("TimeTable.css");
		bookRoomButton.getStyleClass().add("button1");
		cancelBookButton.getStyleClass().add("button1");
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
		
		// event handler methods 
		private void bookRoomHandler() {
			String roomEntered = roomBox.getValue();

			String nameEntered = nameField.getText();
			nameEntered = capitalizeAll(nameEntered);
			String dayEntered = dayBox.getValue();
			String periodEntered = periodBox.getValue();
			// check for errors
			if(roomEntered.length() != 0 && nameEntered.length() != 0)
			{
				Booking book = new Booking(roomEntered, nameEntered);
				boolean ok = list.makeBooking(Integer.parseInt(dayEntered), Integer.parseInt(periodEntered), book);
				if(ok)
				{
					if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)==1)
					{
						tArea11.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 2)
					{
						tArea12.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 3)
					{
						tArea13.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 4)
					{
						tArea14.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 5)
					{
						tArea15.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 6)
					{
						tArea16.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 7)
					{
						tArea17.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==1)
					{
					    tArea21.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==2)
					{
					    tArea22.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==3)
					{
					    tArea23.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==4)
					{
					    tArea24.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==5)
					{
					    tArea25.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==6)
					{
					    tArea26.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==7)
					{
					    tArea27.setText(nameEntered + "\n" + roomEntered);
					}
					else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==1)
					{
					    tArea31.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==2)
					{
					    tArea32.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==3)
					{
					    tArea33.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==4)
					{
					    tArea34.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==5)
					{
					    tArea35.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==6)
					{
					    tArea36.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==7)
					{
					    tArea37.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==1)
					{
					    tArea41.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==2)
					{
					    tArea42.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==3)
					{
					    tArea43.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==4)
					{
					    tArea44.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==5)
					{
					    tArea45.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==6)
					{
					    tArea46.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==7)
					{
					    tArea47.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==1)
					{
					    tArea51.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==2)
					{
					    tArea52.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==3)
					{
					    tArea53.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==4)
					{
					    tArea54.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==5)
					{
					    tArea55.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==6)
					{
					    tArea56.setText(nameEntered + "\n" + roomEntered);
					}
						else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==7)
					{
					    tArea57.setText(nameEntered + "\n" + roomEntered);
					}
				}
			}
			
			
		}
		
		private void cancelBookingHandler(){
		    String dayEntered = dayBox.getValue();
			String periodEntered = periodBox.getValue();
			list.cancelBooking(Integer.parseInt(dayEntered), Integer.parseInt(periodEntered));
			if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)==1)
			{
				tArea11.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 2)
			{
				tArea12.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 3)
			{
				tArea13.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 4)
			{
				tArea14.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 5)
			{
				tArea15.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 6)
			{
				tArea16.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 1 && Integer.parseInt(periodEntered)== 7)
			{
				tArea17.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==1)
			{
			    tArea21.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==2)
			{
			    tArea22.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==3)
			{
			    tArea23.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==4)
			{
			    tArea24.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==5)
			{
			    tArea25.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==6)
			{
			    tArea26.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 2 && Integer.parseInt(periodEntered) ==7)
			{
			    tArea27.setText("");
			}
			else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==1)
			{
			    tArea31.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==2)
			{
			    tArea32.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==3)
			{
			    tArea33.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==4)
			{
			    tArea34.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==5)
			{
			    tArea35.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==6)
			{
			    tArea36.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 3 && Integer.parseInt(periodEntered) ==7)
			{
			    tArea37.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==1)
			{
			    tArea41.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==2)
			{
			    tArea42.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==3)
			{
			    tArea43.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==4)
			{
			    tArea44.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==5)
			{
			    tArea45.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==6)
			{
			    tArea46.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 4 && Integer.parseInt(periodEntered) ==7)
			{
			    tArea47.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==1)
			{
			    tArea51.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==2)
			{
			    tArea52.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==3)
			{
			    tArea53.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==4)
			{
			    tArea54.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==5)
			{
			    tArea55.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==6)
			{
			    tArea56.setText("");
			}
				else if(Integer.parseInt(dayEntered) == 5 && Integer.parseInt(periodEntered) ==7)
			{
			    tArea57.setText("");
			}
		}
		
		// Capitalise first letters
		private  String capitalizeAll(String str) {
	    if (str == null || str.isEmpty()) {
	        return str;
	    }

	    return Pattern.compile("\\b(.)(.*?)\\b")
	            .matcher(str)
	            .replaceAll(match -> match.group(1).toUpperCase() + match.group(2));
	}
}
