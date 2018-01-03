/*
FILE NAME:     Game24.java
VERSION:       1.0
DESCRIPTION:   Game24 implementation using JavaFX
CLASS:         COMP 494, Spring 2016 Semester @ SMSU
INSTRUCTOR:    Professor Shushuang Man <mans@smsu.edu>
AUTHORS:       Nikolay Ivanov (Nick) <nikolay.ivanov@smsu.edu>
                     <nnrowan@gmail.com
               Anthony Angrimson <anthony.angrimson@smsu.edu>
                     <angrinord@gmail.com>
LICENSE:       GNU General Public License v.3
               [http://www.gnu.org/licenses/gpl-3.0.en.html]
DATE:          1/25/2016

DOCUMENTATION: Ask Dr. Man @ SMSU or Wikipedia
*/

package game24;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Spinner;
import javafx.scene.control.ChoiceBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author Nikolay Ivanov & Anthony Angrimson
 */
public class Game24 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
	Label intro = new Label("Welcome to Game24!");
	intro.setWrapText(true);
	intro.setFont(Font.font("Helvetica", 20));
	intro.setPadding(new Insets(10));
	
	Label numberA = new Label("A:");
	numberA.setMinWidth(35);
	numberA.setPadding(new Insets(10));
	
	Label numberB = new Label("B:");
	numberB.setMinWidth(35);
	numberB.setPadding(new Insets(10));

	Label numberC = new Label("C:");
	numberC.setMinWidth(35);
	numberC.setPadding(new Insets(10));

	Label numberD = new Label("D:");
	numberD.setMinWidth(35);
	numberD.setPadding(new Insets(10));
	
	final ChoiceBox facech1 = new ChoiceBox(FXCollections.observableArrayList(
	    "1: Ace", "2: Two", "3: Three", "4: Four", "5: Five", "6: Six",
	    "7: Seven", "8: Eight", "9: Nine", "10: Ten", "11: Jack",
	    "12: Queen", "13: King"));
	facech1.getSelectionModel().selectFirst();
	
	final ChoiceBox facech2 = new ChoiceBox(FXCollections.observableArrayList(
	    "1: Ace", "2: Two", "3: Three", "4: Four", "5: Five", "6: Six",
	    "7: Seven", "8: Eight", "9: Nine", "10: Ten", "11: Jack",
	    "12: Queen", "13: King"));
	facech2.getSelectionModel().selectFirst();

	final ChoiceBox facech3 = new ChoiceBox(FXCollections.observableArrayList(
	    "1: Ace", "2: Two", "3: Three", "4: Four", "5: Five", "6: Six",
	    "7: Seven", "8: Eight", "9: Nine", "10: Ten", "11: Jack",
	    "12: Queen", "13: King"));
	facech3.getSelectionModel().selectFirst();

	final ChoiceBox facech4 = new ChoiceBox(FXCollections.observableArrayList(
	    "1: Ace", "2: Two", "3: Three", "4: Four", "5: Five", "6: Six",
	    "7: Seven", "8: Eight", "9: Nine", "10: Ten", "11: Jack",
	    "12: Queen", "13: King"));
	facech4.getSelectionModel().selectFirst();
	
	final ChoiceBox suitch1 = new ChoiceBox(FXCollections.observableArrayList(
	    "Hearts", "Diamonds", "Spades", "Clubs"));
	suitch1.getSelectionModel().selectFirst();

	final ChoiceBox suitch2 = new ChoiceBox(FXCollections.observableArrayList(
	    "Hearts", "Diamonds", "Spades", "Clubs"));
	suitch2.getSelectionModel().selectFirst();

	final ChoiceBox suitch3 = new ChoiceBox(FXCollections.observableArrayList(
	    "Hearts", "Diamonds", "Spades", "Clubs"));	
	suitch3.getSelectionModel().selectFirst();
	
	final ChoiceBox suitch4 = new ChoiceBox(FXCollections.observableArrayList(
	    "Hearts", "Diamonds", "Spades", "Clubs"));
	suitch4.getSelectionModel().selectFirst();
	
	ImageView image1 = new ImageView(
		new Image(getClass().getResourceAsStream("images/ace_of_hearts.png")));
	image1.setFitWidth(125);
	image1.setFitHeight(182);
	
	ImageView image2 = new ImageView(
	new Image(getClass().getResourceAsStream("images/ace_of_hearts.png")));
	image2.setFitWidth(125);
	image2.setFitHeight(182);

	ImageView image3 = new ImageView(
	new Image(getClass().getResourceAsStream("images/ace_of_hearts.png")));
	image3.setFitWidth(125);
	image3.setFitHeight(182);

	ImageView image4 = new ImageView(
	new Image(getClass().getResourceAsStream("images/ace_of_hearts.png")));
	image4.setFitWidth(125);
	image4.setFitHeight(182);
	
	Label result = 
		new Label("[Click PLAY24! button to see the result]");
	result.setFont(Font.font("Helvetica", 32));
	result.setPadding(new Insets(10));	
	
	facech1.getSelectionModel().selectedIndexProperty().addListener(
		(ObservableValue<? extends Number> ov,
			Number old_val, Number new_val) -> {
			    image1.setImage(
				    new Image(getClass().getResourceAsStream(
				    Card.card2fname(new_val.intValue()+1,
				    suitch1.getSelectionModel().getSelectedIndex()+1))));
			    result.setText("[Click PLAY24! button to see the result]");
	});
	
	suitch1.getSelectionModel().selectedIndexProperty().addListener(
		(ObservableValue<? extends Number> ov,
			Number old_val, Number new_val) -> {			    
			    image1.setImage(
				    new Image(getClass().getResourceAsStream(
				    Card.card2fname(
				    facech1.getSelectionModel().getSelectedIndex()+1,
				    new_val.intValue()+1))));
			    result.setText("[Click PLAY24! button to see the result]");
	});
	
	facech2.getSelectionModel().selectedIndexProperty().addListener(
		(ObservableValue<? extends Number> ov,
			Number old_val, Number new_val) -> {
			    image2.setImage(
				    new Image(getClass().getResourceAsStream(
				    Card.card2fname(new_val.intValue()+1,
				    suitch2.getSelectionModel().getSelectedIndex()+1))));
			    result.setText("[Click PLAY24! button to see the result]");
	});
	
	suitch2.getSelectionModel().selectedIndexProperty().addListener(
		(ObservableValue<? extends Number> ov,
			Number old_val, Number new_val) -> {			    
			    image2.setImage(
				    new Image(getClass().getResourceAsStream(
				    Card.card2fname(
				    facech2.getSelectionModel().getSelectedIndex()+1,
				    new_val.intValue()+1))));
			    result.setText("[Click PLAY24! button to see the result]");
	});

	facech3.getSelectionModel().selectedIndexProperty().addListener(
		(ObservableValue<? extends Number> ov,
			Number old_val, Number new_val) -> {
			    image3.setImage(
				    new Image(getClass().getResourceAsStream(
				    Card.card2fname(new_val.intValue()+1,
				    suitch1.getSelectionModel().getSelectedIndex()+1))));
			    result.setText("[Click PLAY24! button to see the result]");
	});
	
	suitch3.getSelectionModel().selectedIndexProperty().addListener(
		(ObservableValue<? extends Number> ov,
			Number old_val, Number new_val) -> {			    
			    image3.setImage(
				    new Image(getClass().getResourceAsStream(
				    Card.card2fname(
				    facech3.getSelectionModel().getSelectedIndex()+1,
				    new_val.intValue()+1))));
			    result.setText("[Click PLAY24! button to see the result]");
	});

	facech4.getSelectionModel().selectedIndexProperty().addListener(
		(ObservableValue<? extends Number> ov,
			Number old_val, Number new_val) -> {
			    image4.setImage(
				    new Image(getClass().getResourceAsStream(
				    Card.card2fname(new_val.intValue()+1,
				    suitch4.getSelectionModel().getSelectedIndex()+1))));
			    result.setText("[Click PLAY24! button to see the result]");
	});
	
	suitch4.getSelectionModel().selectedIndexProperty().addListener(
		(ObservableValue<? extends Number> ov,
			Number old_val, Number new_val) -> {			    
			    image4.setImage(
				    new Image(getClass().getResourceAsStream(
				    Card.card2fname(
				    facech4.getSelectionModel().getSelectedIndex()+1,
				    new_val.intValue()+1))));
			    result.setText("[Click PLAY24! button to see the result]");
	});	
	
	VBox vbcard1 = new VBox();	
	vbcard1.setPadding(new Insets(10));
	vbcard1.setAlignment(Pos.CENTER);
	vbcard1.getChildren().addAll(image1, facech1, suitch1);
	
	VBox vbcard2 = new VBox();	
	vbcard2.setPadding(new Insets(10));
	vbcard2.setAlignment(Pos.CENTER);
	vbcard2.getChildren().addAll(image2, facech2, suitch2);

	VBox vbcard3 = new VBox();	
	vbcard3.setPadding(new Insets(10));
	vbcard3.setAlignment(Pos.CENTER);
	vbcard3.getChildren().addAll(image3, facech3, suitch3);

	VBox vbcard4 = new VBox();	
	vbcard4.setPadding(new Insets(10));
	vbcard4.setAlignment(Pos.CENTER);
	vbcard4.getChildren().addAll(image4, facech4, suitch4);
	
	HBox hbox2 = new HBox();
	hbox2.setPadding(new Insets(20));
	hbox2.getChildren().addAll(vbcard1, vbcard2, vbcard3, vbcard4);
	
	Button play24 = new Button("PLAY24!");
	play24.setPadding(new Insets(10));
	
	Button quit = new Button("Quit");
	quit.setPadding(new Insets(10));
	
	play24.setOnAction(new EventHandler<ActionEvent>() {    
	    @Override
	    public void handle(ActionEvent event) {
		int value1 = facech1.getSelectionModel().getSelectedIndex()+1;
		int value2 = facech2.getSelectionModel().getSelectedIndex()+1;
		int value3 = facech3.getSelectionModel().getSelectedIndex()+1;
		int value4 = facech4.getSelectionModel().getSelectedIndex()+1;
		
		result.setText(Crunch.go(value1, value2, value3, value4));

	    }
	});
	
	quit.setOnAction(new EventHandler<ActionEvent>() {    
	    @Override
	    public void handle(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	    }
	});

	VBox vbox = new VBox();	
	vbox.setPadding(new Insets(10));
	vbox.setAlignment(Pos.CENTER);
	vbox.getChildren().addAll(intro, hbox2, play24, result, quit);
	
	Scene scene = new Scene(vbox, 640, 640);

	primaryStage.setTitle("Game24");
	primaryStage.setScene(scene);
	primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	launch(args);
    }
    
}
