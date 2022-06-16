package association.test;

import association.domain.Player;
import association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Neymar");
        Team team1 = new Team("Brazil's national team");

        player1.setTeam(team1);
        player1.print();
    }
}
