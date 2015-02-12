package homework.action;

import java.util.Scanner;

import homework.Board;
import homework.IProperty;
import homework.Player;
import homework.model.Card;
import homework.model.Die;
import homework.model.Money;
import homework.model.Property;
import homework.model.Bank;

public class TakeTurn {

    public int go(Player player, Board board, Bank bank) {
        int moves = 0;

        for ( Die die : board.getDice() ) {
            moves += die.roll();
        }

        Property currentProperty = player.getCurrentProperty();
        int index = board.getPropertyList().indexOf( currentProperty );

        int newLocation = moves + index;
        if (newLocation > board.getPropertyList().size()) {
            newLocation = newLocation -board.getPropertyList().size();
        }

        Property newProperty = board.getPropertyList().get( newLocation );
        player.setCurrentProperty( newProperty );

        handlePropertyType(newProperty, player, board, bank);

        return moves;
    }

    private void handlePropertyType(Property property, Player player, Board board, Bank bank) {
        if ( property.getPropertyType().equalsIgnoreCase( IProperty.GO_TO_JAIL ) ) {
            System.out.println(player.getPlayerPiece().toString() + "  landed on Go To Jail!" );
        } else if ( property.getPropertyType().equalsIgnoreCase( IProperty.INCOME_TAX ) ) {
            System.out.println( player.getPlayerPiece().toString() + " landed on Income tax, you lose $" + property.getPrice() + "!" );
            player.getMoney().remove( Money.ONE_HUNDRED );
            player.getMoney().remove( Money.ONE_HUNDRED );
        } else if ( property.getPropertyType().equalsIgnoreCase( IProperty.COMMUNITY_CHEST ) ) {
            int cardNum = (int) ( Math.random() * 12 ) + 1;
            Card communityCard = board.getCommunityCards().get( cardNum );
            System.out.println( player.getPlayerPiece().toString() + " landed on Community Chest, your card is:" + communityCard.getText() );
        } else if ( property.getPropertyType().equalsIgnoreCase( IProperty.CHANCE ) ) {
            int cardNum = (int) ( Math.random() * 8 ) + 1;
            Card communityCard = board.getChanceCards().get( cardNum );
            System.out.println( player.getPlayerPiece().toString() + " landed on Community Chest, your card is:" + communityCard.getText() );
        } else if ( property.getPropertyType().equalsIgnoreCase( IProperty.PROPERTY ) ) {

            System.out.println(player.getPlayerPiece().toString() +  " landed on " + property.getName() );
            if (bank.getPropertyList().contains( property ) ) {
                System.out.println("Would you like to buy this property for $" + property.getPrice());
                Scanner scanner = new Scanner(System.in);
                scanner.useDelimiter(System.getProperty("lines.separator"));
                while(scanner.hasNext())
                {
                	System.out.println("Would you like to buy this property for $" + property.getPrice());
                	String input = scanner.next();
                	if(input.equalsIgnoreCase("yes"))
                	{
                		
                		player.getPropertyList().add(property);
                	}
                }

               // do the scanner piece here for y/n
                // if yes, then remove $200 from their account like we did above on Income Tax
            } else {
                System.out.println("This property is already owned, please pay your rent of $" + property.getPrice());
            }
        }

    }
}
