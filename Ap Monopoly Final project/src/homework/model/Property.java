package homework.model;

import homework.PropertyColor;
import java.util.ArrayList;
import java.util.List;

public class Property extends AbstractProperty {

    private List<House> houses = new ArrayList<House>();
    private List<Hotel> hotels = new ArrayList<Hotel>();


    public Property(String propertyType, String name, PropertyColor color, int price) {
        setName( name );
        setColor( color );
        setPrice( price );
        setPropertyType( propertyType );
    }
}
