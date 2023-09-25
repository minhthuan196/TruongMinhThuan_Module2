package bai16_IO_text_file.bai_tap.bt1_CopyFileText;

import java.util.List;

public class FileCopyTest {

    public static final String SOURCE_TXT = "D:\\Codegym\\module2\\Module2\\src\\bai16_IO_text_file\\bai_tap\\bt1_CopyFileText\\source.txt";
    public static final String TARGET_TXT = "D:\\Codegym\\module2\\Module2\\src\\bai16_IO_text_file\\bai_tap\\bt1_CopyFileText\\target.txt";

    public static int countSymbol(List<String> str) {
        int count = 0;

        for (String value : str) {
            String[] arrayLine = value.split("");
            count += arrayLine.length;
        }
        return count;
    }

    public static void main(String[] args) {
        FileCopy fileCopy = new FileCopy();
        try {
            List<String> list = fileCopy.readFile(SOURCE_TXT);
            fileCopy.writeFile(TARGET_TXT, list);
            System.out.println("Total symbol in file: " + countSymbol(list));
        } catch (RuntimeException e) {
            System.out.println("File doesn't exist");
        }
    }
}
