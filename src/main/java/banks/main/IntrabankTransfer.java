package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class IntrabankTransfer {
    Main main = new Main();
    FileManeger fm = new FileManeger();
    @FXML
    Text transferAmountText , personText ;
    @FXML
    TextField amountTextField,receiverTextField ,senderTextField;
    @FXML
    Label errorLabel , successLabel;
    @FXML
    CheckBox HeadBankCheckBox ,Bank1CheckBox , Bank2CheckBox ,Bank3CheckBox ;
    @FXML
    Button TransferButton , checkButton;
    ArrayList<String> Code  = new ArrayList<>();
    ArrayList<String> AcountCredit  = new ArrayList<>();
    ArrayList<String> name  = new ArrayList<>();
    ArrayList<String> lastname = new ArrayList<>();
    ArrayList<String> Code1   = new ArrayList<>();
    ArrayList<String> AcountCredit1   = new ArrayList<>();
    ArrayList<String> name1  = new ArrayList<>();
    ArrayList<String> lastname1 = new ArrayList<>();
    ArrayList<String> Code2 = new ArrayList<>();
    ArrayList<String> AcountCredit2 = new ArrayList<>();
    ArrayList<String> name2  = new ArrayList<>();
    ArrayList<String> lastname2 = new ArrayList<>();
    ArrayList<String> Code3 = new ArrayList<>();
    ArrayList<String> AcountCredit3 = new ArrayList<>();
    ArrayList<String> name3  = new ArrayList<>();
    ArrayList<String> lastname3 = new ArrayList<>();

    //for HeadBank
    int i,j;
    //for Bank1
    int k,h;
    //for Bank2
    int x,y;
    //for Bank3
    int a,b;

    public void CheckTransfer(){

    if(HeadBankCheckBox.isSelected()) {
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\TransferCode.txt", Code);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt", AcountCredit);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\Name.txt",name);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\LastName.txt",lastname);

            for ( i = 0; i < Code.size() ; i++) {
                if (senderTextField.getText().equals(Code.get(i))){
                    for ( j = 0; j < Code.size() ; j++) {
                        if (receiverTextField.getText().equals( Code.get(j))){
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            Bank1CheckBox.setVisible(false);
                            Bank2CheckBox.setVisible(false);
                            Bank3CheckBox.setVisible(false);
                            checkButton.setVisible(false);
                            personText.setText(name.get(i) +" "+ lastname.get(i) + " to " + name.get(j) + " " + lastname.get(j));
                            errorLabel.setText("");
                            break;
                        }
                        else {
                         errorLabel.setText(" Receiver Code is Wrong! ");
                        }
                    }
                    break;
                }
                else {
                    errorLabel.setText(" Sender Code is Wrong ");
                }

            }
        }
    else if(Bank1CheckBox.isSelected()){
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\TransferCode.txt", Code1);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt", AcountCredit1);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\Name.txt",name1);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\LastName.txt",lastname1);

            for ( k = 0; k < Code1.size() ; k++) {
                if (senderTextField.getText().equals(Code1.get(k))){
                    for ( h = 0; h < Code1.size() ; h++) {
                        if (receiverTextField.getText().equals( Code1.get(h))){
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            HeadBankCheckBox.setVisible(false);
                            Bank2CheckBox.setVisible(false);
                            Bank3CheckBox.setVisible(false);
                            checkButton.setVisible(false);
                            personText.setText(name1.get(k) +" "+ lastname1.get(k) + " to " + name1.get(h) + " " + lastname1.get(h));
                            errorLabel.setText("");
                            break;
                        }
                        else {
                         errorLabel.setText(" Receiver Code is Wrong! ");
                        }
                    }
                    break;
                }
                else {
                    errorLabel.setText(" Sender Code is Wrong ");
                }

            }
        }
    else if(Bank2CheckBox.isSelected()){
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\TransferCode.txt", Code2);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt", AcountCredit2);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\Name.txt",name2);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\LastName.txt",lastname2);

            for ( x = 0; x < Code2.size() ; x++) {
                if (senderTextField.getText().equals(Code2.get(x))){
                    for ( y = 0; y < Code2.size() ; y++) {
                        if (receiverTextField.getText().equals( Code2.get(y))){
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            HeadBankCheckBox.setVisible(false);
                            Bank1CheckBox.setVisible(false);
                            Bank3CheckBox.setVisible(false);
                            checkButton.setVisible(false);
                            personText.setText(name2.get(x) +" "+ lastname2.get(x) + " to " + name2.get(y) + " " + lastname2.get(y));
                            errorLabel.setText("");
                            break;
                        }
                        else {
                            errorLabel.setText(" Receiver Code is Wrong! ");
                        }
                    }
                    break;
                }
                else {
                    errorLabel.setText(" Sender Code is Wrong ");
                }

            }
        }
    else if(Bank3CheckBox.isSelected()){
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\TransferCode.txt", Code3);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt", AcountCredit3);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\Name.txt",name3);
            fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\LastName.txt",lastname3);

            for ( a = 0; a < Code3.size() ; a++) {
                if (senderTextField.getText().equals(Code3.get(a))){
                    for ( b = 0; b < Code3.size() ; b++) {
                        if (receiverTextField.getText().equals( Code3.get(b))){
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            HeadBankCheckBox.setVisible(false);
                            Bank1CheckBox.setVisible(false);
                            Bank2CheckBox.setVisible(false);
                            checkButton.setVisible(false);
                            personText.setText(name3.get(a) +" "+ lastname3.get(a) + " to " + name3.get(b) + " " + lastname3.get(b));
                            errorLabel.setText("");
                            break;
                        }
                        else {
                            errorLabel.setText(" Receiver Code is Wrong! ");
                        }
                    }
                    break;
                }
                else {
                    errorLabel.setText(" Sender Code is Wrong ");
                }

            }
        }
        else {
            errorLabel.setText(" Select the Bank !!");
        }


    }
    public void Transfer(){
        if(HeadBankCheckBox.isSelected()){
            try {
                double amount = Double.parseDouble(amountTextField.getText());
                double sender = Double.parseDouble(AcountCredit.get(i));
                double receiver = Double.parseDouble(AcountCredit.get(j));
                if ( amount <= 200  && amount >= 10 ){
                    sender = sender - amount;
                    receiver = receiver + amount;
                    AcountCredit.set(i, String.valueOf(sender));
                    AcountCredit.set(j,String.valueOf(receiver));
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                    for (int m = 0; m < AcountCredit.size() ; m++) {
                     fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",AcountCredit.get(m));
                   }
                    successLabel.setText(" Money Transferred Successfully ");
                    TransferButton.setVisible(false);
                }
                else{
                    errorLabel.setText(" Amount Can transfer between (10 - 200) ");
                }
            }catch (Exception ex){
                errorLabel.setText(" Amount is Wrong !!");
            }

        }
        else if(Bank1CheckBox.isSelected()){
            try {
                double amount = Double.parseDouble(amountTextField.getText());
                double sender = Double.parseDouble(AcountCredit1.get(k));
                double receiver = Double.parseDouble(AcountCredit1.get(h));
                if ( amount <= 200  && amount >= 10 ){
                    sender = sender - amount;
                    receiver = receiver + amount;
                    AcountCredit1.set(k, String.valueOf(sender));
                    AcountCredit1.set(h,String.valueOf(receiver));
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                    for (int m = 0; m < AcountCredit1.size() ; m++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",AcountCredit1.get(m));
                    }
                    successLabel.setText(" Money Transferred Successfully ");
                    TransferButton.setVisible(false);
                }
                else{
                    errorLabel.setText(" Amount Can transfer between (10 - 200) ");
                }
            }catch (Exception ex){
                errorLabel.setText(" Amount is Wrong !!");
            }
        }
        else if (Bank2CheckBox.isSelected()){
            try {
                double amount = Double.parseDouble(amountTextField.getText());
                double sender = Double.parseDouble(AcountCredit2.get(x));
                double receiver = Double.parseDouble(AcountCredit2.get(y));
                if ( amount <= 200  && amount >= 10 ){
                    sender = sender - amount;
                    receiver = receiver + amount;
                    AcountCredit2.set(x, String.valueOf(sender));
                    AcountCredit2.set(y,String.valueOf(receiver));
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                    for (int m = 0; m < AcountCredit2.size() ; m++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",AcountCredit2.get(m));
                    }
                    successLabel.setText(" Money Transferred Successfully ");
                    TransferButton.setVisible(false);
                }
                else{
                    errorLabel.setText(" Amount Can transfer between (10 - 200) ");
                }
            }catch (Exception ex){
                errorLabel.setText(" Amount is Wrong !!");
            }
        }
        else if (Bank3CheckBox.isSelected()){
            try {
                double amount = Double.parseDouble(amountTextField.getText());
                double sender = Double.parseDouble(AcountCredit3.get(a));
                double receiver = Double.parseDouble(AcountCredit3.get(b));
                if ( amount <= 200  && amount >= 10 ){
                    sender = sender - amount;
                    receiver = receiver + amount;
                    AcountCredit3.set( a , String.valueOf(sender));
                    AcountCredit3.set( b ,String.valueOf(receiver));
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                    for (int m = 0; m < AcountCredit3.size() ; m++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",AcountCredit3.get(m));
                    }
                    successLabel.setText(" Money Transferred Successfully ");
                    TransferButton.setVisible(false);
                }
                else{
                    errorLabel.setText(" Amount Can transfer between (10 - 200) ");
                }
            }catch (Exception ex){
                errorLabel.setText(" Amount is Wrong !!");
            }
        }

        else{
            errorLabel.setText(" Select the Bank !!");
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
