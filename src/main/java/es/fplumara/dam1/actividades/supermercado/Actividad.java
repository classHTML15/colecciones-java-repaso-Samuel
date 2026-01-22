package es.fplumara.dam1.actividades.supermercado;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Actividad {

    public void procesarEscaneos(List<String> escaneos) {
        /*Set<String> productsUnique = new HashSet<>();*/
        Set<String> productsUnique = new TreeSet<>();

        int escaneosTotal = escaneos.size();
        int repeticionesTotal = 0;

        for (String escaneo : escaneos) {
            String normalazed = escaneo.trim().toLowerCase();
            if (productsUnique.contains(normalazed)) {
                System.out.printf("AÑADIDO %s%n", normalazed);
                repeticionesTotal++;
            }else {
                productsUnique.add(escaneo);
                System.out.printf("PRODUCTO %s%n", normalazed);
            }
        }
    }

}
