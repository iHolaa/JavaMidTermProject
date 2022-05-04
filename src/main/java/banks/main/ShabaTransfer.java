package banks.main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ShabaTransfer implements Initializable {
    Main main = new Main();
    FileManeger fm = new FileManeger();
    @FXML
    TextField amountTextField,receiverTextField ,senderTextField;
    @FXML
    Label errorLabel , successLabel;
    @FXML
    Text transferAmountText , personText ;
    @FXML
    Button TransferButton , checkButton;
    ArrayList<String> Bank1 = new ArrayList<>();
    ArrayList<String> Bank2 = new ArrayList<>();
    ArrayList<String> Bank3 = new ArrayList<>();

    //For HeadBank
    ArrayList<String> headBankShabaCode = new ArrayList<>();
    ArrayList<String> acountCredit  = new ArrayList<>();
    ArrayList<String> name  = new ArrayList<>();
    ArrayList<String> lastname = new ArrayList<>();

    // For Bank1
    ArrayList<String> bank1ShabaCode = new ArrayList<>();
    ArrayList<String> acountCredit1   = new ArrayList<>();
    ArrayList<String> name1  = new ArrayList<>();
    ArrayList<String> lastname1 = new ArrayList<>();

    //For Bank2
    ArrayList<String> bank2ShabaCode = new ArrayList<>();
    ArrayList<String> acountCredit2 = new ArrayList<>();
    ArrayList<String> name2  = new ArrayList<>();
    ArrayList<String> lastname2 = new ArrayList<>();

    //For Bank3
    ArrayList<String> bank3ShabaCode = new ArrayList<>();
    ArrayList<String> acountCredit3 = new ArrayList<>();
    ArrayList<String> name3  = new ArrayList<>();
    ArrayList<String> lastname3 = new ArrayList<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        fm.FileReader("src\\main\\resources\\Files\\Banks\\Bank1\\Shaba.txt",Bank1);
        fm.FileReader("src\\main\\resources\\Files\\Banks\\Bank2\\Shaba.txt",Bank2);
        fm.FileReader("src\\main\\resources\\Files\\Banks\\Bank3\\Shaba.txt",Bank3);
        //HeadBank
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\ShabaCode.txt",headBankShabaCode);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",acountCredit);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\Name.txt",name);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\LastName.txt",lastname);
        //Bank1
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\ShabaCode.txt", bank1ShabaCode);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt", acountCredit1);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\Name.txt", name1);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\LastName.txt", lastname1);
        //Bank2
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\ShabaCode.txt", bank2ShabaCode);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt", acountCredit2);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\Name.txt", name2);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\LastName.txt", lastname2);
        //Bank3
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\ShabaCode.txt", bank3ShabaCode);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt", acountCredit3);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\Name.txt", name3);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\LastName.txt", lastname3);

    }

    String sender;
    String receiver;
    int i , j;
    public void CheckTransfer(){
        System.out.println(headBankShabaCode);
        System.out.println(bank1ShabaCode);
        System.out.println(bank2ShabaCode);
        System.out.println(bank3ShabaCode);
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        try {

            for (i = 0; i < headBankShabaCode.size(); i++) {

                if (senderTextField.getText().equals(headBankShabaCode.get(i))) {
                    for (j = 0; j < headBankShabaCode.size(); j++) {
                        if (receiverTextField.getText().equals(headBankShabaCode.get(j)) && i != j) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name.get(i) + " " + lastname.get(i) + " to " + name.get(j) + " " + lastname.get(j));
                            sender = "headbank";
                            receiver = "headbank";
                            errorLabel.setText("");
                            break;
                        } else if (Bank1.get(0).equals("yes") && receiverTextField.getText().equals(bank1ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name.get(i) + " " + lastname.get(i) + " to " + name1.get(j) + " " + lastname1.get(j));
                            sender = "headbank";
                            receiver = "bank1";
                            errorLabel.setText("");
                            break;
                        } else if (Bank2.get(0).equals("yes") && receiverTextField.getText().equals(bank2ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name.get(i) + " " + lastname.get(i) + " to " + name2.get(j) + " " + lastname2.get(j));
                            sender = "headbank";
                            receiver = "bank2";
                            errorLabel.setText("");
                            break;
                        } else if (Bank3.get(0).equals("yes") && receiverTextField.getText().equals(bank3ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name.get(i) + " " + lastname.get(i) + " to " + name3.get(j) + " " + lastname3.get(j));
                            sender = "headbank";
                            receiver = "bank3";
                            errorLabel.setText("");
                            break;
                        } else {
                            errorLabel.setText(" Receiver ID is Wrong !!");
                        }
                    }//end of for
                    break;
                }//end of if

                else if (Bank1.get(0).equals("yes") && senderTextField.getText().equals(bank1ShabaCode.get(i))) {
                    for (j = 0; j < headBankShabaCode.size(); j++) {
                        if (receiverTextField.getText().equals(bank1ShabaCode.get(j)) && i != j) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name1.get(i) + " " + lastname1.get(i) + " to " + name1.get(j) + " " + lastname1.get(j));
                            sender = "bank1";
                            receiver = "bank1";
                            errorLabel.setText("");
                            break;
                        } else if (receiverTextField.getText().equals(headBankShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name1.get(i) + " " + lastname1.get(i) + " to " + name.get(j) + " " + lastname.get(j));
                            sender = "bank1";
                            receiver = "headbank";
                            errorLabel.setText("");
                            break;
                        } else if (Bank2.get(0).equals("yes") && receiverTextField.getText().equals(bank2ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name1.get(i) + " " + lastname1.get(i) + " to " + name2.get(j) + " " + lastname2.get(j));
                            sender = "bank1";
                            receiver = "bank2";
                            errorLabel.setText("");
                            break;
                        } else if (Bank3.get(0).equals("yes") && receiverTextField.getText().equals(bank3ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name1.get(i) + " " + lastname1.get(i) + " to " + name3.get(j) + " " + lastname3.get(j));
                            sender = "bank1";
                            receiver = "bank3";
                            errorLabel.setText("");
                            break;
                        } else {
                            errorLabel.setText(" Receiver ID is Wrong !!");
                        }
                    }//end of for
                    break;
                }//end of else if


                else if (Bank2.get(0).equals("yes") && senderTextField.getText().equals(bank2ShabaCode.get(i))) {
                    for (j = 0; j < headBankShabaCode.size(); j++) {
                        if (receiverTextField.getText().equals(bank2ShabaCode.get(j)) && i != j) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name2.get(i) + " " + lastname2.get(i) + " to " + name2.get(j) + " " + lastname2.get(j));
                            sender = "bank2";
                            receiver = "bank2";
                            errorLabel.setText("");
                            break;
                        } else if (receiverTextField.getText().equals(headBankShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name2.get(i) + " " + lastname2.get(i) + " to " + name.get(j) + " " + lastname.get(j));
                            sender = "bank2";
                            receiver = "headbank";
                            errorLabel.setText("");
                            break;
                        } else if (Bank1.get(0).equals("yes") && receiverTextField.getText().equals(bank1ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name2.get(i) + " " + lastname2.get(i) + " to " + name1.get(j) + " " + lastname1.get(j));
                            sender = "bank2";
                            receiver = "bank1";
                            errorLabel.setText("");
                            break;
                        } else if (Bank3.get(0).equals("yes") && receiverTextField.getText().equals(bank3ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name2.get(i) + " " + lastname2.get(i) + " to " + name3.get(j) + " " + lastname3.get(j));
                            sender = "bank2";
                            receiver = "bank3";
                            errorLabel.setText("");
                            break;
                        } else {
                            errorLabel.setText(" Receiver ID is Wrong !!");
                        }
                    }//end of for
                    break;
                }//end of else if


                else if (Bank3.get(0).equals("yes") && senderTextField.getText().equals(bank3ShabaCode.get(i))) {
                    for (j = 0; j < headBankShabaCode.size(); j++) {
                        if (receiverTextField.getText().equals(bank3ShabaCode.get(j)) && i != j) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name3.get(i) + " " + lastname3.get(i) + " to " + name3.get(j) + " " + lastname3.get(j));
                            sender = "bank3";
                            receiver = "bank3";
                            errorLabel.setText("");
                            break;
                        } else if (receiverTextField.getText().equals(headBankShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name3.get(i) + " " + lastname3.get(i) + " to " + name.get(j) + " " + lastname.get(j));
                            sender = "bank3";
                            receiver = "headbank";
                            errorLabel.setText("");
                            break;
                        } else if (Bank1.get(0).equals("yes") && receiverTextField.getText().equals(bank1ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name3.get(i) + " " + lastname3.get(i) + " to " + name1.get(j) + " " + lastname1.get(j));
                            sender = "bank3";
                            receiver = "bank1";
                            errorLabel.setText("");
                            break;
                        } else if (Bank2.get(0).equals("yes") && receiverTextField.getText().equals(bank2ShabaCode.get(j))) {
                            transferAmountText.setVisible(true);
                            amountTextField.setVisible(true);
                            TransferButton.setVisible(true);
                            receiverTextField.setEditable(false);
                            senderTextField.setEditable(false);
                            checkButton.setVisible(false);
                            personText.setText(name3.get(i) + " " + lastname3.get(i) + " to " + name2.get(j) + " " + lastname2.get(j));
                            sender = "bank3";
                            receiver = "bank2";
                            errorLabel.setText("");
                            break;
                        } else {
                            errorLabel.setText(" Receiver ID is Wrong !!");
                        }
                    }//end of for
                    break;
                }//end of else if
                else {
                    errorLabel.setText(" Sender ID is Wrong !!");
                }
            }//end of for
        }catch (Exception ex){
            return;
        }
    }//end of Check Button Method




    public void Transfer(){

     try {
        double amount = Double.parseDouble(amountTextField.getText());

            if (amount >= 10 && amount <= 1000 ) {

            if (sender.equals("headbank")) {
                    if (receiver.equals("headbank")){
                        try {
                            double sender = Double.parseDouble(acountCredit.get(i));
                            double receiver = Double.parseDouble(acountCredit.get(j));
                            sender = sender - amount;
                            receiver = receiver + amount;
                            acountCredit.set(i, String.valueOf(sender));
                            acountCredit.set(j,String.valueOf(receiver));
                            Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                            for (int m = 0; m < acountCredit.size() ; m++) {
                                fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",acountCredit.get(m));
                            }
                            successLabel.setText(" Money Transferred Successfully ");
                            TransferButton.setVisible(false);
                        }catch (Exception ex){
                            return;
                        }
                    }
                    else if(receiver.equals("bank1")){
                        try {
                            double sender = Double.parseDouble(acountCredit.get(i));
                            double receiver = Double.parseDouble(acountCredit1.get(j));
                            sender = sender - amount;
                            receiver = receiver + amount;
                            acountCredit.set(i, String.valueOf(sender));
                            acountCredit1.set(j,String.valueOf(receiver));
                            Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                            Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                            for (int m = 0; m < acountCredit.size() ; m++)
                                fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",acountCredit.get(m));
                            for (int k = 0; k < acountCredit1.size() ; k++)
                                fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit1.get(k));

                            successLabel.setText(" Money Transferred Successfully ");
                            TransferButton.setVisible(false);
                        }catch (Exception ex){
                            return;
                        }
                    }
                    else if(receiver.equals("bank2")){
                        try {
                            double sender = Double.parseDouble(acountCredit.get(i));
                            double receiver = Double.parseDouble(acountCredit2.get(j));
                            sender = sender - amount;
                            receiver = receiver + amount;
                            acountCredit.set(i, String.valueOf(sender));
                            acountCredit2.set(j,String.valueOf(receiver));
                            Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                            Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                            for (int m = 0; m < acountCredit.size() ; m++)
                                fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",acountCredit.get(m));
                            for (int k = 0; k < acountCredit2.size() ; k++)
                                fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit2.get(k));

                            successLabel.setText(" Money Transferred Successfully ");
                            TransferButton.setVisible(false);
                        }catch (Exception ex){
                            return;
                        }
                    }
                    else if(receiver.equals("bank3")){
                        try {
                            double sender = Double.parseDouble(acountCredit.get(i));
                            double receiver = Double.parseDouble(acountCredit3.get(j));
                            sender = sender - amount;
                            receiver = receiver + amount;
                            acountCredit.set(i, String.valueOf(sender));
                            acountCredit3.set(j,String.valueOf(receiver));
                            Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                            Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                            for (int m = 0; m < acountCredit.size() ; m++)
                                fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",acountCredit.get(m));
                            for (int k = 0; k < acountCredit3.size() ; k++)
                                fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit3.get(k));

                            successLabel.setText(" Money Transferred Successfully ");
                            TransferButton.setVisible(false);
                        }catch (Exception ex){
                            return;
                        }
                    }//end of else if

            }// end of if

            else if (sender.equals("bank1")) {

                 if (receiver.equals("bank1")){
                    try {
                        double sender = Double.parseDouble(acountCredit1.get(i));
                        double receiver = Double.parseDouble(acountCredit1.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit1.set(i, String.valueOf(sender));
                        acountCredit1.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit1.size() ; m++) {
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit1.get(m));
                        }
                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("headbank")){
                    try {
                        double sender = Double.parseDouble(acountCredit1.get(i));
                        double receiver = Double.parseDouble(acountCredit.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit1.set(i, String.valueOf(sender));
                        acountCredit.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit1.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit1.get(m));
                        for (int k = 0; k < acountCredit.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",acountCredit.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("bank2")){
                    try {
                        double sender = Double.parseDouble(acountCredit1.get(i));
                        double receiver = Double.parseDouble(acountCredit2.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit1.set(i, String.valueOf(sender));
                        acountCredit2.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit1.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit1.get(m));
                        for (int k = 0; k < acountCredit2.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",acountCredit2.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("bank3")){
                    try {
                        double sender = Double.parseDouble(acountCredit1.get(i));
                        double receiver = Double.parseDouble(acountCredit3.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit1.set(i, String.valueOf(sender));
                        acountCredit3.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit1.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit1.get(m));
                        for (int k = 0; k < acountCredit3.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",acountCredit3.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }//end of else if

            }//end of else if

            else if (sender.equals("bank2")) {
                if (receiver.equals("bank2")){
                    try {
                        double sender = Double.parseDouble(acountCredit2.get(i));
                        double receiver = Double.parseDouble(acountCredit2.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit2.set(i, String.valueOf(sender));
                        acountCredit2.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit2.size() ; m++) {
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",acountCredit1.get(m));
                        }
                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("headbank")){
                    try {
                        double sender = Double.parseDouble(acountCredit2.get(i));
                        double receiver = Double.parseDouble(acountCredit.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit2.set(i, String.valueOf(sender));
                        acountCredit.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit2.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",acountCredit1.get(m));
                        for (int k = 0; k < acountCredit.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",acountCredit.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("bank1")){
                    try {
                        double sender = Double.parseDouble(acountCredit2.get(i));
                        double receiver = Double.parseDouble(acountCredit1.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit2.set(i, String.valueOf(sender));
                        acountCredit1.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit2.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",acountCredit2.get(m));
                        for (int k = 0; k < acountCredit1.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit1.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("bank3")){
                    try {
                        double sender = Double.parseDouble(acountCredit2.get(i));
                        double receiver = Double.parseDouble(acountCredit3.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit2.set(i, String.valueOf(sender));
                        acountCredit3.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit2.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",acountCredit2.get(m));
                        for (int k = 0; k < acountCredit3.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",acountCredit3.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }//end of else if
            }//end of else if

            else if (sender.equals("bank3")) {
                if (receiver.equals("bank3")){
                    try {
                        double sender = Double.parseDouble(acountCredit3.get(i));
                        double receiver = Double.parseDouble(acountCredit3.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit3.set(i, String.valueOf(sender));
                        acountCredit3.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit3.size() ; m++) {
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",acountCredit3.get(m));
                        }
                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("headbank")){
                    try {
                        double sender = Double.parseDouble(acountCredit3.get(i));
                        double receiver = Double.parseDouble(acountCredit.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit3.set(i, String.valueOf(sender));
                        acountCredit.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit3.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",acountCredit3.get(m));
                        for (int k = 0; k < acountCredit.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\HeadBank\\AccountCredit.txt",acountCredit.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("bank2")){
                    try {
                        double sender = Double.parseDouble(acountCredit3.get(i));
                        double receiver = Double.parseDouble(acountCredit2.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit3.set(i, String.valueOf(sender));
                        acountCredit2.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit3.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",acountCredit3.get(m));
                        for (int k = 0; k < acountCredit2.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank2\\AccountCredit.txt",acountCredit2.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }
                else if(receiver.equals("bank1")){
                    try {
                        double sender = Double.parseDouble(acountCredit3.get(i));
                        double receiver = Double.parseDouble(acountCredit1.get(j));
                        sender = sender - amount;
                        receiver = receiver + amount;
                        acountCredit3.set(i, String.valueOf(sender));
                        acountCredit1.set(j,String.valueOf(receiver));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt"));
                        Files.deleteIfExists(Path.of("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt"));
                        for (int m = 0; m < acountCredit3.size() ; m++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",acountCredit3.get(m));
                        for (int k = 0; k < acountCredit1.size() ; k++)
                            fm.FileWriter("src\\main\\resources\\Files\\User\\AddUser\\Bank1\\AccountCredit.txt",acountCredit1.get(k));

                        successLabel.setText(" Money Transferred Successfully ");
                        TransferButton.setVisible(false);
                    }catch (Exception ex){
                        return;
                    }
                }//end of else if

            }//end of else if

        }//end of if
        else{
             errorLabel.setText(" Amount Can transfer between (10 - 400) ");
          }
        }catch (Exception ex){
            errorLabel.setText(" Amount is Wrong !!");
        }

    }//end of Transfer Method


    public void ReturnToMenu(){
        try {
            main.changeScene("Menu.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
