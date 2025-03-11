package practica9;

import forms.*;
import com.db4o.*;
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
            MainForm mainForm = new MainForm(gear, weapons, grenades, selectedAccount);
        }
    }
}
