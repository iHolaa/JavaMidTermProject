package banks.main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Bank3UserInformationController implements Initializable {
    Main main = new Main();
    FileManeger fm = new FileManeger();
    @FXML
    private TableView<UserInformation> table;
    @FXML
    TableColumn<UserInformation,String> firstNameColumn;
    @FXML
    TableColumn<UserInformation,String> lastNameColumn;
    @FXML
    TableColumn<UserInformation,String> ageColumn;
    @FXML
    TableColumn<UserInformation,String> moneyColumn;
    ArrayList<String> firstName = new ArrayList<>();
    ArrayList<String> lastName = new ArrayList<>();
    ArrayList<String> age = new ArrayList<>();
    ArrayList<String> money = new ArrayList<>();

    ObservableList list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\Name.txt",firstName);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\LastName.txt",lastName);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\Age.txt",age);
        fm.FileReader("src\\main\\resources\\Files\\User\\AddUser\\Bank3\\AccountCredit.txt",money);

        for (int i = 0; i < firstName.size() ; i++)
            list.addAll(new UserInformation(firstName.get(i),lastName.get(i),age.get(i),money.get(i)));

        firstNameColumn.setCellValueFactory(new PropertyValueFactory<UserInformation,String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<UserInformation,String>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<UserInformation,String>("age"));
        moneyColumn.setCellValueFactory(new PropertyValueFactory<UserInformation,String>("money"));
        table.setItems(list);
    }

    public void ReturnToBank3(){
        try {
            main.changeScene("Bank3.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
