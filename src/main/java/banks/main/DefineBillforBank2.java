package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.Random;

public class DefineBillforBank2 {

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
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\Name.txt",name);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\LastName.txt",lastname);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",credit);
        try {
            double x;
            x = Double.parseDouble(BillAmountTextField.getText());
            for (int i = 0; i < name.size(); i++) {
                if (userNameTextField.getText().equals(name.get(i)) && userLastnameTextField.getText().equals(lastname.get(i)) && x >= 10 ) {
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank2\\Name.txt",userNameTextField.getText());
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank2\\LastName.txt",userLastnameTextField.getText());
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank2\\credit.txt", String.valueOf(credit.get(i)));
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank2\\BillAmount.txt",BillAmountTextField.getText());
                    confirmLabel.setText(" Bill Defined Successfully ");
                    int billCode = 100000000 + new Random().nextInt(999999999);
                    fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank2\\BillID.txt",String.valueOf(billCode));
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
    public void ReturnToBank2(){
        try {
            main.changeScene("Bank3.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
