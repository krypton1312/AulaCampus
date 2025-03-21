package objects;
public class Account {
    private String login;
    private String password;
    private Boolean admin;
    private Boolean superAdmin;
    private Boolean isPromotionRequest;

    public Account(String login, String password, Boolean admin, Boolean superAdmin, Boolean isPromotionRequest) {
        this.login = login;
        this.password = password;
        this.admin = admin;
        this.superAdmin = superAdmin;
        this.isPromotionRequest = isPromotionRequest;
    }

    public Boolean isIsPromotionRequest() {
        return isPromotionRequest;
    }

    public void setIsPromotionRequest(Boolean isPromotionRequest) {
        this.isPromotionRequest = isPromotionRequest;
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

    public Boolean isAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean isSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "login=" + login + ", password=" + password + ", admin=" + admin + ", superAdmin=" + superAdmin + ", isPromotionRequest=" + isPromotionRequest + '}';
    }

    
}
