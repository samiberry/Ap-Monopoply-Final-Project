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
