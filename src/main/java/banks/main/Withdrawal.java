package banks.main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Withdrawal {
    Main main = new Main();
    FileManeger fm = new FileManeger();
    @FXML
    CheckBox HeadBankCheckBox ,Bank1CheckBox , Bank2CheckBox ,Bank3CheckBox ;
    @FXML
    TextField nameTextField , passTextField ,amountTextField ,moneyTextField ;
    @FXML
    TextField fiftyTextField,tenTextField,fiveTextField , twoTextField , oneTextField;
    @FXML
    Text  AmountText , userMoney ,fiftyText,tenText,fiveText,twoText,oneText;
    @FXML
    Button takeButton,checkButton;
    @FXML
    Label errorLabel , successLabel;
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> userCredit = new ArrayList<>();


    int i;
    public void Check(){

        if(HeadBankCheckBox.isSelected()){
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\Name.txt",name);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\Password.txt",password);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",userCredit);
            for ( i = 0; i < name.size() ; i++) {
                if (nameTextField.getText().equals(name.get(i)) && passTextField.getText().equals(password.get(i))){
                    Bank1CheckBox.setVisible(false);
                    Bank2CheckBox.setVisible(false);
                    Bank3CheckBox.setVisible(false);
                    checkButton.setVisible(false);
                    nameTextField.setEditable(false);
                    passTextField.setEditable(false);
                    takeButton.setVisible(true);
                    amountTextField.setVisible(true);
                    AmountText.setVisible(true);
                    moneyTextField.setVisible(true);
                    userMoney.setVisible(true);
                    moneyTextField.setText(userCredit.get(i));
                    errorLabel.setText("");
                    break;
                }
                else{
                    errorLabel.setText(" ( Name / Password ) is Wrong !!");
                }
            }//end of for
        }//end of if
        else if(Bank1CheckBox.isSelected()){
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\Name.txt",name);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\Password.txt",password);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",userCredit);
            for ( i = 0; i < name.size() ; i++) {
                if (nameTextField.getText().equals(name.get(i)) && passTextField.getText().equals(password.get(i))){
                    HeadBankCheckBox.setVisible(false);
                    Bank2CheckBox.setVisible(false);
                    Bank3CheckBox.setVisible(false);
                    checkButton.setVisible(false);
                    nameTextField.setEditable(false);
                    passTextField.setEditable(false);
                    takeButton.setVisible(true);
                    amountTextField.setVisible(true);
                    AmountText.setVisible(true);
                    moneyTextField.setVisible(true);
                    userMoney.setVisible(true);
                    moneyTextField.setText(userCredit.get(i));
                    errorLabel.setText("");
                    break;
                }
                else{
                    errorLabel.setText(" ( Name / Password ) is Wrong !!");
                }
            }//end of for
        }//end of else if

        else if(Bank2CheckBox.isSelected()){
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\Name.txt",name);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\Password.txt",password);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",userCredit);
            for ( i = 0; i < name.size() ; i++) {
                if (nameTextField.getText().equals(name.get(i)) && passTextField.getText().equals(password.get(i))){
                    HeadBankCheckBox.setVisible(false);
                    Bank1CheckBox.setVisible(false);
                    Bank3CheckBox.setVisible(false);
                    checkButton.setVisible(false);
                    nameTextField.setEditable(false);
                    passTextField.setEditable(false);
                    takeButton.setVisible(true);
                    amountTextField.setVisible(true);
                    AmountText.setVisible(true);
                    moneyTextField.setVisible(true);
                    userMoney.setVisible(true);
                    moneyTextField.setText(userCredit.get(i));
                    errorLabel.setText("");
                    break;
                }
                else{
                    errorLabel.setText(" ( Name / Password ) is Wrong !!");
                }
            }//end of for
        }//end of else if
        else if(Bank3CheckBox.isSelected()){
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\Name.txt",name);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\Password.txt",password);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",userCredit);
            for ( i = 0; i < name.size() ; i++) {
                if (nameTextField.getText().equals(name.get(i)) && passTextField.getText().equals(password.get(i))){
                    HeadBankCheckBox.setVisible(false);
                    Bank2CheckBox.setVisible(false);
                    Bank1CheckBox.setVisible(false);
                    checkButton.setVisible(false);
                    nameTextField.setEditable(false);
                    passTextField.setEditable(false);
                    takeButton.setVisible(true);
                    amountTextField.setVisible(true);
                    AmountText.setVisible(true);
                    moneyTextField.setVisible(true);
                    userMoney.setVisible(true);
                    moneyTextField.setText(userCredit.get(i));
                    errorLabel.setText("");
                    break;
                }
                else{
                    errorLabel.setText(" ( Name / Password ) is Wrong !!");
                }
            }//end of for
        }//end of else if
        else{
            errorLabel.setText(" Select the Bank !!");
        }
    }//end of Check Button Method

    public void Take() {

        if (HeadBankCheckBox.isSelected()) {
            boolean x = false;
            x = TakeMoney();
            if( x == true ){
                try {
                Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                for (int j = 0; j < userCredit.size(); j++) {
                    fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt", userCredit.get(j));
                }
            }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        }//end of if
        else if(Bank1CheckBox.isSelected()){
            boolean y = false;
            y = TakeMoney();
            if( y == true ){
                try {
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                    for (int j = 0; j < userCredit.size(); j++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt", userCredit.get(j));
                    }
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }//end of else if
        else if(Bank2CheckBox.isSelected()){
            boolean a = false;
            a = TakeMoney();
            if( a == true ){
                try {
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                    for (int j = 0; j < userCredit.size(); j++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt", userCredit.get(j));
                    }
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }//end of else if
        else if(Bank3CheckBox.isSelected()){
            boolean b = false;
            b = TakeMoney();
            if( b == true ){
                try {
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                    for (int j = 0; j < userCredit.size(); j++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt", userCredit.get(j));
                    }
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }//end of else if
        else{
            errorLabel.setText(" Select the Bank !!");
        }//end of else
    }

    public boolean TakeMoney(){
        try {
            double amount = Double.parseDouble(amountTextField.getText());
            double credit = Double.parseDouble(moneyTextField.getText());
            credit = credit - amount;

            if(credit >= 20 ) {

                userCredit.set(i, String.valueOf(credit));

                fiftyTextField.setVisible(true);
                tenTextField.setVisible(true);
                fiveTextField.setVisible(true);
                twoTextField.setVisible(true);
                oneTextField.setVisible(true);
                fiftyText.setVisible(true);
                tenText.setVisible(true);
                fiveText.setVisible(true);
                twoText.setVisible(true);
                oneText.setVisible(true);
                takeButton.setVisible(false);
                successLabel.setText(" the operation was Successful ");
                for (int j0 = 0; j0 <= amount / 50; j0++){
                    for (int j1 = 0; j1 <= (amount % 50) / 10; j1++){
                        for (int j2 = 0; j2 <= (amount % 100) / 5; j2++){
                            for (int j3 = 0; j3 <= (amount % 500 ) / 2; j3++){
                                for (int j4 = 0; j4 <= (amount % 1000) / 1; j4++) {
                                    if ((j0 * 50 + j1 * 10 + j2 * 5 + j3 * 2 + j4 * 1) == amount) {
                                        fiftyTextField.setText(String.valueOf(j0));
                                        tenTextField.setText(String.valueOf(j1));
                                        fiveTextField.setText(String.valueOf(j2));
                                        twoTextField.setText(String.valueOf(j3));
                                        oneTextField.setText(String.valueOf(j4));
                                        break;
                                    }
                                }}}}
                }//end of first for
                return true;
            } else {
                errorLabel.setText(" Your Money is not Enough !!");
                return false;
            }
        } catch (Exception ex) {
            errorLabel.setText(" Amount is Wrong !!");
            return false;
        }
    }

    public void ReturnToMenu(){
        try {
            main.changeScene("Menu.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void Change(){
        Bank1CheckBox.setSelected(false);
        Bank2CheckBox.setSelected(false);
        Bank3CheckBox.setSelected(false);
        errorLabel.setText("");
        successLabel.setText("");
    }
    public void Change1(){
        HeadBankCheckBox.setSelected(false);
        Bank2CheckBox.setSelected(false);
        Bank3CheckBox.setSelected(false);
        errorLabel.setText("");
        successLabel.setText("");
    }
    public void Change2(){
        HeadBankCheckBox.setSelected(false);
        Bank1CheckBox.setSelected(false);
        Bank3CheckBox.setSelected(false);
        errorLabel.setText("");
        successLabel.setText("");
    }
    public void Change3(){
        if(Bank3CheckBox.isSelected()){
            HeadBankCheckBox.setSelected(false);
            Bank1CheckBox.setSelected(false);
            Bank2CheckBox.setSelected(false);
            errorLabel.setText("");
            successLabel.setText("");
        }
    }


}
