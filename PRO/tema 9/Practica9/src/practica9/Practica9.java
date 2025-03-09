package practica9;

import objects.*;
import forms.*;
import com.db4o.*;
//Gear(String name, String type, double price, int armourValue, boolean hasHelmet, int defuseTime)

//Weapons(String name, String type, double price, int damage, double armourPenetration, int fireRate, int magazineSize)

//Grenade(String name, String type, double price, String effect
public class Practica9 {

    public static void main(String[] args) {
        ObjectContainer gear = Db4oEmbedded.openFile("gear.db4o");
        ObjectContainer weapons = Db4oEmbedded.openFile("weapons.db4o");
        ObjectContainer grenades = Db4oEmbedded.openFile("grenades.db4o");

        //addGrenade(grenades);
        //changeGrenade(grenades);
        //showAllEquipments(gear, weapons, grenades);        
        MainForm mainForm = new MainForm(gear, weapons, grenades);
        mainForm.setVisible(true);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            gear.close();
            weapons.close();
            grenades.close();
            System.out.println("Bases de datos cerradas correctamente.");
        }));
    }

    public static void showAllEquipments(ObjectContainer gear, ObjectContainer weapons, ObjectContainer grenades) {
        ObjectSet gearR = gear.queryByExample(new Gear(null, null, 0, 0, null, 0));
        while (gearR.hasNext()) {
            System.out.println((Gear) gearR.next());
        }
        ObjectSet weaponR = weapons.queryByExample(new Weapon(null, null, 0, 0, 0, 0, 0));
        while (weaponR.hasNext()) {
            System.out.println((Weapon) weaponR.next());
        }
        ObjectSet grenadesR = grenades.queryByExample(new Grenade(null, null, 0, null));
        while (grenadesR.hasNext()) {
            System.out.println((Grenade) grenadesR.next());
        }
    }

    public static void addGrenade(ObjectContainer grenades) {
        grenades.store(new Grenade("TestName1", "TestType2", 200, "TestEffect3"));
        grenades.commit();
    }

    public static void changeGrenade(ObjectContainer grenades) {
        ObjectSet grenadesR = grenades.queryByExample(new Grenade("TestName", null, 0, null));
        while (grenadesR.hasNext()) {
            Grenade newGren = (Grenade) grenadesR.next();

            newGren.setPrice(newGren.getPrice() + 100);

            grenades.store(newGren);
        }
    }
}
