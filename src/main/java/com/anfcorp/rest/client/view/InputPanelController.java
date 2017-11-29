package com.anfcorp.rest.client.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;

public class InputPanelController {

	@FXML
	private ChoiceBox<String> methodChoiceBox;
		
	@FXML
	private TextField urlField;
	
	public InputPanelController() {
		System.out.println("Constructor - begin");
		
	}

	@FXML
	private void initialize() {
		System.out.println("initialize - begin");
		ObservableList<String> items = FXCollections.observableArrayList();
		items.add("GET");
		items.add("HEAD");
		items.add("POST");
		items.add("PUT");
		items.add("DELETE");
		items.add("CONNECT");
		items.add("OPTIONS");
		items.add("TRACE");
		items.add("PATCH");

		methodChoiceBox.setItems(items);
		methodChoiceBox.setValue("GET");
		
	}
	
	@FXML
	private void handleSend() {
		
		System.out.println("handleSend - begin");
		String url = urlField.getText();
		System.out.println(url);
		
	}
	
	@FXML
	private void handleClear() {
		
		System.out.println("handleClear - begin");
		this.urlField.setText(null);
		
	}
	
	
}
