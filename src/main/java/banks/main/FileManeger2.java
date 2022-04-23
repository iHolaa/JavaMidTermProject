package banks.main;

import java.io.*;
import java.util.ArrayList;

public class FileManeger2 {
    //Write
    public void FileWriter(String filePath, String data) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Read
    public static void FileReader(String fileName, ArrayList<String> data){
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            data.add(br.readLine());
            br.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
