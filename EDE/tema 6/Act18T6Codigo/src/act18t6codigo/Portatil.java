package act18t6codigo;
public class Portatil extends Equipo {
    private String cpu;
    private String ram;
    private String hd;

    public Portatil(String cpu, String ram, String hd, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
    }
    
    
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return super.toString() + "Portatil{" + "cpu=" + cpu + ", ram=" + ram + ", hd=" + hd + '}';
    }
    
}
