package decoration;
import DecoratorPatternEquipment.Equipment;
public class Suit extends EquipDecorator{
    Equipment equip;
    String col = "yellow";
    public String color() {
        return col+equip.color();
    }
    public Suit(Equipment equip){
        this.equip = equip;
    }
    public String getDescription() {
        return equip.getDescription()+", suit";
    }
}
