package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    private double weightN;
    private double heightN;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button metric;

    @FXML
    private Button english;

    @FXML
    private TextField result;

    @FXML
    private TextField weight;

    @FXML
    private TextField height;

    @FXML
    void englishButtonPressed(ActionEvent event) {
        try{

            weightN = Double.parseDouble(weight.getText());

            heightN = Double.parseDouble(height.getText());

            double value = 703 * (weightN/Math.pow(heightN,2));
            String ans = "";
            if(value<0){
                throw new NumberFormatException();
            }
            if(value<18.5){
                ans = "Underweight";
            }
            else if(value>=18.5 && value<= 24.99){
                ans = "Normal";
            }
            else if(value>=25 && value<= 29.99){
                ans = "Overweight";
            }
            else{
                ans = "Obese";
            }

            result.setText(ans);


        }
        catch (NumberFormatException ex){
            weight.setText("Enter Weight");
            height.setText("Enter Height");
            weight.selectAll();
            weight.requestFocus();
        }

    }

    @FXML
    void metricButtonPressed(ActionEvent event) {
        try{

            weightN = Double.parseDouble(weight.getText());

            heightN = Double.parseDouble(height.getText());

            double value = (weightN/Math.pow(heightN,2));
            String ans = "";
            if(value<0){
                throw new NumberFormatException();
            }
            if(value<18.5){
                ans = "Underweight";
            }
            else if(value>=18.5 && value<= 24.99){
                ans = "Normal";
            }
            else if(value>=25 && value<= 29.99){
                ans = "Overweight";
            }
            else{
                ans = "Obese";
            }

            result.setText(ans);


        }
        catch (NumberFormatException ex){
            weight.setText("Enter Weight");
            height.setText("Enter Height");
            weight.selectAll();
            weight.requestFocus();
        }
    }

}
