package act15t6;
public class Editorial {
    private String codEditorial;
    private String nombreEditorial;
    private String poblacionEditorial;

    public String getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(String codEditorial) {
        this.codEditorial = codEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getPoblacionEditorial() {
        return poblacionEditorial;
    }

    public void setPoblacionEditorial(String poblacionEditorial) {
        this.poblacionEditorial = poblacionEditorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "codEditorial=" + codEditorial + ", nombreEditorial=" + nombreEditorial + ", poblacionEditorial=" + poblacionEditorial + '}';
    }

    public Editorial(String codEditorial, String nombreEditorial, String poblacionEditorial) {
        this.codEditorial = codEditorial;
        this.nombreEditorial = nombreEditorial;
        this.poblacionEditorial = poblacionEditorial;
    }
    
    
    
}
