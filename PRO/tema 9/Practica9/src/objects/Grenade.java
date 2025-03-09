package objects;
public class Grenade extends Equipment {
    private String effect;

    public Grenade(String name, String type, double price, String effect) {
        super(name, type, price);
        this.effect = effect;
    }
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "Granade{Name=" + super.getName() + ", type=" + super.getType() + ", price=" + super.getPrice() + ", effect=" + effect + '}';
    }    
}
