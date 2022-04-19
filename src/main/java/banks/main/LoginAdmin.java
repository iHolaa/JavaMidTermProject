package banks.main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class LoginAdmin {
    Main main = new Main();
    FileManeger2 fm = new FileManeger2();
    ArrayList<String> HeadBankUsr = new ArrayList<>();
    ArrayList<String> HeadBankPass = new ArrayList<>();
    //Bank1 ReadFile
    ArrayList<String> Bank1Usr = new ArrayList<>();
    ArrayList<String> Bank1Pass = new ArrayList<>();
    //Bank2 ReadFile
    ArrayList<String> Bank2Usr = new ArrayList<>();
    ArrayList<String> Bank2Pass = new ArrayList<>();
    //Bank3 ReadFile
    ArrayList<String> Bank3Usr = new ArrayList<>();
    ArrayList<String> Bank3Pass = new ArrayList<>();

    @FXML
    Label loginLabel;
    @FXML
    TextField loginUsrTextField;
    @FXML
    PasswordField loginPassTextField;
    @FXML
    CheckBox HeadBankCheckBox;
    @FXML
    CheckBox Bank1CheckBox;
    @FXML
    CheckBox Bank2CheckBox;
    @FXML
    CheckBox Bank3CheckBox;

    public void LoginButton() throws IOException {
        //HeadBank
        fm.FileReader("D:\\JavaBank\\Main\\Files\\HeadBank Admin SignUp\\Username.txt", HeadBankUsr);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\HeadBank Admin SignUp\\Password.txt", HeadBankPass);
        //Bank1
        fm.FileReader("D:\\JavaBank\\Main\\Files\\Bank1 Admin SignUp\\Username.txt", Bank1Usr);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\Bank1 Admin SignUp\\Password.txt", Bank1Pass);
        //Bank2
        fm.FileReader("D:\\JavaBank\\Main\\Files\\Bank2 Admin SignUp\\Username.txt", Bank2Usr);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\Bank2 Admin SignUp\\Password.txt", Bank2Pass);
        //Bank3
        fm.FileReader("D:\\JavaBank\\Main\\Files\\Bank3 Admin SignUp\\Username.txt",Bank3Usr);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\Bank3 Admin SignUp\\Password.txt", Bank3Pass);

        for (int i = 0; i < HeadBankUsr.size() ; i++) {

            if (HeadBankCheckBox.isSelected() && loginUsrTextField.getText().trim().equals(HeadBankUsr.get(i)) &&
                    loginPassTextField.getText().trim().equals(HeadBankPass.get(i))){

            }
            else if (Bank1CheckBox.isSelected() && loginUsrTextField.getText().trim().equals(Bank1Usr.get(i)) &&
                    loginPassTextField.getText().trim().equals(Bank1Pass.get(i))) {


            }
            else if (Bank2CheckBox.isSelected() && loginUsrTextField.getText().trim().equals(Bank2Usr.get(i)) &&
                    loginPassTextField.getText().trim().equals(Bank2Pass.get(i))) {


                }

            else if (Bank3CheckBox.isSelected() && loginUsrTextField.getText().trim().equals(Bank3Usr.get(i)) &&
                    loginPassTextField.getText().trim().equals(Bank3Pass.get(i))) {

            }
            else{
                loginLabel.setVisible(true);
                loginLabel.setText(" Username or Password is Wrong ");
                break;
            }
        }
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
         loginLabel.setVisible(false);
     }
     public void Change1(){
         HeadBankCheckBox.setSelected(false);
         Bank2CheckBox.setSelected(false);
         Bank3CheckBox.setSelected(false);
         loginLabel.setVisible(false);
     }
     public void Change2(){
         HeadBankCheckBox.setSelected(false);
         Bank1CheckBox.setSelected(false);
         Bank3CheckBox.setSelected(false);
         loginLabel.setVisible(false);
     }
     public void Change3(){
        if(Bank3CheckBox.isSelected()){
            HeadBankCheckBox.setSelected(false);
            Bank1CheckBox.setSelected(false);
            Bank2CheckBox.setSelected(false);
            loginLabel.setVisible(false);
        }
     }
}
