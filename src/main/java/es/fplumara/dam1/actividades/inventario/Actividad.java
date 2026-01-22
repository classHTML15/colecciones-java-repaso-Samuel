package es.fplumara.dam1.actividades.inventario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Actividad {

    public void procesarMovimientos(List<String> movimientos) {
        Map <String, Integer> productosInventario = new HashMap<String, Integer>();
        for(String movimiento : movimientos) {
            String[] partes = movimiento.split("\\s+");
            String product = partes[0].toLowerCase();
            int change = Integer.parseInt(partes[1]);

            int actualStock = productosInventario.getOrDefault(product, 0);
            int nuevoStock = actualStock + change;

            if(nuevoStock < 0) {
                System.out.printf("AVISO: stock insuficiente de %s%n", product);
                nuevoStock = 0;
            }
            productosInventario.put(product, nuevoStock);
        }
    }
}
