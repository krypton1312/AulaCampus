package objects;
public class Gear extends Equipment {
    private int armourValue;
    private Boolean hasHelmet;
    private int defuseTime;

    public Gear(String name, String type, double price, int armourValue, Boolean hasHelmet, int defuseTime) {
        super(name, type, price);
        this.armourValue = armourValue;
        this.hasHelmet = hasHelmet;
        this.defuseTime = defuseTime;
    }

    public int getArmourValue() {
        return armourValue;
    }

    public void setArmourValue(int armourValue) {
        this.armourValue = armourValue;
    }

    public Boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(Boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    public int getDefuseTime() {
        return defuseTime;
    }

    public void setDefuseTime(int defuseTime) {
        this.defuseTime = defuseTime;
    }

    @Override
    public String toString() {
        return "Gear{Name=" + super.getName() + ", type=" + super.getType() + ", price=" + super.getPrice() + ", armourValue=" + armourValue + ", hasHelmet=" + hasHelmet + ", defuseTime=" + defuseTime + '}';
    }
}
