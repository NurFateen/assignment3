package education.controller;

import java.io.IOException;

import education.EducationApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class GradeController {
	private Stage stage;
	 private Scene scene;
	 private Parent root;
	@FXML
	TextField idEng,idMath,idSci,idBM,idAve,idGPA,enggrade,mathgrade,scigrade,bmgrade;

	public void calculate(ActionEvent event)throws IOException {
		String engscore, mathscore,sciscore,bmscore;
		double average;
		double gpa=0;

		engscore = idEng.getText();
		mathscore = idMath.getText();
		sciscore = idSci.getText();
		bmscore = idBM.getText();

		double english = Double.parseDouble(engscore); 
		double math = Double.parseDouble(mathscore); 
		double science = Double.parseDouble(sciscore); 
		double bm = Double.parseDouble(bmscore); 

		average = ((english + math + science + bm)/4);

		//english grade and gpa
		if(english >=90) {
			enggrade.setText("A");
			gpa = gpa + 4.0;
		}else if(english >=80 && english<=90) {
			enggrade.setText("B");
			gpa = gpa + 3.0;
		}else if(english >=70 && english<=80) {
			enggrade.setText("C");
			gpa = gpa + 2.0;
		}else if(english >=60 && english<=70) {
			enggrade.setText("D");
			gpa = gpa + 1.0;
		}else{
			enggrade.setText("F");
			gpa = gpa + 0;
		}

		//math grade and gpa
		if(math >=90) {
			mathgrade.setText("A");
			gpa = gpa + 4.0;
		}else if(math >=80 && math<=90) {
			mathgrade.setText("B");
			gpa = gpa + 3.0;
		}else if(math >=70 && math<=80) {
			mathgrade.setText("C");
			gpa = gpa + 2.0;
		}else if(math >=60 && math<=70) {
			mathgrade.setText("D");
			gpa = gpa + 1.0;
		}else{
			mathgrade.setText("F");
			gpa = gpa + 0;
		}

		//science grade and gpa
		if(science >=90) {
			scigrade.setText("A");
			gpa = gpa + 4.0;
		}else if(science >=80 && science<=90) {
			scigrade.setText("B");
			gpa = gpa + 3.0;
		}else if(science >=70 && science<=80) {
			scigrade.setText("C");
			gpa = gpa + 2.0;
		}else if(science >=60 && science<=70) {
			scigrade.setText("D");
			gpa = gpa + 1.0;
		}else{
			scigrade.setText("F");
			gpa = gpa + 0;
		}

		//bm grade and gpa
		if(bm >=90) {
			bmgrade.setText("A");
			gpa = gpa + 4.0;
		}else if(bm >=80 && bm<=90) {
			bmgrade.setText("B");
			gpa = gpa + 3.0;
		}else if(bm >=70 && bm<=80) {
			bmgrade.setText("C");
			gpa = gpa + 2.0;
		}else if(bm >=60 && bm<=70) {
			bmgrade.setText("D");
			gpa = gpa + 1.0;
		}else{
			bmgrade.setText("F");
			gpa = gpa + 0;
		}

		gpa = gpa/4;
		 idGPA.setText(Double.toString(gpa));
		 idAve.setText(Double.toString(average));

	}

	//back to previous scene
	public void previous(ActionEvent event)throws IOException {
	
			Parent root = FXMLLoader.load(getClass().getResource("/educationApp/view/Category.fxml"));
			 scene = new Scene(root, 500, 500);
			  Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			  window.setScene(scene);
			  window.show();
			  
			  EducationApp.mainStage.setScene(scene);	  

	}
	


}
