import java.text.NumberFormat;
import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**GUI for the Hostel Application
 * @author Kaycee Ezenta
 *@version 5th December 2023
 */

public class HostelApplication extends Application{
	// attributes 
	private int noOfRooms;
	private TenantList list;
	
	// width and height stored as constants
	private final int WIDTH = 800;
	private final int HEIGHT = 500;
	// visual components
	private Label headingLabel = new Label("Hostel Application");
	private Label roomLabel1 = new Label("Room");
	private TextField roomField1 = new TextField();
	private Label nameLabel = new Label("Name");
	private TextField nameField = new TextField();
	private Button addButton = new Button("Add Tenant");
	private Button removeButton = new Button("Remove Tenant");
	private Button displayButton = new Button("Display Tenants");
	private Button searchButton = new Button("Search Tenant");
	private Button saveAndQuitButton = new Button("Save and Quit");
	private TextArea displayArea1 = new TextArea();
	private Label roomLabel2 = new Label("Room");
	private TextField roomField2 = new TextField();
	private Label monthLabel = new Label("Month");
	private TextField monthField = new TextField();
	private Label amountLabel = new Label("Amount");
	private TextField amountField = new TextField();
	private Button makePaymentButton = new Button("Make Payment");
	private Button listPaymentButton = new Button("List Payments");
	private TextArea displayArea2 = new TextArea();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		noOfRooms = getNoOfRooms(); // call private method 
		list = new TenantList(noOfRooms);
		TenantFileHandler.readRecords(list);
		
		// create four HBoxes
		HBox roomDetails = new HBox(10);
		HBox tenantButtons = new HBox(10);
		HBox paymentDetails = new HBox(10);
		HBox paymentButtons = new HBox(10);
		// create VBox
		VBox root = new VBox(10);
		
		// add components to the HBoxes
		roomDetails.getChildren().addAll(roomLabel1,roomField1, nameLabel, nameField);
		tenantButtons.getChildren().addAll(addButton, displayButton, removeButton, searchButton, saveAndQuitButton);
		paymentDetails.getChildren().addAll(roomLabel2, roomField2, monthLabel, monthField, amountLabel, amountField);
		paymentButtons.getChildren().addAll(makePaymentButton, listPaymentButton);
		
		// add all the components to the VBox
		root.getChildren().addAll(headingLabel, roomDetails, tenantButtons, displayArea1, paymentDetails, paymentButtons, displayArea2);
		
		// set alignments for the HBoxes and VBox
		roomDetails.setAlignment(Pos.CENTER);
		tenantButtons.setAlignment(Pos.CENTER);
		paymentDetails.setAlignment(Pos.CENTER);
		paymentButtons.setAlignment(Pos.CENTER);
		root.setAlignment(Pos.CENTER);
		
		// customise the border and background of the VBox
		BorderStroke style = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2));
		root.setBorder(new Border(style));
		root.setBackground(Background.EMPTY);
		// customise the background of the buttons
		addButton.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10),Insets.EMPTY)));
		displayButton.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10),Insets.EMPTY)));
		removeButton.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10),Insets.EMPTY)));
		searchButton.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10),Insets.EMPTY)));
		saveAndQuitButton.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10),Insets.EMPTY)));
		makePaymentButton.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10),Insets.EMPTY)));
		listPaymentButton.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10),Insets.EMPTY)));
		
		// set minimum and maximum width and height of components
		roomField1.setMaxWidth(50);
		roomField2.setMaxWidth(50);
		roomDetails.setMinWidth(WIDTH);
		roomDetails.setMaxWidth(WIDTH);
		tenantButtons.setMinWidth(WIDTH);
		tenantButtons.setMaxWidth(WIDTH);
		paymentDetails.setMinWidth(WIDTH);
		paymentDetails.setMaxWidth(WIDTH);
		paymentButtons.setMinWidth(WIDTH);
		paymentButtons.setMaxWidth(WIDTH);
		displayArea1.setMaxSize(WIDTH - 80, HEIGHT/5);
		displayArea2.setMaxSize(WIDTH - 80, HEIGHT/5);
		primaryStage.setWidth(WIDTH);
		primaryStage.setHeight(HEIGHT);
		
		// Call private methods for button event handler
		addButton.setOnAction(e -> addHandler());
		displayButton.setOnAction(e -> displayHandler());
		removeButton.setOnAction(e -> removeHandler());
		searchButton.setOnAction(e -> searchHandler());
		saveAndQuitButton.setOnAction(e -> saveAndQuitHandler());
		makePaymentButton.setOnAction(e -> makePaymentHandler());
		listPaymentButton.setOnAction(e -> listPaymentHandler());
		
		// configure the scene and add it to the stage 
		Scene scene = new Scene(root, Color.LIGHTBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hostel Application");
		primaryStage.show();
		
	}	
	
	// private methods 
	
	private int getNoOfRooms() {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setHeaderText("How many rooms?");
		dialog.setTitle("Room Information Request");
		String response = dialog.showAndWait().get();
		return Integer.parseInt(response);
	}
	
	// event handler methods
	
	// to add tenant in a room
	private void addHandler() {
		String roomEntered = roomField1.getText();
		String nameEntered = nameField.getText();
		// check for errors
		if(roomEntered.length() == 0 || nameEntered.length() == 0)
		{
			displayArea1.setText("Room number and name of tenant must be entered");
		}
		else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noOfRooms)
		{
			displayArea1.setText("There are only " + noOfRooms + " rooms");
		}
		else if(list.search(Integer.parseInt(roomEntered)) != null)
		{
			displayArea1.setText("Room number " + roomEntered + " is occupied");
		}
		else // ok to add tenants
		{
			Tenant t = new Tenant(nameEntered, Integer.parseInt(roomEntered));
			list.addTenant(t);
			displayArea1.setText("New tenant in room " + roomEntered + " added successfully");
		}
	}
	
	// display all tenants in the hostel 
	private void displayHandler() {
		if(list.isEmpty()) // no room to display
		{
			displayArea1.setText("All rooms are empty");
		}
		else
		{
			displayArea1.setText("Room" + "\t" + "Name" + "\n");
			for(int i = 1; i <= list.getTotal(); i++)
			{ 
				displayArea1.appendText(list.getTenant(i).getRoom() + "\t\t" + capitalizeAll(list.getTenant(i).getName()) + "\n");
			}
		}
	}
	
	
	// remove a tenant 
	private void removeHandler() {
		String roomEntered = roomField1.getText();
		//check for errors
		if(roomEntered.length() == 0)
		{
			displayArea1.setText("Room number must be entered");
		}
		else if(Integer.parseInt(roomEntered)< 1 || Integer.parseInt(roomEntered)> noOfRooms)
		{
			displayArea1.setText("Invalid room number");
		}
		else if(list.search(Integer.parseInt(roomEntered)) == null)
		{
			displayArea1.setText("Room " + roomEntered + " is empty");
		}
		else
		{
			list.removeTenant(Integer.parseInt(roomEntered ));
			displayArea1.setText("Tenant in room " + roomEntered + " removed");
		}
	}
	
	// search a tenant 
	private void searchHandler(){
		String roomEntered = roomField1.getText();
		if(roomEntered.length() == 0)
		{
			displayArea1.setText("Room number must be entered");
		}
		else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noOfRooms)
		{
			displayArea1.setText("Invalid room number");
		}
		else if(list.search(Integer.parseInt(roomEntered)) == null)
		{
			displayArea1.setText("Room " + roomEntered + " is empty");
		}
		else 
		{
			displayArea1.setText("The tenant in room " + roomEntered + " is ");
			displayArea1.appendText(capitalizeAll(list.getTenant(Integer.parseInt(roomEntered)).getName()));
		}
	}
	
	// save 
	private void saveAndQuitHandler() {
		TenantFileHandler.saveRecords(noOfRooms, list);
		Platform.exit();
	}
	
	
	// make monthly payment 
	private void makePaymentHandler() {
		String roomEntered = roomField2.getText();
		String monthEntered = monthField.getText();
		String amountEntered = amountField.getText();
		String month = capitalizeAll(monthEntered);
		month = month.substring(0, 3);
		// check errors
		if(roomEntered.length() == 0 || month.length() == 0 || amountEntered.length() == 0)
		{
			displayArea2.setText("Room number, month and amount must be entered");
		}
		else if(Double.parseDouble(amountEntered) < 0)
		{
			displayArea2.setText("No negative amount");
		}
		else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered)> noOfRooms)
		{
			displayArea2.setText("Invalid room number");
		}
		else if(list.search(Integer.parseInt(roomEntered)) == null)
		{
			displayArea2.setText("Room " + roomEntered + " is empty");
		}
		else if(list.search(Integer.parseInt(roomEntered)) != null && 
				list.search(Integer.parseInt(roomEntered)).getPayments().search(month) !=-999) // ensure that a tenant does not pay twice for same month
		{
			displayArea2.setText("The tenant in Room " + roomEntered + " has paid for the month of " + month);
		}
		else // ok to process payments
		{
			Payment p = new Payment(month, Double.parseDouble(amountEntered));
			list.search(Integer.parseInt(roomEntered)).makePayment(p);
			displayArea2.setText("Payment recorded");
		}
	}
	
	// list all the payments for a tenant 
	private void listPaymentHandler() {
		String roomEntered = roomField2.getText();
		// check errors
		if(roomEntered.length() == 0)
		{
			displayArea2.setText("Room number must be entered");
		}
		else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noOfRooms)
		{
			displayArea2.setText("Invlaid room number");
		}
		else if(list.search(Integer.parseInt(roomEntered)) == null)
		{
			displayArea2.setText("Room " + roomEntered + " is empty");
		}
		else
		{
			Tenant t = list.search(Integer.parseInt(roomEntered));
			PaymentList p = t.getPayments();
			if(t.getPayments().getTotal() == 0)
			{
				displayArea2.setText("No payments recorded");
			}
			else
			{
				NumberFormat nf = NumberFormat.getCurrencyInstance();
				String s;
				displayArea2.setText("Month" + "\t\t" + "Amount" + "\n");
				for(int i = 1; i <= p.getTotal(); i++)
				{
					s = nf.format(p.getPayment(i).getAmount());
					displayArea2.appendText("" + p.getPayment(i).getMonth()+ "\t\t\t" + s + "\n");
				}
				displayArea2.appendText("\n" + "Total Paid so far: " + nf.format(p.calculateTotalPaid()));
				monthField.setText("");
				amountField.setText("");
			}
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
	
	public static void main(String[] args) {
		launch(args);
	}
}




















