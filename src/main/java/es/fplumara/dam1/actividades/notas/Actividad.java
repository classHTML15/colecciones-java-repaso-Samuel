package es.fplumara.dam1.actividades.notas;

import java.util.*;

public class Actividad {

    public void parteA_MapList(List<String> registros) {
        Map<String, List<Double>> notesStudents = new HashMap<>();
        for(String registro : registros) {
            String[] valores = registro.split(";");
            String dni = valores[0];
            Double note = Double.parseDouble(valores[2]);

            notesStudents.computeIfAbsent(dni, k -> new ArrayList<>()).add(note);


        }


    }

    public void parteB_MapMap_MaxPorAsignatura(List<String> registros) {

    }
}