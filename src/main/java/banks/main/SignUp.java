package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignUp {
    Main main = new Main();
    FileManeger fm = new FileManeger();
@FXML
Label signupPassLabel;
@FXML
PasswordField signupPassTextField;
@FXML
TextField signupUsrTextField;

public void SignUpButton(){
    Main main = new Main();

    try {
        if(signupPassTextField.getText().length() >=  4 && signupUsrTextField.getText().length() >=4 ) {
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\SignUp\\Password.txt", signupPassTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\SignUp\\Username.txt", signupUsrTextField.getText().trim());
            main.changeScene("Login.fxml");
        }
        else {
            signupPassLabel.setText(" Username & Password Must be At least 4 Character ");
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
public void GotoLogin(){
    try {
        main.changeScene("Login.fxml");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}