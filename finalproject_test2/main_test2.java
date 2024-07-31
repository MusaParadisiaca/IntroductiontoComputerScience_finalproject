package finalproject_test2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class main_test2 extends Application {
	public static int cash_value = 1000;
	public static String cash1 = "1000";
	public static Stage currentStage;
	public static Scene menuScene;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		currentStage = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
		menuScene = new Scene(root,844,522);
		currentStage.setTitle("½ä³Õ¹CÀ¸");
		currentStage.setScene(menuScene);
		currentStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
