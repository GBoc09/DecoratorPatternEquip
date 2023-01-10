package decoration;

import DecoratorPatternEquipment.Equipment;

public class Mask extends EquipDecorator{
    Equipment equip;
    String col = "white";
    public Mask(Equipment equip){
        this.equip = equip;
    }
    public String getDescription() {
        return equip.getDescription()+", mask";
    }
    public String color() {
        return col+equip.color();
    }

}
