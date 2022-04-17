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
FileManeger fm = new FileManeger();
    public void ReturnToMenu(){
try {
    main.changeScene("Menu.fxml");
}catch (Exception ex){
    ex.printStackTrace();
}
    }
    public void AddAdminForHeadBank(){
        if(adminPassword.getText().length() > 3 ){
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\HeadBank Addmin SignUp\\Username.txt",
                    adminUsername.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\HeadBank Addmin SignUp\\Password.txt",
                    adminPassword.getText().trim());
            label.setText("Admin Added ..");
        }
        else{
            label.setText("Password Must be more than 3 character");
        }
    }

}
