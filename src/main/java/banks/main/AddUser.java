package banks.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;

public class AddUser {
    Main main = new Main();
    FileManeger fm = new FileManeger();
    @FXML
     TextField UserNameTextField;
    @FXML
     TextField UserLastnameTextField;
    @FXML
     TextField UserAgeTextField;
    @FXML
     TextField UserPasswordTextField;
     @FXML
     TextField UserCreditTextField;
    @FXML
    Label SendLabel;
    @FXML
    Label ErrorLabel;
    @FXML
    CheckBox HeadBankCheckBox;
    @FXML
    CheckBox Bank1CheckBox;
    @FXML
    CheckBox Bank2CheckBox;
    @FXML
    CheckBox Bank3CheckBox;


    public void UserSendInformation() throws IOException {
        try {
            int age = Integer.parseInt(UserAgeTextField.getText());
            double credit = Double.parseDouble(UserCreditTextField.getText());
            //HeadBank
            if(HeadBankCheckBox.isSelected() && UserNameTextField.getText().length() > 3 && UserLastnameTextField.getText() != null
                    && UserAgeTextField.getText() != null && UserPasswordTextField.getText().length() > 3 && credit > 20){

                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\HeadBank\\Name.txt", UserNameTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\HeadBank\\LastName.txt", UserLastnameTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\HeadBank\\Age.txt", UserAgeTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\HeadBank\\Password.txt", UserPasswordTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\HeadBank\\Bank.txt","HeadBank");
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\HeadBank\\AccountCredit.txt",UserCreditTextField.getText());
                SendLabel.setText(" Information Sent to HeadBank ");
            }
            //Bank1
            else if (Bank1CheckBox.isSelected() && UserNameTextField.getText().length() > 3 && UserLastnameTextField.getText() != null
                    && UserAgeTextField.getText() != null && UserPasswordTextField.getText().length() > 3 && credit > 20){

                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank1\\Name.txt", UserNameTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank1\\LastName.txt", UserLastnameTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank1\\Age.txt", UserAgeTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank1\\Password.txt", UserPasswordTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank1\\Bank.txt","Bank1");
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank1\\AccountCredit.txt",UserCreditTextField.getText());
                SendLabel.setText(" Information Sent to HeadBank ");
            }
            //Bank2
            else if (Bank2CheckBox.isSelected() && UserNameTextField.getText().length() > 3 && UserLastnameTextField.getText() != null
                    && UserAgeTextField.getText() != null && UserPasswordTextField.getText().length() > 3 && credit > 20){

                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank2\\Name.txt", UserNameTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank2\\LastName.txt", UserLastnameTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank2\\Age.txt", UserAgeTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank2\\Password.txt", UserPasswordTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank2\\Bank.txt","Bank2");
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank2\\AccountCredit.txt",UserCreditTextField.getText());
                SendLabel.setText(" Information Sent to HeadBank ");
            }
            //Bank3
            else if (Bank3CheckBox.isSelected() && UserNameTextField.getText().length() > 3 && UserLastnameTextField.getText() != null
                    && UserAgeTextField.getText() != null && UserPasswordTextField.getText().length() > 3 && credit > 20 ){

                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank3\\Name.txt", UserNameTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank3\\LastName.txt", UserLastnameTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank3\\Age.txt", UserAgeTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank3\\Password.txt", UserPasswordTextField.getText().trim());
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank3\\Bank.txt","Bank3");
                fm.FileWriter("src\\main\\resources\\Files\\User\\UserRequest\\Bank3\\AccountCredit.txt",UserCreditTextField.getText());
                SendLabel.setText(" Information Sent to HeadBank ");
            }
            else{
                ErrorLabel.setText(" -- Wrong Input -- ");
            }

        }catch (Exception ex){
            ErrorLabel.setText(" Enter Correct Value For Age / Credit !");
        }

    }
    public void UserCLearButton(){
    UserNameTextField.setText("");
    UserLastnameTextField.setText("");
    UserPasswordTextField.setText("");
    UserAgeTextField.setText("");
    UserCreditTextField.setText("");
    ErrorLabel.setText("");
    SendLabel.setText("");
    HeadBankCheckBox.setSelected(false);
    Bank1CheckBox.setSelected(false);
    Bank2CheckBox.setSelected(false);
    Bank3CheckBox.setSelected(false);
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
