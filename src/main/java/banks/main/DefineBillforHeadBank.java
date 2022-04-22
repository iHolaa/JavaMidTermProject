package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class DefineBillforHeadBank {

    Main main = new Main();
    FileManeger fm = new FileManeger();

    @FXML
    TextField BillAmountTextField;
    @FXML
    TextField userLastnameTextField;
    @FXML
    TextField userNameTextField;
    @FXML
    Label confirmLabel,errorLabel,billsID;
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> lastname = new ArrayList<>();
    ArrayList<String> credit = new ArrayList<>();


    public void ConfirmButton(){
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\Name.txt",name);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\LastName.txt",lastname);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",credit);
        try {
            double x;
            x = Double.parseDouble(BillAmountTextField.getText());
            for (int i = 0; i < name.size(); i++) {
                if (userNameTextField.getText().equals(name.get(i)) && userLastnameTextField.getText().equals(lastname.get(i)) && x >= 10 ) {
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\HeadBank\\Name.txt",userNameTextField.getText());
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\HeadBank\\LastName.txt",userLastnameTextField.getText());
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\HeadBank\\credit.txt", String.valueOf(credit.get(i)));
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\HeadBank\\BillAmount.txt",BillAmountTextField.getText());
                    confirmLabel.setText(" Bill Defined Successfully ");
                    int billCode = 100000000 + new Random().nextInt(999999999);
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\HeadBank\\BillID.txt",String.valueOf(billCode));
                    billsID.setText(String.valueOf(billCode));
                    break;
                }
                else{
                    errorLabel.setText(" User ( name / lastname ) is Wrong ! ");
                }

            }
        }catch (Exception ex){
            errorLabel.setText(" Bill Amount is Wrong ! ");
        }

    }


    public void ClearButton(){
        confirmLabel.setText("");
        errorLabel.setText("");
        userLastnameTextField.setText("");
        userNameTextField.setText("");
        BillAmountTextField.setText("");
    }
    public void ReturnToHeadBank(){
        try {
            main.changeScene("HeadBank.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
