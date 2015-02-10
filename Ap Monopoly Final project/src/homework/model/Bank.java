package homework.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<House> houses = new ArrayList<House>(  );
    private List<Hotel> hotels = new ArrayList<Hotel>(  );
    private List<Property> propertyList = new ArrayList<Property>(  );

    private int taxableIncome = 0;

    public int paySalary() {
        return (int)(Math.random()*100) + 1;
    }

    public int payBonus() {
        return (int)(Math.random()*10) + 1;
    }

    public House buyHouse(int amount) {
        return new House();
    }

    public Hotel buyHotel(int amount) {
        return new Hotel();
    }

    public void collectTax(int taxAmount) {
        taxableIncome += taxAmount;
    }

    public void sellProperty(Property propertyToBuy) {
        propertyList.remove( propertyToBuy );
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }
}
