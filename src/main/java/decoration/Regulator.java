package decoration;
import DecoratorPatternEquipment.Equipment;
public class Regulator extends EquipDecorator {
    Equipment equip;
    String col = "white";
    public Regulator(Equipment equip){
        this.equip = equip;
    }
    public String getDescription() {
        return equip.getDescription()+", regulator";
    }
    public String color() {
        return col+equip.color();
    }
}
