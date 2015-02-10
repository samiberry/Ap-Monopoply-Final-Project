package homework.model;

import homework.IProperty;
import homework.Player;
import homework.PropertyColor;
import java.util.List;

public class AbstractProperty implements IProperty {

    private String name;
    private PropertyColor color;
    private int price;
    private int houseCount;
    private int hotelCount;
    private List<Player> playersOnProperty;
    private String propertyType;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PropertyColor getColor() {
        return color;
    }

    @Override
    public void setColor(PropertyColor color) {
        this.color = color;
    }

    @Override
    public int getPrice() {
        // this needs to consider hotels and houses
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public int getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(int houseCount) {
        this.houseCount = houseCount;
    }

    public int getHotelCount() {
        return hotelCount;
    }

    public void setHotelCount(int hotelCount) {
        this.hotelCount = hotelCount;
    }

    public List<Player> getPlayersOnProperty() {
        return playersOnProperty;
    }

    public void setPlayersOnProperty(List<Player> playersOnProperty) {
        this.playersOnProperty = playersOnProperty;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
