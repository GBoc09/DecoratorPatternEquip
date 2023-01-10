import DecoratorPatternEquipment.Equipment;

public class Gav  extends Equipment {
    String col = "black";
    public Gav() {
        description = "Giubetto ad Assetto Variabile";
    }
    public String color() {
        return col;
    }
}
