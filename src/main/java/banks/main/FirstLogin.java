package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FirstLogin {
    FileManeger fm = new FileManeger();
    Main main = new Main();
    @FXML
    TextField loginUsrTextField;
    @FXML
    PasswordField loginPassTextField;
    @FXML
    Label loginLabel;

    public void LoginButton() throws IOException {
        ArrayList<String> usr = new ArrayList<>();
        ArrayList<String> pass = new ArrayList<>();
        fm.FileReader("D:\\JavaBank\\Main\\Files\\SignUp\\Username.txt", usr);
        for (int i = 0; i < usr.size(); i++) {
            if (loginUsrTextField.getText() != null && loginUsrTextField.getText().equals(usr.get(i))) {
                fm.FileReader("D:\\JavaBank\\Main\\Files\\SignUp\\Password.txt", pass);
                for (int j = 0; j < pass.size(); j++) {
                    if (loginPassTextField.getText().equals(pass.get(j))) {
                        try {
                            main.changeScene("Menu.fxml");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            } else {
                loginLabel.setVisible(true);
                loginLabel.setText(" Username or Password is WRONG ");
            }
        }
        loginLabel.setVisible(true);
        loginLabel.setText(" Username or Password is WRONG ");
    }
}
