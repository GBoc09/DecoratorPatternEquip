package decoration;
import DecoratorPatternEquipment.Equipment;
public class Finns extends EquipDecorator{
    Equipment equip;
    String col = "white";
    public Finns(Equipment equip){
        this.equip = equip;
    }
    public String getDescription() {
        return equip.getDescription()+", finns";
    }
    public String color() {
        return col+equip.color();
    }
}
