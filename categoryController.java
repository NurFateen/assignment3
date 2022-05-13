package educationApp.controller;
import java.io.IOException;

import educationApp.educationApp;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Node;

public class categoryController{

	private Stage stage;
	 private Scene scene;
	 private Parent root; 
	 	
	public void edit(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("/educationApp/view/edit.fxml"));
		 scene = new Scene(root, 500, 500);
		  Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		  window.setScene(scene);
		  window.show();
		  
		  educationApp.mainStage.setScene(scene);
		  
		
	}

	public void payment(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/educationApp/view/payment.fxml"));
		 scene = new Scene(root, 500, 500);
		  Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		  window.setScene(scene);
		  window.show();
		  
		  educationApp.mainStage.setScene(scene);
		  
	}
	public void grade(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/educationApp/view/grade.fxml"));
		 scene = new Scene(root, 500, 500);
		  Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		  window.setScene(scene);
		  window.show();
		  
		  educationApp.mainStage.setScene(scene);
		  
									
	}
}
