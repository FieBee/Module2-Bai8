
public class TennisGame {

    public static String getScore(int player1Score, int player2Score) {
        StringBuilder displayScore = new StringBuilder();
        int tempScore;
        int advantagePlayerScore = 1;
        int winScore = 2;
        if (player1Score == player2Score)
        {
            displayScore = new StringBuilder(switch (player1Score) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                case 3 -> "Forty-All";
                default -> "Deuce";
            });
        }

        else if (player1Score >= 4 || player2Score >= 4)
        {
            int minusResult = player1Score - player2Score;
            if (minusResult == advantagePlayerScore ) displayScore = new StringBuilder("Advantage player1");
            else if (minusResult ==-advantagePlayerScore) displayScore = new StringBuilder("Advantage player2");
            else if (minusResult >= winScore) displayScore = new StringBuilder("Win for player1");
            else displayScore = new StringBuilder("Win for player2");
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i == 1) tempScore = player1Score;
                else { displayScore.append("-"); tempScore = player2Score;}
                switch (tempScore) {
                    case 0 -> displayScore.append("Love");
                    case 1 -> displayScore.append("Fifteen");
                    case 2 -> displayScore.append("Thirty");
                    case 3 -> displayScore.append("Forty");
                }
            }
        }
        return displayScore.toString();
    }
}
