package banks.main;

public class HeadBank {
    Main main = new Main();


    public void UserRequestButton(){
        try {
            main.changeScene("RequestInHeadBank.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void HeadBankUserInformation(){
        try {
            main.changeScene("HeadBankUserInformation.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void DefinebillHeadBank(){
        try {
            main.changeScene("DefineBillforHeadBank.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void ReturnToMenu() {
        try {
            main.changeScene("Menu.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
