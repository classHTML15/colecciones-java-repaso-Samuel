package es.fplumara.dam1.actividades.inventario;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> movimientos = List.of(
                "tornillos +50",
                "tuercas +30",
                "arandelas +25",
                "clavos +100",
                "tornillos -10",
                "tuercas -5",
                "clavos -40",
                "arandelas -30",
                "cinta_aislante +12",
                "cinta_aislante -2",
                "bridas +200",
                "bridas -50",
                "bridas -170",
                "pasta_termica +5",
                "pasta_termica -1",
                "pasta_termica -10",
                "alcohol_isopropilico +8",
                "alcohol_isopropilico -3",
                "alcohol_isopropilico +10",
                "destornillador +4",
                "destornillador -1",
                "destornillador -10",
                "cables_hdmi +15",
                "cables_hdmi +10",
                "cables_hdmi -8",
                "cables_usb +40",
                "cables_usb -5",
                "cables_usb -50",
                "grapas +500",
                "grapas -250",
                "grapas -260",
                "tornillos +7",
                "tuercas +3",
                "clavos +15",
                "arandelas +1",
                "memorias_usb +20",
                "memorias_usb -7",
                "memorias_usb -30",
                "ratones +12",
                "ratones -2",
                "teclados +8",
                "teclados -9"
        );

        Actividad actividad = new Actividad();
        actividad.procesarMovimientos(movimientos);

        /*System.out.println("INVENTARIO FINAL");
        for (Map.Entry<String, Integer> entry : productosInventario.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/
    }
}
