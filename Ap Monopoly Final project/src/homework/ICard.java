package homework;

import homework.model.CardType;

public interface ICard {

    public CardType getCardType();

    public PropertyColor getColor();

    public String getText();

    public int getRent();

}