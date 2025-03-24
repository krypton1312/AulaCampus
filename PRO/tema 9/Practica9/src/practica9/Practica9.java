package practica9;

import com.db4o.*;
import forms.LoginForm;
import forms.MainForm;
import objects.Account;
//Gear(String name, String type, double price, int armourValue, boolean hasHelmet, int defuseTime)

//Weapons(String name, String type, double price, int damage, double armourPenetration, int fireRate, int magazineSize)
//Grenade(String name, String type, double price, String effect
public class Practica9 {

    public static void main(String[] args) {
        ObjectContainer user = Db4oEmbedded.openFile("users.db4o");
        ObjectContainer gear = Db4oEmbedded.openFile("gear.db4o");
        ObjectContainer weapons = Db4oEmbedded.openFile("weapons.db4o");
        ObjectContainer grenades = Db4oEmbedded.openFile("grenades.db4o");
        ObjectContainer description = Db4oEmbedded.openFile("description.db4o");

        /*user.store(new Account("user", "user", false, false, false));
        user.store(new Account("userPromoted", "", false, false, true));
        user.store(new Account("admin", "admin", true, false, false));
        user.store(new Account("admin1", "admin1", true, false, false));
        user.store(new Account("krypton", "krypton", true, true, false));
        user.store(new Account("user3", "user3", false, false, true));
        user.commit();*/
        
        LoginForm loginForm = new LoginForm(user);
        while(loginForm.isVisible()){
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        if(loginForm.isLoginSuccessfull){
            Account selectedAccount = loginForm.getSelectedAccount();
            System.out.println(selectedAccount);
            user.close();
            MainForm mainForm = new MainForm(gear, weapons, grenades, selectedAccount, description);
        }
    }
}
