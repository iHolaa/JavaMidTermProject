package banks.main;

public class Bank2 {
    Main main = new Main();



    public void Bank2UserInformation(){


    }

    public void DefinebillBank2(){
        try {
            main.changeScene("DefineBillforBank2.fxml");
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
