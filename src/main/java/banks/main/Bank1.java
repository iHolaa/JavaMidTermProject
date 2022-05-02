package banks.main;

public class Bank1 {
    Main main = new Main();


    public void Bank1UserInformation(){
        try {
            main.changeScene("Bank1UserInformation.fxml");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void DefinebillBank1(){
        try {
            main.changeScene("DefineBillforBank1.fxml");
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
