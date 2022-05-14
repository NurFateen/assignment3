package education.controller;

import java.io.IOException;

import education.EducationApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;

public class PaymentController {
	
	@FXML
	private CheckBox idfee, idgrad, idhost, idtransp;
	
	@FXML
	private TextField textFieldExample;
	private Scene scene;
	
	@FXML
	private TextField amounttf;
	
	public void pay()throws Exception{
		
	}

	public void previous(ActionEvent event)throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("/educationApp/view/Category.fxml"));
		scene = new Scene(root, 500, 500);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();

		EducationApp.mainStage.setScene(scene);	  

	}
	
	public void calculatePrice() {
		int fee, grad, host, transp  = 0;
		if(idfee.isSelected()) {
			fee = 60;
		} else {
			fee = 0;
		}
		if(idgrad.isSelected()) {
			grad = 100;
		} else {
			grad = 0;
		}
		if(idhost.isSelected()) {
			host = 40;
		} else {
			host = 0;
		}
		if(idtransp.isSelected()) {
			transp = 100;
		} else {
			transp = 0;
		}
		int total = fee + grad + host + transp;
		amounttf.setText("" + total);
		
	}

}
