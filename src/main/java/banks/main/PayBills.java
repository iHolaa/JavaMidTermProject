package banks.main;

import javafx.fxml.FXML;
import javafx.scene.chart.ScatterChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class PayBills {
    Main main = new Main();
    FileManeger fm = new FileManeger();
    FileManeger2 fm2 = new FileManeger2();
    @FXML
    CheckBox HeadBankCheckBox ,Bank1CheckBox , Bank2CheckBox ,Bank3CheckBox ;
    @FXML
    TextField billIDTextField , NameTextField ,LastnameTextField ,AmountTextField ;
    @FXML
    Text nameText , lastnameText , AmountText ;
    @FXML
    Button Pay , checkButton ;
    @FXML
    Label errorLabel , successLabel;
    ArrayList<String> HeadBankID = new ArrayList<>();
    ArrayList<String> Bank1ID = new ArrayList<>();
    ArrayList<String> Bank2ID = new ArrayList<>();
    ArrayList<String> Bank3ID = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> lastname = new ArrayList<>();
    ArrayList<String> billAmount = new ArrayList<>();
    ArrayList<String> userCredit = new ArrayList<>();

    int i , k  , j  , h ;
    public void CheckBillButton() {

        errorLabel.setText("");

        if (HeadBankCheckBox.isSelected()) {
            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\HeadBank\\BillID.txt", HeadBankID);
            for (i = 0; i < HeadBankID.size(); i++) {
                if (billIDTextField.getText().equals(HeadBankID.get(i))) {
                    try {
                        fm.FileReader("src\\main\\resources\\Files\\DefineBill\\HeadBank\\Name.txt",name);
                        fm.FileReader("src\\main\\resources\\Files\\DefineBill\\HeadBank\\LastName.txt",lastname);
                        fm.FileReader("src\\main\\resources\\Files\\DefineBill\\HeadBank\\BillAmount.txt",billAmount);
                        Pay.setVisible(true);
                        nameText.setVisible(true);
                        lastnameText.setVisible(true);
                        AmountText.setVisible(true);
                        NameTextField.setVisible(true);
                        LastnameTextField.setVisible(true);
                        NameTextField.setText(name.get(i));
                        LastnameTextField.setText(lastname.get(i));
                        AmountTextField.setVisible(true);
                        AmountTextField.setText(billAmount.get(i));
                        checkButton.setVisible(false);

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    errorLabel.setText(" ID is not Exist !");
                }
            }
        }
        else if (Bank1CheckBox.isSelected()) {
                fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank1\\BillID.txt", Bank1ID);
                for ( k = 0; k < Bank1ID.size(); k++) {
                    if (billIDTextField.getText().equals(Bank1ID.get(k))) {
                        try {
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank1\\Name.txt",name);
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank1\\LastName.txt",lastname);
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank1\\BillAmount.txt",billAmount);
                            Pay.setVisible(true);
                            nameText.setVisible(true);
                            lastnameText.setVisible(true);
                            AmountText.setVisible(true);
                            NameTextField.setVisible(true);
                            LastnameTextField.setVisible(true);
                            NameTextField.setText(name.get(k));
                            LastnameTextField.setText(lastname.get(k));
                            AmountTextField.setVisible(true);
                            AmountTextField.setText(billAmount.get(k));
                            checkButton.setVisible(false);

                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        errorLabel.setText(" ID is not Exist !");
                    }
                }
            }
        else if (Bank2CheckBox.isSelected()) {
                fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank2\\BillID.txt", Bank1ID);
                for ( j = 0; j < Bank2ID.size(); j++) {
                    if (billIDTextField.getText().equals(Bank2ID.get(j))) {
                        try {
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank2\\Name.txt",name);
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank2\\LastName.txt",lastname);
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank2\\BillAmount.txt",billAmount);
                            Pay.setVisible(true);
                            nameText.setVisible(true);
                            lastnameText.setVisible(true);
                            AmountText.setVisible(true);
                            NameTextField.setVisible(true);
                            LastnameTextField.setVisible(true);
                            NameTextField.setText(name.get(j));
                            LastnameTextField.setText(lastname.get(j));
                            AmountTextField.setVisible(true);
                            AmountTextField.setText(billAmount.get(j));
                            checkButton.setVisible(false);

                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        errorLabel.setText(" ID is not Exist !");
                    }
                }
            }
        else if (Bank3CheckBox.isSelected()) {
                fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank3\\BillID.txt", Bank1ID);
                for (h = 0; h < Bank3ID.size(); h++) {
                    if (billIDTextField.getText().equals(Bank3ID.get(h))) {
                        try {
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank3\\Name.txt",name);
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank3\\LastName.txt",lastname);
                            fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank3\\BillAmount.txt",billAmount);
                            Pay.setVisible(true);
                            nameText.setVisible(true);
                            lastnameText.setVisible(true);
                            AmountText.setVisible(true);
                            NameTextField.setVisible(true);
                            LastnameTextField.setVisible(true);
                            NameTextField.setText(name.get(h));
                            LastnameTextField.setText(lastname.get(h));
                            AmountTextField.setVisible(true);
                            AmountTextField.setText(billAmount.get(j));
                            checkButton.setVisible(false);

                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        errorLabel.setText(" ID is not Exist !");
                    }
                }
            }
        else {
            errorLabel.setText(" Select the Bank !!! ");
        }
    }

    public void PayBillButton(){
        if(HeadBankCheckBox.isSelected()) {
            try {
                fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt", userCredit);
                double credit1 = Double.parseDouble(userCredit.get(i -1));
                double billAmount1 = Double.parseDouble(AmountTextField.getText());
                credit1 = credit1 - billAmount1;

                if ( credit1 >= 20) {
                    userCredit.set( i - 1  , String.valueOf(credit1));
                    billAmount.set( i - 1 ,"0");
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\DefineBill\\HeadBank\\BillAmount.txt"));
                    for (int l = 0; l < userCredit.size() ; l++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",userCredit.get(l));
                        fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\HeadBank\\BillAmount.txt",billAmount.get(l));
                    }
                    AmountTextField.setText("0");
                    successLabel.setText(" Bill Successfully Payed ");
                    Pay.setVisible(false);
                } else {
                    errorLabel.setText(" Your Credit is Not Enough !! ");
                }
            }catch (Exception ex){
                successLabel.setText(" Return to Menu ");
                Pay.setVisible(false);
            }

        }//end of if
        else if(Bank1CheckBox.isSelected()) {
            try {
                fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt", userCredit);
                double credit1 = Double.parseDouble(userCredit.get( k - 1 ));
                double billAmount1 = Double.parseDouble(AmountTextField.getText());
                credit1 = credit1 - billAmount1;

                if ( credit1 >= 20) {
                    userCredit.set( k - 1 , String.valueOf(credit1));
                    billAmount.set( k - 1 ,"0");
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\DefineBill\\Bank1\\BillAmount.txt"));
                    for (int l = 0; l < userCredit.size() ; l++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",userCredit.get(l));
                        fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank1\\BillAmount.txt",billAmount.get(l));
                    }
                    AmountTextField.setText("0");
                    successLabel.setText(" Bill Successfully Payed ");
                    Pay.setVisible(false);
                } else {
                    errorLabel.setText(" Your Credit is Not Enough !! ");
                }
            }catch (Exception ex){
                successLabel.setText(" Return to Menu ");
                Pay.setVisible(false);
            }

        }//end of else if
        else if(Bank2CheckBox.isSelected()) {
            try {
                fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt", userCredit);
                double credit1 = Double.parseDouble(userCredit.get(j - 1 ));
                double billAmount1 = Double.parseDouble(AmountTextField.getText());
                credit1 = credit1 - billAmount1;

                if ( credit1 >= 20) {
                    userCredit.set( j - 1 , String.valueOf(credit1));
                    billAmount.set( j - 1 ,"0");
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\DefineBill\\Bank2\\BillAmount.txt"));
                    for (int l = 0; l < userCredit.size() ; l++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",userCredit.get(l));
                        fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank2\\BillAmount.txt",billAmount.get(l));
                    }
                    AmountTextField.setText("0");
                    successLabel.setText(" Bill Successfully Payed ");
                    Pay.setVisible(false);
                } else {
                    errorLabel.setText(" Your Credit is Not Enough !! ");
                }
            }catch (Exception ex){
                successLabel.setText(" Return to Menu ");
                Pay.setVisible(false);
            }
        }//end of else if
        else if(Bank3CheckBox.isSelected()) {
            try {
                fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt", userCredit);
                double credit1 = Double.parseDouble(userCredit.get(h - 1));
                double billAmount1 = Double.parseDouble(AmountTextField.getText());
                credit1 = credit1 - billAmount1;

                if ( credit1 >= 20) {
                    userCredit.set( h - 1 , String.valueOf(credit1));
                    billAmount.set( h - 1 ,"0");
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                    Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\DefineBill\\Bank3\\BillAmount.txt"));
                    for (int l = 0; l < userCredit.size() ; l++) {
                        fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",userCredit.get(l));
                        fm.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank3\\BillAmount.txt",billAmount.get(l));
                    }
                    AmountTextField.setText("0");
                    successLabel.setText(" Bill Successfully Payed ");
                    Pay.setVisible(false);
                } else {
                    errorLabel.setText(" Your Credit is Not Enough !! ");
                }
            }catch (Exception ex){
                successLabel.setText(" Return to Menu ");
                Pay.setVisible(false);
            }
        }//end of else if
        else {
            errorLabel.setText(" Select Bank CheckBox !! ");
        }//end of else
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
