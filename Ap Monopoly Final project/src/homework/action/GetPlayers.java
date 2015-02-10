package homework.action;

import homework.Player;
import homework.model.Money;
import homework.model.PlayerPiece;
import homework.model.Property;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetPlayers {

    private static final String NAME_PROMPT = "Please type the player piece: or \'x\' to start the game";
    private Property startingProperty;

    public List<Player> getPlayers(List<PlayerPiece> availablePieces, Property startingProperty) {
        this.startingProperty = startingProperty;
        List<Player> players = new ArrayList<Player>();
        List<PlayerPiece> remaining = availablePieces;
        Scanner scanner = new Scanner( System.in );
        scanner.useDelimiter( System.getProperty( "line.separator" ) );

        System.out.println( NAME_PROMPT );
        System.out.println( displayRemainingPieces( remaining ) );
        while ( scanner.hasNext() ) {
            String input = scanner.next();

            try {
                if ( input.isEmpty() || input.equalsIgnoreCase( "x" ) ) {
                    return players;
                } else {
                    if ( checkPieceAvailable( input, remaining ) ) {
                        players.add( buildNewPlayer( input ) );
                    } else {
                        System.out.println( "Invalid selection, Please select from the remaining pieces" );
                    }
                }
            } catch ( Exception ex ) {
                System.out.println( "Invalid character, please enter a piece name or 'x' to start the game" );
            }
            System.out.println( NAME_PROMPT );
            System.out.println( displayRemainingPieces( remaining ) );
        }
        return players;
    }


    private Player buildNewPlayer(String input) {
        Player player = new Player();

        player.setPlayerPiece( PlayerPiece.getPiece( input ) );
        player.setCurrentProperty( this.startingProperty );

        List<Money> startingMoney = new ArrayList<Money>();
        startingMoney.add( Money.FIVE_HUNDRED );
        startingMoney.add( Money.FIVE_HUNDRED );

        startingMoney.add( Money.ONE_HUNDRED );
        startingMoney.add( Money.ONE_HUNDRED );

        startingMoney.add( Money.FIFTY );
        startingMoney.add( Money.FIFTY );

        startingMoney.add( Money.TWENTY );
        startingMoney.add( Money.TWENTY );
        startingMoney.add( Money.TWENTY );
        startingMoney.add( Money.TWENTY );
        startingMoney.add( Money.TWENTY );
        startingMoney.add( Money.TWENTY );

        startingMoney.add( Money.TEN );
        startingMoney.add( Money.TEN );
        startingMoney.add( Money.TEN );
        startingMoney.add( Money.TEN );
        startingMoney.add( Money.TEN );

        startingMoney.add( Money.FIVE );
        startingMoney.add( Money.FIVE );
        startingMoney.add( Money.FIVE );
        startingMoney.add( Money.FIVE );
        startingMoney.add( Money.FIVE );

        startingMoney.add( Money.ONE );
        startingMoney.add( Money.ONE );
        startingMoney.add( Money.ONE );
        startingMoney.add( Money.ONE );
        startingMoney.add( Money.ONE );

        player.setMoney( startingMoney );

        return player;
    }

    private boolean checkPieceAvailable(String input, List<PlayerPiece> remaining) {
        for ( PlayerPiece piece : remaining ) {
            if ( piece.toString().equalsIgnoreCase( input ) ) {
                remaining.remove( piece );
                return true;
            }
        }
        return false;
    }

    private String displayRemainingPieces(List<PlayerPiece> remainingPieces) {
        StringBuilder sb = new StringBuilder();
        String delim = "";
        for ( PlayerPiece piece : remainingPieces ) {
            sb.append( delim ).append( piece.prettyPrint( piece ) );
            delim = ", ";
        }

        return sb.toString();
    }


}
