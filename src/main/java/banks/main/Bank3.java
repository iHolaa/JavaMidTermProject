package banks.main;

public class Bank3 {
    Main main = new Main();

    public void Bank3UserInformation(){
        try {
            main.changeScene("Bank3UserInformation.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void DefinebillBank3(){
        try {
            main.changeScene("DefineBillforBank3.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void ReturnToMenu(){
        try {
            main.changeScene("Menu.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
