package act18t7;

public class Act18T7 {
    public static void main(String[] args) {
        double[][] precio = {{1, 15.5}, {2, 2.2}, {3, 1.5}, {4, 1.2}};
        double[][] pedido = {{3,30}, {1, 15}, {4,400}};
        System.out.println("Nº de Producto          Cantidad        Precio          Importe");
        double importe = 0;
        for(int i = 0; i < precio.length; i++){
            for(int j = 0; j < pedido.length; j++){
                if(precio[i][0] == pedido[j][0]){
                    importe += precio[i][1]*pedido[j][1];
                    System.out.println(pedido[j][0] + "\t\t\t" + pedido[j][1] + "\t\t" + precio[i][1] + "\t\t" + precio[i][1]*pedido[j][1]);
                }
            }
        }
        System.out.println("\t\t\t\t\t\t Total: " + importe);
    }
}
