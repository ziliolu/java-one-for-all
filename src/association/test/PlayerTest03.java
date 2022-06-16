package association.test;

import association.domain.Player;
import association.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Pele");
        Player player2 = new Player("Cafu");
        Team team = new Team("Brazil's national team");
        Player[] players = {player1, player2};

        team.setPlayers(players);
        player1.setTeam(team);
        player2.setTeam(team);

        System.out.println("----player----");
        player1.print();
        System.out.println("----player----");
        player2.print();
        System.out.println("----team----");
        team.print();
    }
}
