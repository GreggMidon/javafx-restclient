package com.anfcorp.rest.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private Stage primaryStage;
	private BorderPane root;
	private AnchorPane topPane;
	
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		
		try {
			root = new BorderPane();
			Scene scene = new Scene(root, 1100, 800);
			scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
			
			setTop();
			
			
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void setTop() {
		
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/input-panel.fxml"));
			topPane = (AnchorPane) loader.load();
			root.setTop(topPane);
		}
		catch(Exception e) {
			e.printStackTrace();
		}				
	}
}
