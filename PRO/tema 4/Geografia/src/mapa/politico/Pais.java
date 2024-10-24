package mapa.politico;

public class Pais {
    private String nombrePais;
    private String capital;
    private String moneda;
    private int habitantes;

    public Pais(String nombrePais, String capital, String moneda, int habitantes) {
        this.nombrePais = nombrePais;
        this.capital = capital;
        this.moneda = moneda;
        this.habitantes = habitantes;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + ", capital=" + capital + ", moneda=" + moneda + ", habitantes=" + habitantes + '}';
    }
    
    
}
