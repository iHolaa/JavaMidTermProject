package banks.main;

import java.io.IOException;

public class AddAdmin {
    Main main = new Main();
    public void AdminForHeadBank(){
        try {
            main.changeScene("AddHeadBankAdmin.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void AdminForBank1(){
        try {
            main.changeScene("AddAdminForBank1.fxml");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void AdminForBank2(){
        try {
            main.changeScene("AddAdminForBank2.fxml");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void AdminForBank3(){
        try {
            main.changeScene("AddAdminForBank3.fxml");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void ReturnToMenu(){
        try {
            main.changeScene("Menu.fxml");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
