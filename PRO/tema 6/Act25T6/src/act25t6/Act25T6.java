package act25t6;
public class Act25T6 {
    public static void main(String[] args) {
        Viaje[] viaje = {new Viaje("001", "París", 7, "Hotel Lumière", "Todo Incluido", 1200.50),
                new Viaje("002", "Tokio", 10, "Hotel Sakura", "Desayuno Incluido", 2300.75),
                new Viaje("003", "Nueva York", 5, "Hotel Empire", "Solo Alojamiento", 1500.00),
                new Viaje("004", "Roma", 8, "Hotel Colosseo", "Media Pensión", 1800.90),
                new Viaje("005", "Berlín", 6, "Hotel Brandenburg", "Todo Incluido", 1600.30)
        }; 
        Form form = new Form(viaje);
        form.setVisible(true);
    }
}
