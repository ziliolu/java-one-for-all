package association.test;

import association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {

        Player p1 = new Player("Pel");
        Player p2 = new Player("Romario");
        Player p3 = new Player("Cafu");


        //ways to create an array

        /* 1 -  Player[] players = new Player[3];
                players[0] = p1;
                players[1] = p2;
                players[2] = p3;        */

        // 2 - Player[] players = new Player[]{p1, p2, p3};

        // 3 -
        Player[] players = {p1,p2,p3};

        System.out.println(players.length);
        for (Player player : players){
            player.print();
        }

    }
}
