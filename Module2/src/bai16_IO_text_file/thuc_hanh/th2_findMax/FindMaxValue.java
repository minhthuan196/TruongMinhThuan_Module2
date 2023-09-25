package bai16_IO_text_file.thuc_hanh.th2_findMax;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Codegym\\module2\\Module2\\src\\bai16_IO_text_file\\thuc_hanh\\th2_findMax\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Codegym\\module2\\Module2\\src\\bai16_IO_text_file\\thuc_hanh\\th2_findMax\\result.txt", maxValue);
    }
}
