package bai16_IO_text_file.bai_tap.bt2_ReadFile;


import java.util.ArrayList;
import java.util.List;

public class CountryTest {

    public static final String COUNTRIES_CSV = "D:\\Codegym\\module2\\Module2\\src\\bai16_IO_text_file\\bai_tap\\bt2_ReadFile\\countries.csv";

    public static void main(String[] args) {
        FileRead fileRead = new FileRead();
        try {
            List<String> list = fileRead.readFile(COUNTRIES_CSV);
            System.out.println(convertStringToCountry(list));
        } catch (RuntimeException e) {
            System.out.println("File doesn't exist");
        }
    }

    private static List<Country> convertStringToCountry(List<String> data) {
        List<Country> countries = new ArrayList<>();
        for (String str : data) {
            String[] splitStr = str.split(",");
            countries.add(new Country(Integer.parseInt(splitStr[0]), splitStr[1], splitStr[2]));
        }
        return countries;
    }
}
