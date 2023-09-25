package bai16_IO_text_file.bai_tap.bt1_CopyFileText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {
    public List<String> readFile(String filePath) {
        List<String> characters = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                characters.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại!");
        }
        return characters;
    }
    public void writeFile(String filePath, List<String> data){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
