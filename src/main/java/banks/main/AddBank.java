package banks.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddBank {
    Main main = new Main();
    FileManeger2 fm2 = new FileManeger2();
    @FXML
    CheckBox Bank1CheckBox;
    @FXML
    CheckBox Bank2CheckBox;
    @FXML
    CheckBox Bank3CheckBox;
    @FXML
    CheckBox shabaCheckBox;
    @FXML
    TextField bankBudgetTextField;
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Button MenuButton;

    String temp1 = "",temp2 = "",temp3 = "";
    public void AddBankButton(){

        try{

            Double x = Double.parseDouble(bankBudgetTextField.getText());

            //for Bank1
            if(Bank1CheckBox.isSelected() && x >= 100000 ) {
                fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank1\\BankBudget.txt", bankBudgetTextField.getText());
                label2.setText(" Bank1 added Successfully ");
                temp1 = "yes";
                if (shabaCheckBox.isSelected()) {
                    fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank1\\Shaba.txt", "yes");
                }
                else fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank1\\Shaba.txt", "no");
            }

            //for Bank2
            else if (Bank2CheckBox.isSelected() && x >= 100000) {
                fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank2\\BankBudget.txt", bankBudgetTextField.getText());
                label2.setText(" Bank2 added Successfully ");
                temp2 = "yes";
                if (shabaCheckBox.isSelected()) {
                    fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank2\\Shaba.txt", "yes");
                }
                else fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank2\\Shaba.txt", "no");
                }

            //for Bank3
            else if (Bank3CheckBox.isSelected() && x >= 100000) {
                fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank3\\BankBudget.txt", bankBudgetTextField.getText());
                label2.setText(" Bank3 added Successfully ");
                temp3 = "yes";
                if (shabaCheckBox.isSelected()) {
                    fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank3\\Shaba.txt", "yes");
                }
                else fm2.FileWriter("src\\main\\resources\\Files\\Banks\\Bank3\\Shaba.txt", "no");
            }
            else if (Bank1CheckBox.isSelected() == false && Bank2CheckBox.isSelected() == false && Bank3CheckBox.isSelected() == false){
                label1.setText(" Select the Bank ! ");
            }
            else {
                label1.setText(" Bank budget Most be more than 100000$ ");
            }
        }catch (Exception ex){
            if(bankBudgetTextField.getText().equals("")) {
                label1.setText(" Budget is Empty!! ");
            }else label1.setText(" Budget Cant be an String!! ");
          }
        if(temp1.equals("yes") && temp2.equals("yes") && temp3.equals("yes")){
            MenuButton.setVisible(true);
            bankBudgetTextField.setEditable(false);
        }

    }

    public void GoToMenu() {
        try {
            main.changeScene("Menu.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void Change1(){
        if (Bank1CheckBox.isSelected()) {
            Bank2CheckBox.setSelected(false);
            Bank3CheckBox.setSelected(false);
            shabaCheckBox.setSelected(false);
            bankBudgetTextField.setText("");
            label1.setText("");
            label2.setText("");
        }
    }
    public void Change2() {
        if (Bank2CheckBox.isSelected()) {
            Bank1CheckBox.setSelected(false);
            Bank3CheckBox.setSelected(false);
            shabaCheckBox.setSelected(false);
            bankBudgetTextField.setText("");
            label1.setText("");
            label2.setText("");
        }
    }
    public void Change3(){
        if(Bank3CheckBox.isSelected()){
            Bank1CheckBox.setSelected(false);
            Bank2CheckBox.setSelected(false);
            shabaCheckBox.setSelected(false);
            bankBudgetTextField.setText("");
            label1.setText("");
            label2.setText("");
        }
    }


}
