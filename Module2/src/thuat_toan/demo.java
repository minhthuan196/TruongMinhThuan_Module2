package thuat_toan;

public class demo {
    public static String solution(String s) {
        String[] arr = s.split("");
        String result = arr[0].toLowerCase();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == (arr[i].toUpperCase())) {
                result += " " + arr[i].toLowerCase();
            } else {
                result += arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("CodegymDaNang"));
    }
}
