package objects;
public class Account {
    private String login;
    private String password;
    private boolean admin;
    private boolean superAdmin;

    public Account(String login, String password, boolean admin, boolean superAdmin) {
        this.login = login;
        this.password = password;
        this.admin = admin;
        this.superAdmin = superAdmin;
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(boolean superAdmin) {
        this.superAdmin = superAdmin;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", password=" + password + ", admin=" + admin + ", superAdmin=" + superAdmin + '}';
    }
}
