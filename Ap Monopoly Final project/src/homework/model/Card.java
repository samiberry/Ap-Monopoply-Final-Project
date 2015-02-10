package homework.model;

import homework.ICard;
import homework.PropertyColor;

public class Card implements ICard {

    private CardType cardType;
    private PropertyColor propertyColor;
    private String text;
    private int rent;

    public Card(CardType cardType, PropertyColor propertyColor, String text, int rent) {
        this.cardType = cardType;
        this.propertyColor = propertyColor;
        this.text = text;
        this.rent = rent;
    }

    @Override
    public CardType getCardType() {
        return cardType;
    }

    @Override
    public PropertyColor getColor() {
        return propertyColor;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getRent() {
        return rent;
    }
}
