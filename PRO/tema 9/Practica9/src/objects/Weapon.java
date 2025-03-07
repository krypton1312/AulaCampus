package objects;
public class Weapon extends Equipment {
    private int damage;
    private double armourPenetration;
    private int fireRate;
    private int magazineSize;

    public Weapon(String name, String type, double price, int damage, double armourPenetration, int fireRate, int magazineSize) {
        super(name, type, price);
        this.damage = damage;
        this.armourPenetration = armourPenetration;
        this.fireRate = fireRate;
        this.magazineSize = magazineSize;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getArmourPenetration() {
        return armourPenetration;
    }

    public void setArmourPenetration(double armourPenetration) {
        this.armourPenetration = armourPenetration;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public int getMagazineSize() {
        return magazineSize;
    }

    public void setMagazineSize(int magazineSize) {
        this.magazineSize = magazineSize;
    }

    @Override
    public String toString() {
        return "Weapons{Name=" + super.getName() + ", type=" + super.getType() + ", price=" + super.getPrice() + ", damage=" + damage + ", armourPenetration=" + armourPenetration + ", fireRate=" + fireRate + ", magazineSize=" + magazineSize + '}';
    }
}
