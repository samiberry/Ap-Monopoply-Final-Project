package homework;

import homework.model.Die;
import homework.model.Money;
import homework.model.PlayerPiece;
import homework.model.Property;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private PlayerPiece playerPiece;
    List<Property> propertyList = new ArrayList<Property>();
    List<Money> money = new ArrayList<Money>();
    private Property currentProperty = null;

    public int rollDice(List<Die> dice) {
        int moveCount = 0;

        for (Die die: dice) {
            moveCount += die.roll();
        }

        return moveCount;
    }

    public PlayerPiece getPlayerPiece() {
        return playerPiece;
    }

    public boolean deduct(int amount) {
        // calculate total money player has
        if (amount > getCash()) {
            return false;
        } else {
            System.out.println("Deducted $" + amount + " from "+ playerPiece.toString()+" account");
            return true;
        }
    }

    public void add(int amount) {
        System.out.println("Added $" + amount + " to player account");

    }

    private int getCash() {
        int amount =0;
        for (Money cash: money) {
            amount += cash.getValue();
        }

        return amount;
    }

    public void setPlayerPiece(PlayerPiece playerPiece) {
        this.playerPiece = playerPiece;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public List<Money> getMoney() {
        return money;
    }

    public void setMoney(List<Money> money) {
        this.money = money;
    }

    public Property getCurrentProperty() {
        return currentProperty;
    }

    public void setCurrentProperty(Property currentProperty) {
        this.currentProperty = currentProperty;
    }
}
