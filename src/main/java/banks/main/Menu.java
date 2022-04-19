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
   public void MenuAdminPage(){
       try {
           main.changeScene("LoginAdmin.fxml");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}
