package education.controller;

import java.io.IOException;
import java.time.LocalDate;

import education.EducationApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import education.model.edit;

public class EditController {

	@FXML
	private TextField idname, idstudent;

	@FXML
	DatePicker iddate;
	
	@FXML
	ComboBox <String> groupData;
	
	@FXML
	ListView<edit> studentlist;

	private Stage stage;
	 private Scene scene;
	 private Parent root;
	 
	public void update() {
		String name=idname.getText();
		String id=idstudent.getText();
		LocalDate dateOfBirth = iddate.getValue();
		String groupCode = groupData.getSelectionModel().getSelectedItem();
		edit newStudent = new edit(idstudent, idname, dateOfBirth,groupCode);
	}
	
	public void edit(ActionEvent event) throws IOException {
		System.out.println("mael");
	}
	public void back(ActionEvent event) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("/educationApp/view/Category.fxml"));
		scene = new Scene(root, 500, 500);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();

		EducationApp.mainStage.setScene(scene);


	}
}
