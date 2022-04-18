package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginAdmin {
    Main main = new Main();

    @FXML
    Label loginLabel;
    @FXML
    TextField loginUsrTextField;
    @FXML
    PasswordField loginPassTextField;

    public void LoginButton() {

    }

    public void ReturnToMenu() {
        try {
            main.changeScene("Menu.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
