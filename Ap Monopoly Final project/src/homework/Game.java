package homework;

import homework.action.GetPlayers;
import homework.action.TakeTurn;
import homework.model.Bank;
import homework.model.Money;
import homework.model.Property;
import java.util.List;

public class Game {

    public static void main(String[] args) {
        play();
    }

    public static void play() {

        Board board = new Board();
        Bank bank = new Bank();

        bank.setPropertyList( board.getPropertyList() );

        GetPlayers getPlayers = new GetPlayers();

        // ask for number of players and their PlayerPiece
        List<Player> players = getPlayers.getPlayers( board.getAvailablePieces(), board.getPropertyList().get( 0 ) );

        System.out.println( "Starting game with players: " );
        for ( Player player : players ) {
            printPlayer(player);
        }

        TakeTurn turn = new TakeTurn();
        for (int aa = 0; aa < 2; aa++ ) {
            for ( Player player : players ) {
                turn.go( player, board, bank );
            }
        }
        System.out.println( "Game Over");
        // now go thru the list and display the player properties and currency like printPlayer
        for ( Player player : players ) {
            printEndingPlayer( player );
        }

    }

    private static void printPlayer(Player player) {
        System.out.println( "Player Piece: " +  player.getPlayerPiece().toString() + " starting with currency: ");
        for (Money money : player.getMoney()) {
            System.out.println(money.getValue());
        }
        for (Property property : player.getPropertyList()) {
            System.out.println(property);
            System.out.println ("Has " + property.getHotelCount() + " hotels");
            System.out.println ("Has " + property.getHouseCount() + " houses");
        }

    }


    private static void printEndingPlayer(Player player) {
            System.out.println( "Player Piece: " +  player.getPlayerPiece().toString() + " ended with currency: ");
            for (Money money : player.getMoney()) {
                System.out.println(money.getValue());
            }
            for (Property property : player.getPropertyList()) {
                System.out.println(property);
                System.out.println ("Has " + property.getHotelCount() + " hotels");
                System.out.println ("Has " + property.getHouseCount() + " houses");
            }

    }

}
