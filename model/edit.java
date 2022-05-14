package education.model;

import java.time.LocalDate;

import javafx.scene.control.TextField;

public class edit {

	TextField idname;
	TextField idstudent;
	LocalDate dateOfBirth;
	String groupCode;
	public edit(TextField idname, TextField idstudent, LocalDate dateOfBirth, String groupCode) {
		this.idname = idname;
		this.idstudent = idstudent;
		this.dateOfBirth = dateOfBirth;
		this.groupCode = groupCode;
	}
	public TextField getIdname() {
		return idname;
	}
	public void setIdname(TextField idname) {
		this.idname = idname;
	}
	public TextField getIdstudent() {
		return idstudent;
	}
	public void setIdstudent(TextField idstudent) {
		this.idstudent = idstudent;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	  
	
}
