package banks.main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RequestInHeadBank {

    Main main = new Main();
    FileManeger fm = new FileManeger();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> lastName = new ArrayList<>();
    ArrayList<String> age = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> bank = new ArrayList<>();
    @FXML
     TextField ReqNameTextField ;
    @FXML
     TextField ReqLastnameTextField;
    @FXML
     TextField ReqAgeTextField;
    @FXML
     TextField ReqPasswordTextField;
    @FXML
    TextField ReqBankNameTextField;

    @FXML
    Label label1;
    @FXML
    Label label2;

    int i = 0 ;
    public void LoadUserRequest() throws IOException {
        label2.setText("");
        label1.setText("");
        //HeadBank FileRead
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\HeadBank\\Name.txt", name);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\HeadBank\\LastName.txt", lastName);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\HeadBank\\Age.txt", age);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\HeadBank\\Password.txt", password);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\HeadBank\\Bank.txt", bank);
        //Bank1
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank1\\Name.txt", name);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank1\\LastName.txt", lastName);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank1\\Age.txt", age);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank1\\Password.txt", password);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank1\\Bank.txt", bank);
        //Bank2
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank2\\Name.txt", name);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank2\\LastName.txt", lastName);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank2\\Age.txt", age);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank2\\Password.txt", password);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank2\\Bank.txt", bank);
        //Bank3
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank3\\Name.txt", name);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank3\\LastName.txt", lastName);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank3\\Age.txt", age);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank3\\Password.txt", password);
        fm.FileReader("D:\\JavaBank\\Main\\Files\\User\\UserRequest\\Bank3\\Bank.txt", bank);

        ReqNameTextField.setText(name.get(i));
        ReqLastnameTextField.setText(lastName.get(i));
        ReqAgeTextField.setText(age.get(i));
        ReqPasswordTextField.setText(password.get(i));
        ReqBankNameTextField.setText(bank.get(i));

        i++;
    }
    public void AcceptRequest() throws IOException {
        if(ReqBankNameTextField.getText().equals("HeadBank")){
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\HeadBank\\Name.txt",ReqNameTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\HeadBank\\LastName.txt",ReqLastnameTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\HeadBank\\Age.txt",ReqAgeTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\HeadBank\\Password.txt",ReqPasswordTextField.getText().trim());
            label2.setText(" User Added Successfully ");
        }
        else if(ReqBankNameTextField.getText().equals("Bank1")){
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank1\\Name.txt",ReqNameTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank1\\LastName.txt",ReqLastnameTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank1\\Age.txt",ReqAgeTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank1\\Password.txt",ReqPasswordTextField.getText().trim());
            label2.setText(" User Added Successfully ");
        }
        else if(ReqBankNameTextField.getText().equals("Bank2")){
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank2\\Name.txt",ReqNameTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank2\\LastName.txt",ReqLastnameTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank2\\Age.txt",ReqAgeTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank2\\Password.txt",ReqPasswordTextField.getText().trim());
            label2.setText(" User Added Successfully ");
        }
        else if(ReqBankNameTextField.getText().equals("Bank3")){
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank3\\Name.txt",ReqNameTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank3\\LastName.txt",ReqLastnameTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank3\\Age.txt",ReqAgeTextField.getText().trim());
            fm.FileWriter("D:\\JavaBank\\Main\\Files\\User\\AddUser\\Bank3\\Password.txt",ReqPasswordTextField.getText().trim());
            label2.setText(" User Added Successfully ");
        }

    }
    public void DeclineRequest(){



    }

    public void ReturnToMenu(){
        try{
            main.changeScene("Menu.fxml");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void ReturnToHeadBank(){
        try{
            main.changeScene("HeadBank.fxml");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}