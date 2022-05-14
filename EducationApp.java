package education;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EducationApp extends Application{
	 
	 public static Stage mainStage;
	 @Override
	 
	 public void start(Stage arg0) throws Exception {
		 
		 //to load category.fxml in this stage
		 FXMLLoader fxmlLoader = new
		FXMLLoader(getClass().getResource("/educationApp/view/Login.fxml"));
		 
		 //set scene to stage
		 Parent root = fxmlLoader.load();
		 
		 Scene scene = new Scene(root, 500, 500);
		 arg0.setScene(scene);
		 
	 arg0.setTitle("Education App");
	 arg0.setResizable(false);
	 arg0.sizeToScene();
	 arg0.show();
	 mainStage = arg0;
	 }
	 
	 public static void main(String[] args) {
	 Application.launch(args);
	 }
	}
