module educationApp {
	
	requires javafx.base;
	 requires javafx.controls;
	 requires javafx.fxml;
	 requires transitive javafx.graphics;
	 
	 opens educationApp to javafx.fxml;
	 opens educationApp.controller to javafx.fxml;
	 exports educationApp;
	 exports educationApp.controller;
	 exports educationApp.model;
}