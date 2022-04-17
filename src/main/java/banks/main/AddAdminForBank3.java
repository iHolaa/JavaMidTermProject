package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AddAdminForBank3 {
    Main main = new Main();
    FileManeger2 fm2 = new FileManeger2();
    @FXML
    TextField adminUsername;
    @FXML
    PasswordField adminPassword;
    @FXML
    Label label;


    public void AddAdminForBank3(){
        if(adminPassword.getText().length() > 3 && adminUsername.getText().length() > 3){
            fm2.FileWriter("D:\\JavaBank\\Main\\Files\\Bank3 Admin SignUp\\Username.txt",
                    adminUsername.getText().trim());
            fm2.FileWriter("D:\\JavaBank\\Main\\Files\\Bank3 Admin SignUp\\Password.txt",
                    adminPassword.getText().trim());
            label.setVisible(true);
            label.setText("  Bank3 Admin -->> Added Successfully.. ");
        }
        else{
            label.setVisible(true);
            label.setText("  Username & Password Must be At least 4 Character ");
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
