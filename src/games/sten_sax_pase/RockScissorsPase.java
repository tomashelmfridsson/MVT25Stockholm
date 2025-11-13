package games.sten_sax_pase;

public class RockScissorsPase {
    private int wins;
    private int losses;
    private int draws;

    private String[] choices = {"STEN", "SAX", "PÅSE"};

    public String computerChoice() {
        return choices[(int) (Math.random() * 3)];
    }

    //Används i main med en parameter
    public String playRound(String playerChoice) {
        return play(playerChoice, computerChoice());
    }

    public String play(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            draws++;
            return "DRAW";
        }

        boolean win =
                (playerChoice.equals("STEN") && computerChoice.equals("SAX")) ||
                        (playerChoice.equals("SAX") && computerChoice.equals("PÅSE")) ||
                        (playerChoice.equals("PÅSE") && computerChoice.equals("STEN"));

        if (win) {
            wins++;
            return "WIN";
        }

        losses++;
        return "LOSS";
    }

    public int wins() {
        return wins;
    }

    public int losses() {
        return losses;
    }

    public int draws() {
        return draws;
    }
}

