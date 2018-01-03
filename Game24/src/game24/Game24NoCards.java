/*
FILE NAME:     Game24.java
VERSION:       1.0
DESCRIPTION:   Game24 implementation using JavaFX
CLASS:         COMP 306, Spring 2016 Semester @ SMSU
INSTRUCTOR:    Professor Shushuang Man <mans@smsu.edu>
AUTHOR:        Nikolay Ivanov (Nick) <nikolay.ivanov@smsu.edu>
                     <nnrowan@gmail.com
               Anthony Angrimson <anthony.angrimson@smsu.edu>
                     <angrinord@gmail.com>
LICENSE:       GNU General Public License v.3
               [http://www.gnu.org/licenses/gpl-3.0.en.html]
DATE:          1/22/2016

DOCUMENTATION: Ask Dr. Man @ SMSU or Wikipedia
*/

package game24;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Spinner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.Font;

/**
 *
 * @author Nick Ivanov
 */
public class Game24NoCards extends Application {
    
    @Override
    public void start(Stage primaryStage) {
	Label intro = new Label("Welcome to Game24! Pick four integer "
		+ "numbers (1..13), and click Play24! button. The program "
		+ "gives you an arithmetic expression that makes 24 out of "
		+ "the four numbers your entered. The operations allowed are "
		+ "addition, subtraction, integer division, multiplication, "
		+ "and paretheses. It's fun!");
	intro.setWrapText(true);
	intro.setFont(Font.font("Helvetica", 20));
	intro.setPadding(new Insets(15));
	
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

	Spinner spinnerA = new Spinner(1, 13, 1);
	Spinner spinnerB = new Spinner(1, 13, 1);
	Spinner spinnerC = new Spinner(1, 13, 1);
	Spinner spinnerD = new Spinner(1, 13, 1);
	
	HBox hbox = new HBox();
	hbox.setPadding(new Insets(20));
	hbox.getChildren().addAll(numberA, spinnerA,
		numberB, spinnerB, numberC, spinnerC, numberD, spinnerD);
	
	Button play24 = new Button("Play24!");
	play24.setPadding(new Insets(10));
	
	Label result = new Label("");
	result.setFont(Font.font("Helvetica", 32));
	result.setPadding(new Insets(10));
	
	play24.setOnAction(new EventHandler<ActionEvent>() {    
	    @Override
	    public void handle(ActionEvent event) {
		result.setText(crunch((int)spinnerA.getValue(),
			(int) spinnerB.getValue(), (int) spinnerC.getValue(),
			(int) spinnerD.getValue()));
	    }
	});

	VBox vbox = new VBox();	
	vbox.setPadding(new Insets(10));
	vbox.setAlignment(Pos.CENTER);
	vbox.getChildren().add(intro);
	vbox.getChildren().add(hbox);
	vbox.getChildren().add(play24);
	vbox.getChildren().add(result);

	Scene scene = new Scene(vbox, 640, 300);

	primaryStage.setTitle("Game24");
	primaryStage.setScene(scene);
	primaryStage.show();
    }
    
    public String crunch(int w, int x, int y, int z)
    {
	String s = "Sorry...";
        int a;
        int b;
        int c;
        int d;
        
        int[] values = {w,x,y,z};
        
        for(int i =0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(j==i){
                    continue;
                }
                for(int k = 0;k<4;k++){
                    if(k==j || k==i){
                        continue;
                    }
                    for(int l=0;l<4;l++){
                        if(l == k || l == j || l == i){
                            continue;
                        }
                        
a=values[i];
b=values[j];
c=values[k];
d=values[l];
        
        
/*
**This block of if statements checks every permutation of the form A#B#C#D==24
**64 permutations in total
*/
    if ((a + b + c + d) == 24) return String.format("%1d + %2d + %3d + %4d = 24",a,b,c,d);
    if ((a + b + c - d) == 24) return String.format("%1d + %2d + %3d - %4d = 24",a,b,c,d);
    if ((a + b + c * d) == 24) return String.format("%1d + %2d + %3d * %4d = 24",a,b,c,d);
    if ((a + b + c / d) == 24) return String.format("%1d + %2d + %3d / %4d = 24",a,b,c,d);
    if ((a + b - c + d) == 24) return String.format("%1d + %2d - %3d + %4d = 24",a,b,c,d);
    if ((a + b - c - d) == 24) return String.format("%1d + %2d - %3d - %4d = 24",a,b,c,d);
    if ((a + b - c * d) == 24) return String.format("%1d + %2d - %3d * %4d = 24",a,b,c,d);
    if ((a + b - c / d) == 24) return String.format("%1d + %2d - %3d / %4d = 24",a,b,c,d);
    if ((a + b * c + d) == 24) return String.format("%1d + %2d * %3d + %4d = 24",a,b,c,d);
    if ((a + b * c - d) == 24) return String.format("%1d + %2d * %3d - %4d = 24",a,b,c,d);
    if ((a + b * c * d) == 24) return String.format("%1d + %2d * %3d * %4d = 24",a,b,c,d);
    if ((a + b * c / d) == 24) return String.format("%1d + %2d * %3d / %4d = 24",a,b,c,d);
    if ((a + b / c + d) == 24) return String.format("%1d + %2d / %3d + %4d = 24",a,b,c,d);
    if ((a + b / c - d) == 24) return String.format("%1d + %2d / %3d - %4d = 24",a,b,c,d);
    if ((a + b / c * d) == 24) return String.format("%1d + %2d / %3d * %4d = 24",a,b,c,d);
    if ((a + b / c / d) == 24) return String.format("%1d + %2d / %3d / %4d = 24",a,b,c,d);
    if ((a - b + c + d) == 24) return String.format("%1d - %2d + %3d + %4d = 24",a,b,c,d);
    if ((a - b + c - d) == 24) return String.format("%1d - %2d + %3d - %4d = 24",a,b,c,d);
    if ((a - b + c * d) == 24) return String.format("%1d - %2d + %3d * %4d = 24",a,b,c,d);
    if ((a - b + c / d) == 24) return String.format("%1d - %2d + %3d / %4d = 24",a,b,c,d);
    if ((a - b - c + d) == 24) return String.format("%1d - %2d - %3d + %4d = 24",a,b,c,d);
    if ((a - b - c - d) == 24) return String.format("%1d - %2d - %3d - %4d = 24",a,b,c,d);
    if ((a - b - c * d) == 24) return String.format("%1d - %2d - %3d * %4d = 24",a,b,c,d);
    if ((a - b - c / d) == 24) return String.format("%1d - %2d - %3d / %4d = 24",a,b,c,d);
    if ((a - b * c + d) == 24) return String.format("%1d - %2d * %3d + %4d = 24",a,b,c,d);
    if ((a - b * c - d) == 24) return String.format("%1d - %2d * %3d - %4d = 24",a,b,c,d);
    if ((a - b * c * d) == 24) return String.format("%1d - %2d * %3d * %4d = 24",a,b,c,d);
    if ((a - b * c / d) == 24) return String.format("%1d - %2d * %3d / %4d = 24",a,b,c,d);
    if ((a - b / c + d) == 24) return String.format("%1d - %2d / %3d + %4d = 24",a,b,c,d);
    if ((a - b / c - d) == 24) return String.format("%1d - %2d / %3d - %4d = 24",a,b,c,d);
    if ((a - b / c * d) == 24) return String.format("%1d - %2d / %3d * %4d = 24",a,b,c,d);
    if ((a - b / c / d) == 24) return String.format("%1d - %2d / %3d / %4d = 24",a,b,c,d);
    if ((a * b + c + d) == 24) return String.format("%1d * %2d + %3d + %4d = 24",a,b,c,d);
    if ((a * b + c - d) == 24) return String.format("%1d * %2d + %3d - %4d = 24",a,b,c,d);
    if ((a * b + c * d) == 24) return String.format("%1d * %2d + %3d * %4d = 24",a,b,c,d);
    if ((a * b + c / d) == 24) return String.format("%1d * %2d + %3d / %4d = 24",a,b,c,d);
    if ((a * b - c + d) == 24) return String.format("%1d * %2d - %3d + %4d = 24",a,b,c,d);
    if ((a * b - c - d) == 24) return String.format("%1d * %2d - %3d - %4d = 24",a,b,c,d);
    if ((a * b - c * d) == 24) return String.format("%1d * %2d - %3d * %4d = 24",a,b,c,d);
    if ((a * b - c / d) == 24) return String.format("%1d * %2d - %3d / %4d = 24",a,b,c,d);
    if ((a * b * c + d) == 24) return String.format("%1d * %2d * %3d + %4d = 24",a,b,c,d);
    if ((a * b * c - d) == 24) return String.format("%1d * %2d * %3d - %4d = 24",a,b,c,d);
    if ((a * b * c * d) == 24) return String.format("%1d * %2d * %3d * %4d = 24",a,b,c,d);
    if ((a * b * c / d) == 24) return String.format("%1d * %2d * %3d / %4d = 24",a,b,c,d);
    if ((a * b / c + d) == 24) return String.format("%1d * %2d / %3d + %4d = 24",a,b,c,d);
    if ((a * b / c - d) == 24) return String.format("%1d * %2d / %3d - %4d = 24",a,b,c,d);
    if ((a * b / c * d) == 24) return String.format("%1d * %2d / %3d * %4d = 24",a,b,c,d);
    if ((a * b / c / d) == 24) return String.format("%1d * %2d / %3d / %4d = 24",a,b,c,d);
    if ((a / b + c + d) == 24) return String.format("%1d / %2d + %3d + %4d = 24",a,b,c,d);
    if ((a / b + c - d) == 24) return String.format("%1d / %2d + %3d - %4d = 24",a,b,c,d);
    if ((a / b + c * d) == 24) return String.format("%1d / %2d + %3d * %4d = 24",a,b,c,d);
    if ((a / b + c / d) == 24) return String.format("%1d / %2d + %3d / %4d = 24",a,b,c,d);
    if ((a / b - c + d) == 24) return String.format("%1d / %2d - %3d + %4d = 24",a,b,c,d);
    if ((a / b - c - d) == 24) return String.format("%1d / %2d - %3d - %4d = 24",a,b,c,d);
    if ((a / b - c * d) == 24) return String.format("%1d / %2d - %3d * %4d = 24",a,b,c,d);
    if ((a / b - c / d) == 24) return String.format("%1d / %2d - %3d / %4d = 24",a,b,c,d);
    if ((a / b * c + d) == 24) return String.format("%1d / %2d * %3d + %4d = 24",a,b,c,d);
    if ((a / b * c - d) == 24) return String.format("%1d / %2d * %3d - %4d = 24",a,b,c,d);
    if ((a / b * c * d) == 24) return String.format("%1d / %2d * %3d * %4d = 24",a,b,c,d);
    if ((a / b * c / d) == 24) return String.format("%1d / %2d * %3d / %4d = 24",a,b,c,d);
    if ((a / b / c + d) == 24) return String.format("%1d / %2d / %3d + %4d = 24",a,b,c,d);
    if ((a / b / c - d) == 24) return String.format("%1d / %2d / %3d - %4d = 24",a,b,c,d);
    if ((a / b / c * d) == 24) return String.format("%1d / %2d / %3d * %4d = 24",a,b,c,d);
    if ((a / b / c / d) == 24) return String.format("%1d / %2d / %3d / %4d = 24",a,b,c,d);
    
/*
**This block of if statements checks every permutation of the form (A#B)#C#D==24
**and which do not simplify to a previous form
**16 permutations in total
*/
    if (((a + b) * c + d) == 24) return String.format("(%1d + %2d) * %3d + %4d = 24",a,b,c,d);
    if (((a + b) * c - d) == 24) return String.format("(%1d + %2d) * %3d - %4d = 24",a,b,c,d);
    if (((a + b) * c * d) == 24) return String.format("(%1d + %2d) * %3d * %4d = 24",a,b,c,d);
    if (((a + b) * c / d) == 24) return String.format("(%1d + %2d) * %3d / %4d = 24",a,b,c,d);
    if (((a + b) / c + d) == 24) return String.format("(%1d + %2d) / %3d + %4d = 24",a,b,c,d);
    if (((a + b) / c - d) == 24) return String.format("(%1d + %2d) / %3d - %4d = 24",a,b,c,d);
    if (((a + b) / c * d) == 24) return String.format("(%1d + %2d) / %3d * %4d = 24",a,b,c,d);
    if (((a + b) / c / d) == 24) return String.format("(%1d + %2d) / %3d / %4d = 24",a,b,c,d);
    if (((a - b) * c + d) == 24) return String.format("(%1d - %2d) * %3d + %4d = 24",a,b,c,d);
    if (((a - b) * c - d) == 24) return String.format("(%1d - %2d) * %3d - %4d = 24",a,b,c,d);
    if (((a - b) * c * d) == 24) return String.format("(%1d - %2d) * %3d * %4d = 24",a,b,c,d);
    if (((a - b) * c / d) == 24) return String.format("(%1d - %2d) * %3d / %4d = 24",a,b,c,d);
    if (((a - b) / c + d) == 24) return String.format("(%1d - %2d) / %3d + %4d = 24",a,b,c,d);
    if (((a - b) / c - d) == 24) return String.format("(%1d - %2d) / %3d - %4d = 24",a,b,c,d);
    if (((a - b) / c * d) == 24) return String.format("(%1d - %2d) / %3d * %4d = 24",a,b,c,d);
    if (((a - b) / c / d) == 24) return String.format("(%1d - %2d) / %3d / %4d = 24",a,b,c,d);
	
/*
**This block of if statements checks every permutation of the form A#%2d#(%3d#D)==24
**and which do not simplify to a previous form
**16 permutations in total
*/
    if(c!=d){
        if ((a + b / (c - d)) == 24) return String.format("%1d + %2d / (%3d - %4d) = 24",a,b,c,d);
        if ((a - b / (c - d)) == 24) return String.format("%1d - %2d / (%3d - %4d) = 24",a,b,c,d);
        if ((a * b / (c - d)) == 24) return String.format("%1d * %2d / (%3d - %4d) = 24",a,b,c,d);
        if ((a / b / (c - d)) == 24) return String.format("%1d / %2d / (%3d - %4d) = 24",a,b,c,d);
    }
    if ((a + b * (c + d)) == 24) return String.format("%1d + %2d * (%3d + %4d) = 24",a,b,c,d);
    if ((a + b * (c - d)) == 24) return String.format("%1d + %2d * (%3d - %4d) = 24",a,b,c,d);
    if ((a + b / (c + d)) == 24) return String.format("%1d + %2d / (%3d + %4d) = 24",a,b,c,d);
    if ((a - b * (c + d)) == 24) return String.format("%1d - %2d * (%3d + %4d) = 24",a,b,c,d);
    if ((a - b * (c - d)) == 24) return String.format("%1d - %2d * (%3d - %4d) = 24",a,b,c,d);
    if ((a - b / (c + d)) == 24) return String.format("%1d - %2d / (%3d + %4d) = 24",a,b,c,d);
    if ((a * b * (c + d)) == 24) return String.format("%1d * %2d * (%3d + %4d) = 24",a,b,c,d);
    if ((a * b * (c - d)) == 24) return String.format("%1d * %2d * (%3d - %4d) = 24",a,b,c,d);
    if ((a * b / (c + d)) == 24) return String.format("%1d * %2d / (%3d + %4d) = 24",a,b,c,d);
    if ((a / b * (c + d)) == 24) return String.format("%1d / %2d * (%3d + %4d) = 24",a,b,c,d);
    if ((a / b * (c - d)) == 24) return String.format("%1d / %2d * (%3d - %4d) = 24",a,b,c,d);
    if ((a / b / (c + d)) == 24) return String.format("%1d / %2d / (%3d + %4d) = 24",a,b,c,d);
    
/*This block of if statements checks every permutation of the form (A#%2d#%3d)#D==24
**and which do not simplify to a previous form
**24 permutations in total
*/

    if (((a + b + c) * d) == 24) return String.format("(%1d + %2d + %3d) * %4d = 24",a,b,c,d);
    if (((a + b + c) / d) == 24) return String.format("(%1d + %2d + %3d) / %4d = 24",a,b,c,d);
    if (((a + b - c) * d) == 24) return String.format("(%1d + %2d - %3d) * %4d = 24",a,b,c,d);
    if (((a + b - c) / d) == 24) return String.format("(%1d + %2d - %3d) / %4d = 24",a,b,c,d);
    if (((a - b + c) * d) == 24) return String.format("(%1d - %2d + %3d) * %4d = 24",a,b,c,d);
    if (((a - b + c) / d) == 24) return String.format("(%1d - %2d + %3d) / %4d = 24",a,b,c,d);
    if (((a - b - c) * d) == 24) return String.format("(%1d - %2d - %3d) * %4d = 24",a,b,c,d);
    if (((a - b - c) / d) == 24) return String.format("(%1d - %2d - %3d) / %4d = 24",a,b,c,d);
    if (((a * b + c) * d) == 24) return String.format("(%1d * %2d + %3d) * %4d = 24",a,b,c,d);
    if (((a * b + c) / d) == 24) return String.format("(%1d * %2d + %3d) / %4d = 24",a,b,c,d);
    if (((a * b - c) * d) == 24) return String.format("(%1d * %2d - %3d) * %4d = 24",a,b,c,d);
    if (((a * b - c) / d) == 24) return String.format("(%1d * %2d - %3d) / %4d = 24",a,b,c,d);
    if (((a / b + c) * d) == 24) return String.format("(%1d / %2d + %3d) * %4d = 24",a,b,c,d);
    if (((a / b + c) / d) == 24) return String.format("(%1d / %2d + %3d) / %4d = 24",a,b,c,d);
    if (((a / b - c) * d) == 24) return String.format("(%1d / %2d - %3d) * %4d = 24",a,b,c,d);
    if (((a / b - c) / d) == 24) return String.format("(%1d / %2d - %3d) / %4d = 24",a,b,c,d);
    if (((a + b * c) * d) == 24) return String.format("(%1d + %2d * %3d) * %4d = 24",a,b,c,d);
    if (((a + b * c) / d) == 24) return String.format("(%1d + %2d * %3d) / %4d = 24",a,b,c,d);
    if (((a + b / c) * d) == 24) return String.format("(%1d + %2d / %3d) * %4d = 24",a,b,c,d);
    if (((a + b / c) / d) == 24) return String.format("(%1d + %2d / %3d) / %4d = 24",a,b,c,d);
    if (((a - b * c) * d) == 24) return String.format("(%1d - %2d * %3d) * %4d = 24",a,b,c,d);
    if (((a - b * c) / d) == 24) return String.format("(%1d - %2d * %3d) / %4d = 24",a,b,c,d);
    if (((a - b / c) * d) == 24) return String.format("(%1d - %2d / %3d) * %4d = 24",a,b,c,d);
    if (((a - b / c) / d) == 24) return String.format("(%1d - %2d / %3d) / %4d = 24",a,b,c,d);
    
/*This block of if statements checks every permutation of the form A#(%2d#%3d)#D==24
**and which do not simplify to a previous form
**24 permutations in total
*/

    if(b!=c){
        if ((a / (b - c) * d) == 24) return String.format("%1d / (%2d - %3d) * %4d = 24",a,b,c,d);
        if ((a / (b - c) / d) == 24) return String.format("%1d / (%2d - %3d) / %4d = 24",a,b,c,d);
        if ((a / (b - c) + d) == 24) return String.format("%1d / (%2d - %3d) + %4d = 24",a,b,c,d);
        if ((a / (b - c) - d) == 24) return String.format("%1d / (%2d - %3d) - %4d = 24",a,b,c,d);
    }
    if ((a * (b + c) * d) == 24) return String.format("%1d * (%2d + %3d) * %4d = 24",a,b,c,d);
    if ((a * (b + c) / d) == 24) return String.format("%1d * (%2d + %3d) / %4d = 24",a,b,c,d);
    if ((a * (b - c) * d) == 24) return String.format("%1d * (%2d - %3d) * %4d = 24",a,b,c,d);
    if ((a * (b - c) / d) == 24) return String.format("%1d * (%2d - %3d) / %4d = 24",a,b,c,d);
    if ((a / (b + c) * d) == 24) return String.format("%1d / (%2d + %3d) * %4d = 24",a,b,c,d);
    if ((a / (b + c) / d) == 24) return String.format("%1d / (%2d + %3d) / %4d = 24",a,b,c,d);
    if ((a + (b + c) * d) == 24) return String.format("%1d + (%2d + %3d) * %4d = 24",a,b,c,d);
    if ((a + (b + c) / d) == 24) return String.format("%1d + (%2d + %3d) / %4d = 24",a,b,c,d);
    if ((a + (b - c) * d) == 24) return String.format("%1d + (%2d - %3d) * %4d = 24",a,b,c,d);
    if ((a + (b - c) / d) == 24) return String.format("%1d + (%2d - %3d) / %4d = 24",a,b,c,d);
    if ((a - (b + c) * d) == 24) return String.format("%1d - (%2d + %3d) * %4d = 24",a,b,c,d);
    if ((a - (b + c) / d) == 24) return String.format("%1d - (%2d + %3d) / %4d = 24",a,b,c,d);
    if ((a - (b - c) * d) == 24) return String.format("%1d - (%2d - %3d) * %4d = 24",a,b,c,d);
    if ((a - (b - c) / d) == 24) return String.format("%1d - (%2d - %3d) / %4d = 24",a,b,c,d);
    if ((a * (b + c) + d) == 24) return String.format("%1d * (%2d + %3d) + %4d = 24",a,b,c,d);
    if ((a * (b + c) - d) == 24) return String.format("%1d * (%2d + %3d) - %4d = 24",a,b,c,d);
    if ((a * (b - c) + d) == 24) return String.format("%1d * (%2d - %3d) + %4d = 24",a,b,c,d);
    if ((a * (b - c) - d) == 24) return String.format("%1d * (%2d - %3d) - %4d = 24",a,b,c,d);
    if ((a / (b + c) + d) == 24) return String.format("%1d / (%2d + %3d) + %4d = 24",a,b,c,d);
    if ((a / (b + c) - d) == 24) return String.format("%1d / (%2d + %3d) - %4d = 24",a,b,c,d);
    
/*This block of if statements checks every permutation of the form A#(%2d#%3d#D)==24
**and which do not simplify to a previous form
**24 permutations in total
*/

    if(b+c!=d){
        if ((a / (b + c - d)) == 24) return String.format("%1d / (%2d + %3d - %4d) = 24",a,b,c,d);
    }
    if(b+d!=c){
        if ((a / (b - c + d)) == 24) return String.format("%1d / (%2d - %3d + %4d) = 24",a,b,c,d);
    }
    if(b!=c/d){
       if ((a / (b - c / d)) == 24) return String.format("%1d / (%2d - %3d / %4d) = 24",a,b,c,d);
    }
    if(b!=c*d){
        if ((a / (b - c * d)) == 24) return String.format("%1d / (%2d - %3d * %4d) = 24",a,b,c,d);
    }
    if(b*c!=d){
        if ((a / (b * c - d)) == 24) return String.format("%1d / (%2d * %3d - %4d) = 24",a,b,c,d);
    }
    if(b-c!=d){
        if ((a / (b - c - d)) == 24) return String.format("%1d / (%2d - %3d - %4d) = 24",a,b,c,d);
        
    }
    if(b/c!=d){
        if ((a / (b / c - d)) == 24) return String.format("%1d / (%2d / %3d - %4d) = 24",a,b,c,d);
    }
    if ((a * (b + c + d)) == 24) return String.format("%1d * (%2d + %3d + %4d) = 24",a,b,c,d);
    if ((a * (b + c - d)) == 24) return String.format("%1d * (%2d + %3d - %4d) = 24",a,b,c,d);
    if ((a * (b - c + d)) == 24) return String.format("%1d * (%2d - %3d + %4d) = 24",a,b,c,d);
    if ((a * (b - c - d)) == 24) return String.format("%1d * (%2d - %3d - %4d) = 24",a,b,c,d);
    if ((a / (b + c + d)) == 24) return String.format("%1d / (%2d + %3d + %4d) = 24",a,b,c,d);
    if ((a * (b * c + d)) == 24) return String.format("%1d * (%2d * %3d + %4d) = 24",a,b,c,d);
    if ((a * (b * c - d)) == 24) return String.format("%1d * (%2d * %3d - %4d) = 24",a,b,c,d);
    if ((a * (b / c + d)) == 24) return String.format("%1d * (%2d / %3d + %4d) = 24",a,b,c,d);
    if ((a * (b / c - d)) == 24) return String.format("%1d * (%2d / %3d - %4d) = 24",a,b,c,d);
    if ((a / (b * c + d)) == 24) return String.format("%1d / (%2d * %3d + %4d) = 24",a,b,c,d);
    if ((a / (b / c + d)) == 24) return String.format("%1d / (%2d / %3d + %4d) = 24",a,b,c,d);
    if ((a * (b + c * d)) == 24) return String.format("%1d * (%2d + %3d * %4d) = 24",a,b,c,d);
    if ((a * (b + c / d)) == 24) return String.format("%1d * (%2d + %3d / %4d) = 24",a,b,c,d);
    if ((a * (b - c * d)) == 24) return String.format("%1d * (%2d - %3d * %4d) = 24",a,b,c,d);
    if ((a * (b - c / d)) == 24) return String.format("%1d * (%2d - %3d / %4d) = 24",a,b,c,d);
    if ((a / (b + c * d)) == 24) return String.format("%1d / (%2d + %3d * %4d) = 24",a,b,c,d);
    if ((a / (b + c / d)) == 24) return String.format("%1d / (%2d + %3d / %4d) = 24",a,b,c,d);
    
    
/*This block of if statements checks every permutation of the form (A#%2d)#(%3d#D)==24
**and which do not simplify to a previous form
**8 permutations in total
*/

    if(c!=d){
        if (((a + b) / (c - d)) == 24) return String.format("(%1d + %2d) / (%3d - %4d) = 24",a,b,c,d);
        if (((a - b) / (c - d)) == 24) return String.format("(%1d - %2d) / (%3d - %4d) = 24",a,b,c,d);
    }
    if (((a + b) * (c + d)) == 24) return String.format("(%1d + %2d) * (%3d + %4d) = 24",a,b,c,d);
    if (((a + b) * (c - d)) == 24) return String.format("(%1d + %2d) * (%3d - %4d) = 24",a,b,c,d);
    if (((a + b) / (c + d)) == 24) return String.format("(%1d + %2d) / (%3d + %4d) = 24",a,b,c,d);
    if (((a - b) * (c + d)) == 24) return String.format("(%1d - %2d) * (%3d + %4d) = 24",a,b,c,d);
    if (((a - b) * (c - d)) == 24) return String.format("(%1d - %2d) * (%3d - %4d) = 24",a,b,c,d);
    if (((a - b) / (c + d)) == 24) return String.format("(%1d - %2d) / (%3d + %4d) = 24",a,b,c,d);
    
                    }
                }
            }
        }
/*A grand total of 176 permutations were checked*/
	
	return s;
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//	launch(args);
//    }
    
}
