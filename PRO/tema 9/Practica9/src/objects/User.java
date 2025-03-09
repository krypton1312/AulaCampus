package objects;
public class User {
    private String login;
    private String password;
    private boolean isAdmin;
    private boolean isSuperAdmin;

    public User(String login, String password, boolean isAdmin, boolean isSuperAdmin) {
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isSuperAdmin = isSuperAdmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isIsSuperAdmin() {
        return isSuperAdmin;
    }

    public void setIsSuperAdmin(boolean isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", password=" + password + ", isAdmin=" + isAdmin + ", isSuperAdmin=" + isSuperAdmin + '}';
    }
}
