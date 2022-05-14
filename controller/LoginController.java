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

public class LoginController {
	private Stage stage;
	 private Scene scene;
	 private Parent root;
	@FXML
	private TextField studentIDTextField, passwordTextField;
	@FXML
	private CheckBox showPasswordCheckBox;
	@FXML
	private Label errorLabel;
	
	public void login() {
		String studentID = studentIDTextField.getText();
		String password = passwordTextField.getText();
		System.out.println(studentID + ' ' + password);
	}
	public void login (ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/educationApp/view/Category.fxml"));
		 scene = new Scene(root, 500, 500);
		  Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		  window.setScene(scene);
		  window.show();
		  
		  EducationApp.mainStage.setScene(scene);
		  
									
	}

}
