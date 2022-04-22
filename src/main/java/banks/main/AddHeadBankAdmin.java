package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AddHeadBankAdmin {
@FXML
PasswordField adminPassword;
@FXML
TextField adminUsername;
@FXML
Label label;
Main main = new Main();
FileManeger2 fm2 = new FileManeger2();
    public void ReturnToMenu() {
        try {
            main.changeScene("Menu.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void AddAdminForHeadBank(){
        if(adminPassword.getText().length() > 3 && adminUsername.getText().length() > 3){
            fm2.FileWriter("src\\main\\resources\\Files\\Login Admin\\HeadBank Admin SignUp\\Username.txt",
                    adminUsername.getText().trim());
            fm2.FileWriter("src\\main\\resources\\Files\\Login Admin\\HeadBank Admin SignUp\\Password.txt",
                    adminPassword.getText().trim());
            label.setVisible(true);
            label.setText("  HeadBank Admin -->> Added Successfully.. ");
        }
        else{
            label.setVisible(true);
            label.setText("  Username & Password Must be At least 4 Character ");
        }
    }

}
