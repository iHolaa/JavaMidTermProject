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
}