package banks.main;

import java.io.IOException;

public class Menu {
    Main main = new Main();




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
           main.changeScene("PayBills.fxml");
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
}
