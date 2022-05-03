package banks.main;

import java.io.IOException;

public class MoneyTransferController {
    Main main = new Main();
    public void IntrabankTransfer(){
        try {
            main.changeScene("IntrabankTransfer.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void ShabaTransfer(){
        try {
            main.changeScene("ShabaTransfer.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void ReturnToMenu(){
        try {
            main.changeScene("Menu.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
