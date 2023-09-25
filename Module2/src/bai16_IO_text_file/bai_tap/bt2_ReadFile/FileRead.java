package bai16_IO_text_file.bai_tap.bt2_ReadFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public List<String> readFile(String filePath) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            List<String> data = new ArrayList<>();
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                data.add(str);
            }
            return data;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
