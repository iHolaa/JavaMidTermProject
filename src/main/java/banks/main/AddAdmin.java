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

    }
    public void AdminForBank2(){

    }
    public void AdminForBank3(){

    }
    public void ReturnToMenu(){
        try {
            main.changeScene("Menu.fxml");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
