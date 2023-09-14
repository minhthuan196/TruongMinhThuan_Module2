package bai8_Clean_code.bai_tap.Refactoring;

public class TennisGame {
    public static final String SCORE0 = "Love";
    public static final String SCORE1 = "Fifteen";
    public static final String SCORE2 = "Thirty";
    public static final String SCORE3 = "Forty";
    public static final String ALL = "-All";
    public static final String DEUCE = "Deuce";

    public static String drawPlayerDisplay(int playerScore) {
        String resultDisplay;
        switch (playerScore) {
            case 0:
                resultDisplay = SCORE0 + ALL;
                break;
            case 1:
                resultDisplay = SCORE1 + ALL;
                break;
            case 2:
                resultDisplay = SCORE2 + ALL;
                break;
            case 3:
                resultDisplay = SCORE3 + ALL;
                break;
            default:
                resultDisplay = DEUCE;
                break;
        }
        return resultDisplay;
    }

    public static String matchPlayerDisplay(int playerScore) {
        String resultScore = "";
        switch (playerScore) {
            case 0:
                resultScore = SCORE0;
                break;
            case 1:
                resultScore = SCORE1;
                break;
            case 2:
                resultScore = SCORE2;
                break;
            case 3:
                resultScore = SCORE3;
        }
        return resultScore;
    }

    public static String winPlayerDisplay(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return drawPlayerDisplay(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) {
                return "Advantage player1";
            } else if (minusResult == -1) {
                return "Advantage player2";
            } else if (minusResult >= 2) {
                return "Win for player1";
            } else {
                return "Win for player2";
            }
        } else {
            return matchPlayerDisplay(player1Score) + "-" + matchPlayerDisplay(player2Score);
        }
    }

    public static void main(String[] args) {
        System.out.println(winPlayerDisplay(3, 2));
        System.out.println(winPlayerDisplay(3, 3));
        System.out.println(winPlayerDisplay(4, 4));
        System.out.println(winPlayerDisplay(5, 2));
        System.out.println(winPlayerDisplay(2, 6));
    }
}
