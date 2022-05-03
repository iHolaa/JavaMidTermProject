package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
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
    Button Pay;
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

    int i = 0 , k = 0 , j = 0 , h = 0;
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
                        if(AmountTextField.isVisible() == false) {
                            AmountTextField.setVisible(true);
                            AmountTextField.setText(billAmount.get(i));
                        }
                        else{
                            AmountTextField.setVisible(true);
                            AmountTextField.setText(billAmount.get(i + 1));
                        }

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
                            if(AmountTextField.isVisible() == false) {
                                AmountTextField.setVisible(true);
                                AmountTextField.setText(billAmount.get(k));
                            }
                            else{
                                AmountTextField.setVisible(true);
                                AmountTextField.setText(billAmount.get(k + 1));
                            }
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
                            if(AmountTextField.isVisible() == false) {
                                AmountTextField.setVisible(true);
                                AmountTextField.setText(billAmount.get(j));
                            }
                            else{
                                AmountTextField.setVisible(true);
                                AmountTextField.setText(billAmount.get(j + 1));
                            }
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

                            if(AmountTextField.isVisible() == false) {
                                AmountTextField.setVisible(true);
                                AmountTextField.setText(billAmount.get(j));
                            }
                            else{
                                AmountTextField.setVisible(true);
                                AmountTextField.setText(billAmount.get(j + 1));
                            }
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
                fm.FileReader("src\\main\\resources\\Files\\DefineBill\\HeadBank\\credit.txt", userCredit);
                double credit1 = Double.parseDouble(userCredit.get(i));
                double billAmount1 = Double.parseDouble(AmountTextField.getText());
                double originalCredit1 = credit1 - billAmount1;

                if (originalCredit1 > 20) {
                    fm2.FileWriter("src\\main\\resources\\Files\\DefineBill\\HeadBank\\credit.txt", String.valueOf(originalCredit1));
                    fm2.FileWriter("src\\main\\resources\\Files\\DefineBill\\HeadBank\\BillAmount.txt", "0");
                    AmountTextField.setText("0");
                    successLabel.setText(" Bill Successfully Payed ");
                } else {
                    errorLabel.setText(" Your Credit is Not Enough !! ");
                }
            }catch (Exception ex){
                successLabel.setText(" Return to Menu ");
            }

        }
        else if(Bank1CheckBox.isSelected()) {
            try {
                fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank1\\credit.txt", userCredit);
                double credit2 = Double.parseDouble(userCredit.get(k));
                double billAmount2 = Double.parseDouble(AmountTextField.getText());
                double originalCredit2 = credit2 - billAmount2;

                if (originalCredit2 > 20) {
                    fm2.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank1\\credit.txt", String.valueOf(originalCredit2));
                    fm2.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank1\\BillAmount.txt", "0");
                    AmountTextField.setText("0");
                    successLabel.setText(" Bill Successfully Payed ");
                } else {
                    errorLabel.setText(" Your Credit is Not Enough !! ");
                }
            }catch (Exception ex){
                successLabel.setText(" Return to Menu ");
            }

        }
        else if(Bank2CheckBox.isSelected()) {
            try {
                fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank2\\credit.txt", userCredit);
                double credit3 = Double.parseDouble(userCredit.get(j));
                double billAmount3 = Double.parseDouble(AmountTextField.getText());
                double originalCredit3 = credit3 - billAmount3;

                if (originalCredit3 > 20) {
                    fm2.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank2\\credit.txt", String.valueOf(originalCredit3));
                    fm2.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank2\\BillAmount.txt", "0");
                    AmountTextField.setText("0");
                    successLabel.setText(" Bill Successfully Payed ");
                }
                else {
                    errorLabel.setText(" Your Credit is Not Enough !! ");
                }
            }catch (Exception ex){
                successLabel.setText(" Return to Menu ");
            }

        }
        else if(Bank1CheckBox.isSelected()) {
            try {
                fm.FileReader("src\\main\\resources\\Files\\DefineBill\\Bank3\\credit.txt", userCredit);
                double credit4 = Double.parseDouble(userCredit.get(h));
                double billAmount4 = Double.parseDouble(AmountTextField.getText());
                double originalCredit4 = credit4 - billAmount4;

                if (originalCredit4 > 20) {
                    fm2.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank3\\credit.txt", String.valueOf(originalCredit4));
                    fm2.FileWriter("src\\main\\resources\\Files\\DefineBill\\Bank3\\BillAmount.txt", "0");
                    AmountTextField.setText("0");
                    successLabel.setText(" Bill Successfully Payed ");
                }
                else {
                    errorLabel.setText(" Your Credit is Not Enough !! ");
                }
            }catch (Exception ex){
                successLabel.setText(" Return to Menu ");
            }
        }
        else {
            errorLabel.setText(" Select Bank CheckBox !! ");
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
