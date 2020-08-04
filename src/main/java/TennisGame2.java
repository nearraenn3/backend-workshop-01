public class TennisGame2 {
    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String[] textScores = {"Love", "Fifteen", "Thirty", "Forty"};

        // Advantage case
        if (player1Point > player2Point && player2Point >= 3 && (player1Point - player2Point) == 1) {
            return "Advantage " + player1Name;
        }

        if (player2Point > player1Point && player1Point >= 3 && (player2Point - player1Point) == 1) {
            return "Advantage " + player2Name;
        }

        //เสมอกัน
        boolean isEqualBeforeDeuce = player1Point == player2Point && player1Point < 3;
        if (isEqualBeforeDeuce) {
            return textScores[player1Point] + "-All";
        }
        boolean isDeuce = player1Point == player2Point;
        if (isDeuce) {
            return "Deuce";
        }

        // Winner case
        if (player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2) {
            return "Win for " + player1Name;
        }
        if (player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2) {
            return "Win for " + player2Name;
        }
        //Normal case
        return textScores[player1Point] + "-" + textScores[player2Point];
    }

    public void p1Score() {
        player1Point++;
    }

    public void p2Score() {
        player2Point++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player)) { //Null Safety
            p1Score();
        } else {
            p2Score();
        }
    }
}
