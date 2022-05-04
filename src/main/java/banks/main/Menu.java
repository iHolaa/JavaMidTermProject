package banks.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu {
    Main main = new Main();
    @FXML
    Button closeButton;


   public void addAdminButton(){
       try {
           main.changeScene("AddAdmin.fxml");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public void addUserButton(){
       try {
           main.changeScene("AddUser.fxml");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public void AdminPage(){
       try {
           main.changeScene("LoginAdmin.fxml");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public void PayBills(){
       try {
           main.changeScene("PayBills.fxml");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public void Withdrawal(){
       try {
           main.changeScene("Withdrawal.fxml");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public void MoneyTransfer(){
       try {
           main.changeScene("MoneyTransfer.fxml");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public void Exit() {
    Stage stage = (Stage) closeButton.getScene().getWindow();
    stage.close();
   }
}
