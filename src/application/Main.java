package application;
	
import java.io.Console;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;



public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Login.FXML"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		//Pre seed the database with user logins.
		//Change yours!
		User.database.add(new User("Jerry","password", 7701, 5, "EMP123"));
		User.database.add(new User("Alice","password", 7702, 5, "EMP124"));
		User.database.add(new User("Kyle","Titan", 7703, 5, "EMP125"));
		User.database.add(new User("Andrew", "Bandit", 7704, 5, "EMP126"));
		User.database.add(new User("Gavin","password", 7705, 5, "EMP127"));
		
		launch(args);
		
		
	}
	
	
}
