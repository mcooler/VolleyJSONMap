package onshirt.co.nz.volleyjsonmap;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GeoDataModel {



    private String type, properties;
    private Array coordinates;

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public Array getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Array coordinates) {
        this.coordinates = coordinates;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }
}
