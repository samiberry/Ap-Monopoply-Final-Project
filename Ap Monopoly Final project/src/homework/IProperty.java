package homework;

public interface IProperty {

    public static final String CHANCE = "Chance";
    public static final String COMMUNITY_CHEST = "Community Chest";
    public static final String GO_TO_JAIL = "Go to Jail";
    public static final String FREE_PARKING = "Free Parking";
    public static final String GO = "GO";
    public static final String INCOME_TAX = "Income Tax";
    public static final String PROPERTY = "Property";


    public String getName();

    public void setName(String name);

    public PropertyColor getColor();

    public void setColor(PropertyColor color);

    public int getPrice();

    public void setPrice(int price);

}