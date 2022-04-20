package banks.main;

public class EnterTheBank {
    Main main = new Main();
    public void addBankButton(){
        try {
            main.changeScene("AddBank.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
