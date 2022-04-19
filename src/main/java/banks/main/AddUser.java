package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddUser {
    Main main = new Main();
    FileManeger2 fm = new FileManeger2();
    @FXML
    TextField UserNameTextField;
    @FXML
    TextField UserLastnameTextField;
    @FXML
    TextField UserAgeTextField;
    @FXML
    TextField UserJobTextField;
    @FXML
    Label SendLabel;
    @FXML
    Label FieldsEmptyLabel;
    @FXML
    CheckBox HeadBankCheckBox;
    @FXML
    CheckBox Bank1CheckBox;
    @FXML
    CheckBox Bank2CheckBox;
    @FXML
    CheckBox Bank3CheckBox;


    public void UserSendInformation(){


    }
    public void UserCLearButton(){


    }


    public void ReturnToMenu() {
        try {
            main.changeScene("Menu.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public void Change(){
        Bank1CheckBox.setSelected(false);
        Bank2CheckBox.setSelected(false);
        Bank3CheckBox.setSelected(false);
    }
    public void Change1(){
        HeadBankCheckBox.setSelected(false);
        Bank2CheckBox.setSelected(false);
        Bank3CheckBox.setSelected(false);
    }
    public void Change2(){
        HeadBankCheckBox.setSelected(false);
        Bank1CheckBox.setSelected(false);
        Bank3CheckBox.setSelected(false);
    }
    public void Change3(){
        if(Bank3CheckBox.isSelected()){
            HeadBankCheckBox.setSelected(false);
            Bank1CheckBox.setSelected(false);
            Bank2CheckBox.setSelected(false);
        }
    }
}
