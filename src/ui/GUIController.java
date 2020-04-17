package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.MoneyExchanger;

public class GUIController {

    @FXML
    private TextField txtUSD;
    
    @FXML
    private TextField txtCOP;
    
    @FXML
    private Button ButtToCop;

    @FXML
    private Button ButtToUSD;

    @FXML
    private Label LabelMessage;

    @FXML
    void calculateCOP(ActionEvent event) {
    	
    	try {
    		
    		LabelMessage.setText("");
    		
    		double USD = Double.parseDouble(txtUSD.getText());
    		double COP = MoneyExchanger.calculateToCOP(USD);
    		txtCOP.setText(COP + "");
    	
    	}catch(NumberFormatException nfe) {
    		LabelMessage.setText("You must enter a number");
    	}
    	
    	
    }

    @FXML
    void calculateUSD(ActionEvent event) {
    	try {
    		LabelMessage.setText("");
    		double COP = Double.parseDouble(txtCOP.getText());
    		double USD = MoneyExchanger.calculateTOUSD(COP);
    		txtUSD.setText(USD + "");
    		
    	}catch(NumberFormatException nfe) {
    		LabelMessage.setText("You must enter a number");
    	}
    }

}

