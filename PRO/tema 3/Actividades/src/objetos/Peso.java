package objetos;

public class Peso {
    private double kg; 
    
    public Peso(double peso, String medida) {
        switch (medida) {
            case "Lb":  
                this.kg = peso * 0.453592; 
                break;
            case "Li":  // Lingotes a kilogramos
                this.kg = peso * 14.59;
                break;
            case "Oz":  // Onzas a kilogramos
                this.kg = peso * 0.02835; 
                break;
            case "P":  // Peniques a kilogramos
                this.kg = peso * 0.00155;
                break;
            case "K":
                this.kg = peso;
                break;
            case "G": 
                this.kg = peso / 1000;
                break;
            case "Q":
                this.kg = peso * 43.3; 
                break;
            default:
                System.out.println("Medida no reconocida.");
                this.kg = 0;
                break;
        }
    }

    public double getLibras() {
        return this.kg / 0.453592;
    }

    public double getLingotes() {
        return this.kg / 14.59; 
    }

  
    public double getPeso(String medida) {
        switch (medida) {
            case "Lb":
                return getLibras();
            case "Li":
                return getLingotes(); 
            case "Oz":
                return (this.kg * 1000) / 28.35;
            case "P":
                return (this.kg * 1000) / 1.55; 
            case "K":
                return this.kg;
            case "G":
                return this.kg * 1000;
            case "Q":
                return this.kg / 43.3;
            default:
                return -1;
        }
    }
}
